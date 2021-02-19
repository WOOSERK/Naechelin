package cf.naechelin.controller;

import cf.naechelin.service.member.*;
import cf.naechelin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MemberController
{
    @Autowired
    @Qualifier("memberLoginService")
    MemberLoginService memberLoginService;

    @Autowired
    @Qualifier("memberSignUpService")
    MemberSignUpService memberSignUpService;

    @Autowired
    @Qualifier("memberSignOutService")
    MemberSignOutService memberSignOutService;

    @Autowired
    @Qualifier("memberUpdateService")
    MemberUpdateService memberUpdateService;

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(HttpServletRequest request, HttpSession session)
    {
        String email = request.getParameter("memberEmail");
        String pass = request.getParameter("memberPass");
        MemberVO member = memberLoginService.doService(email, pass);
        session.setAttribute("member", member);
        return "member/login";
    }

    @RequestMapping(value="/logout", method=RequestMethod.POST)
    public String logout(HttpSession session)
    {
        session.invalidate();
        return "member/logout";
    }

    @RequestMapping(value="/signup", method=RequestMethod.GET)
    public String signUp()
    {
        return "member/insert";
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public String signUp(@ModelAttribute("info") MemberVO member, Model model)
    {
        if(member.getMemberEmail().trim().equals(""))
        {
            model.addAttribute("errorMessage", "메일 주소가 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberPass().trim().equals(""))
        {
            model.addAttribute("errorMessage", "비밀번호가 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberBirth().equals(""))
        {
            model.addAttribute("errorMessage", "생년월일이 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberType().trim().equals(""))
        {
            model.addAttribute("errorMessage", "회원 종류가 설정되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberTel().trim().equals(""))
        {
            model.addAttribute("errorMessage", "회원 전화번호가 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberNick().trim().equals(""))
        {
            model.addAttribute("errorMessage", "회원의 닉네임이 입력되지 않았습니다.");
            return "member/insert";
        }

        memberSignUpService.doService(member);
        return "member/login";
    }

    @RequestMapping(value="/signout", method=RequestMethod.DELETE)
    public String signOut(@ModelAttribute("info") MemberVO member, Model model)
    {
        if(member.getMemberPass().trim().equals(""))
        {
            model.addAttribute("errorMessage", "비밀번호가 입력되지 않았습니다.");
            return "member/signout";
        }

        memberSignOutService.doService(member);
        return "member/login";
    }

    @RequestMapping(value="/signup/form", method=RequestMethod.GET)
    public String update()
    {
        return "member/update";
    }

    @RequestMapping(value="/signup", method=RequestMethod.PUT)
    public String update(@ModelAttribute("info") MemberVO member, Model model)
    {
        if(member.getMemberEmail().trim().equals(""))
        {
            model.addAttribute("errorMessage", "메일 주소가 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberPass().trim().equals(""))
        {
            model.addAttribute("errorMessage", "비밀번호가 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberBirth().equals(""))
        {
            model.addAttribute("errorMessage", "생년월일이 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberType().trim().equals(""))
        {
            model.addAttribute("errorMessage", "회원 종류가 설정되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberTel().trim().equals(""))
        {
            model.addAttribute("errorMessage", "회원 전화번호가 입력되지 않았습니다.");
            return "member/insert";
        }

        if(member.getMemberNick().trim().equals(""))
        {
            model.addAttribute("errorMessage", "회원의 닉네임이 입력되지 않았습니다.");
            return "member/insert";
        }

        memberUpdateService.doService(member);
        return "member/login";
    }

    /* public String typeList(Model model)
    {
        return "typeList";
    }
    */
}