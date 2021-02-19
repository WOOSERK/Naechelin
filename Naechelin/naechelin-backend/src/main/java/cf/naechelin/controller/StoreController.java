package cf.naechelin.controller;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.service.store.*;
import cf.naechelin.vo.MemberVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import cf.naechelin.vo.VisitVO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/owner")
public class StoreController
{
    @Autowired
    @Qualifier("storeInsertRequestService")
    StoreInsertRequestService storeInsertRequestService;

    @Autowired
    @Qualifier("storeUpdateRequestService")
    StoreUpdateRequestService storeUpdateRequestService;

    @Autowired
    @Qualifier("storeDeleteRequestService")
    StoreDeleteRequestService storeDeleteRequestService;

    @Autowired
    @Qualifier("storeViewService")
    StoreViewService storeViewService;

    @Autowired
    @Qualifier("storeListByStoreTypeTypeService")
    StoreListByStoreTypeTypeService storeListByStoreStateTypeService;

    @Autowired
    @Qualifier("storeListByStoreTypeTypeService")
    StoreListByStoreTypeTypeService storeListByStoreTypeTypeService;

    @Autowired
    @Qualifier("storeListByMemberIdService")
    StoreListByMemberIdService storeListByMemberIdService;

    @Autowired
    @Qualifier("storeHowManyVisitsService")
    StoreHowManyVisitsService storeHowManyVisitsService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String insertRequest(HttpSession session, Model model)
    {
        MemberVO member = (MemberVO)(session.getAttribute("member"));
        if(member == null) {return "login"; }
        StoreVO store = new StoreVO();
        store.setMember(member);
        model.addAttribute("store", store);
        return "owner/registerForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String insertRequest(HttpServletRequest request, StoreVO store, Model model)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            storeInsertRequestService.doService(store);
        }
        catch (StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "redirect:/policy";
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.GET)
    public String updateRequest(HttpSession session, Model model, @PathVariable int storeId)
    {
        if(session.getAttribute("member") == null) { return "login"; }
        try
        {
            StoreVO store = storeViewService.doService(storeId);
            model.addAttribute("store", store);
        }
        catch (StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/registerForm";
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.POST)
    public String updateRequest(HttpServletRequest request, StoreVO store, Model model)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            storeUpdateRequestService.doService(store);
            model.addAttribute("store", store);
        }
        catch(StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/store";
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.DELETE)
    public String deleteRequest(HttpServletRequest request,  Model model, @PathVariable int storeId)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            StoreVO store = new StoreVO();
            store.setStoreId(storeId);
            storeDeleteRequestService.doService(store);
        }
        catch(StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/home";
    }

    @RequestMapping(value = "/{storeId}/view", method = RequestMethod.GET)
    public String view(HttpServletRequest request, Model model, @PathVariable int storeId)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            StoreVO store = storeViewService.doService(storeId);
            model.addAttribute("store",store);
            List<VisitVO> visits = storeHowManyVisitsService.doService(store);
            int num = visits.size();
            model.addAttribute("visits",num);
        }
        catch(StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }

        return "owner/store";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void list(HttpServletRequest request, HttpServletResponse response )
    {
        String callback = request.getParameter("callback"); // ㅇㅇㅇ

        ArrayList<StoreVO> storeList = null;
//        HttpSession session = request.getSession();
//        MemberVO member = (MemberVO)session.getAttribute("member");
//        if(member == null){ return "login"; }

        try
        {
            MemberVO member = new MemberVO();
            member.setMemberId(1);
            storeList = (ArrayList<StoreVO>)storeListByMemberIdService.doService(member);
            for( StoreVO store : storeList)
            {
                System.out.println(store);
            }
        }
        catch(StoreException e)
        {
            e.printStackTrace();
        }
        JSONArray jArray = new JSONArray();
        JSONObject jObj = new JSONObject();
        try {
            for(StoreVO store : storeList) {
                JSONObject jtemp = new JSONObject();
                jtemp.putAll(store.convertMap());
                jArray.add(jtemp);
            }
            jObj.put("storeList",jArray);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = null;

        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json");
            out = response.getWriter();
            out.println(callback+"("+jObj.toJSONString()+")");
            System.out.println("함수 종료");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
