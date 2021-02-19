package cf.naechelin.controller;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.service.policy.*;
import cf.naechelin.vo.PolicyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/policy")
public class PolicyController
{
    @Autowired
    @Qualifier("policyInsertService")
    PolicyInsertService policyInsertService;

    @Autowired
    @Qualifier("policyDeleteService")
    PolicyDeleteService policyDeleteService;

    @Autowired
    @Qualifier("policyUpdateService")
    PolicyUpdateService policyUpdateService;

    @Autowired
    @Qualifier("policyViewService")
    PolicyViewService policyViewService;

    @Autowired
    @Qualifier("policyListService")
    PolicyListService policyListService;

    @RequestMapping( method = RequestMethod.GET)
    public String insert(HttpSession session)
    {
        if(session.getAttribute("member") == null){return "login";}
        if(session.getAttribute("policy") != "onlyOne"){ return "owner/home"; }
        return "policy/registerForm";
    }

    @RequestMapping( method =RequestMethod.POST)
    public String insert(HttpServletRequest request )
    {
        HttpSession session = request.getSession(false);

        if(session.getAttribute("member") == null){return "login";}
        if(session.getAttribute("policy") != "onlyOne"){ return "owner/home"; }
        int storeId = Integer.parseInt(request.getParameter("storeId"));
        String policyDay = request.getParameter("policyDay");
        String policyContent = request.getParameter("policyContent");
        try
        {
            policyInsertService.doService(storeId, policyDay,policyContent);
        }
        catch (StoreException e)
        {
            return "owner/error";
        }
        session.setAttribute("policy", "onlyOne");
        return "owner/home"; // 매장 추가와 쿠폰정책 추가가 성공적으로 완료됬다고 한다음에 홈으로 이동
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.GET)
    public String update(HttpServletRequest request, @PathVariable("storeId") int storeId, Model model)
    {
        HttpSession session = request.getSession(false);
        if(session.getAttribute("member") == null){ return "login";}
        PolicyVO policy = new PolicyVO();
        policy.setStoreId(storeId);
        try
        {
            policy = policyViewService.doService(policy);
            model.addAttribute(policy);

        }
        catch (StoreException e)
        {
            model.addAttribute("error" , e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "policy/registerForm";
    }
    //insert와 update모두 같은 registerForm을 사용하므로 jsp에서 model안에 내용있는지를 검사

    @RequestMapping(value = "/{storeId}", method = RequestMethod.POST)
    public String update(HttpServletRequest request, PolicyVO policy, Model model)
    {
        HttpSession session = request.getSession(false);
        if(session == null){ return "login"; }
        try
        {
            policyUpdateService.doService(policy);
            model.addAttribute(policy.getStoreId());
        }
        catch (StoreException e)
        {
            model.addAttribute("error", e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/store";
    }
    @RequestMapping(value = "/{storeId}", method = RequestMethod.DELETE)
    public String delete(HttpServletRequest request, @PathVariable("storeId") int storeId, Model model)
    {
        HttpSession session = request.getSession(false);
        if(session == null) {return "login";}
        PolicyVO policy = new PolicyVO();
        policy.setStoreId(storeId);
        try
        {
            policyDeleteService.doService(policy);
        }
        catch (StoreException e)
        {
            model.addAttribute("error", e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/store";
    }

    @RequestMapping(value = "/{storeId}/detail", method = RequestMethod.GET)
    public String view(HttpSession session, @PathVariable("storeId") int storeId, Model model)
    {
        if(session == null) { return "login"; }
        PolicyVO policy = new PolicyVO();
        policy.setStoreId(storeId);
        try
        {
            policy = policyViewService.doService(policy);
            model.addAttribute(policy);
        }
        catch (StoreException e)
        {
            model.addAttribute("error", e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "policy/detail";
    }
}
