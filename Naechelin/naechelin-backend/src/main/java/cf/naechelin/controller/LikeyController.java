package cf.naechelin.controller;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.service.likey.LikeyDeleteServiceImpl;
import cf.naechelin.service.likey.LikeyInsertServiceImpl;
import cf.naechelin.service.likey.LikeyListServiceImpl;
import cf.naechelin.vo.NaechelinStarVO;
import cf.naechelin.vo.ReviewVO;
import cf.naechelin.vo.StoreVO;
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
public class LikeyController
{
    @Autowired
    @Qualifier("likeyInsertService")
    LikeyInsertServiceImpl insertService;

    @Autowired
    @Qualifier("likeyDeleteService")
    LikeyDeleteServiceImpl deleteService;

    @Autowired
    @Qualifier("likeyListService")
    LikeyListServiceImpl listService;

    @RequestMapping(value="store/{storeId}/like", method = RequestMethod.POST)
    public void insert(HttpSession session, @PathVariable("storeId") int storeId, Model model){
        if(session == null) { return; }
        int memberId = Integer.parseInt(session.getAttribute("memberId").toString());
        insertService.doService(memberId,storeId);
        model.addAttribute("관심 목록 추가");
    }

    @RequestMapping(value="store/{storeId}/like", method = RequestMethod.DELETE)
    public void delete(HttpSession session, @PathVariable("storeId") int storeId,Model model){
        if(session == null) { return; }
        int memberId = Integer.parseInt(session.getAttribute("memberId").toString());
        insertService.doService(memberId,storeId);
        model.addAttribute("관심 목록 삭제");
    }

    @RequestMapping(value="likey/list", method = RequestMethod.GET)
    public void likeyList(HttpServletRequest request, HttpServletResponse response){
//        HttpSession session = request.getSession(false);
//        int  memberId = Integer.parseInt(session.getAttribute("memberId").toString());

        ArrayList<NaechelinStarVO> list = null;

        int memberId = 2;
        try
        {
            list = (ArrayList<NaechelinStarVO>)listService.doService("memberId",memberId);
        }
        catch(ReviewException e){
            e.printStackTrace();
        }
        JSONArray jArray = new JSONArray();
        JSONObject jObj = new JSONObject();
        try {
            for(NaechelinStarVO naechelin : list) {
                JSONObject jtemp = new JSONObject();
                jtemp.putAll(naechelin.convertMap());
                jArray.add(jtemp);
            }
            jObj.put("list",jArray);
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        PrintWriter out = null;

        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json");
            out = response.getWriter();
            out.println(jObj.toJSONString());

        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }

}
