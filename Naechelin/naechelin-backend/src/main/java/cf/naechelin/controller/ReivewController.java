package cf.naechelin.controller;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.service.review.*;
import cf.naechelin.vo.NaechelinStarVO;
import cf.naechelin.vo.ReviewVO;
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
public class ReivewController
{
    @Autowired
    @Qualifier("reviewInsertService")
    ReviewInsertService insertService;

    @Autowired
    @Qualifier("reviewUpdateService")
    ReviewUpdateService reviewUpdateService;

    @Autowired
    @Qualifier("reviewDeleteService")
    ReviewDeleteService deleteService;

    @Autowired
    @Qualifier("reviewDetailService")
    ReviewDetailService detailService;

    @Autowired
    @Qualifier("reviewListService")
    ReviewListService listService;

    @Autowired
    @Qualifier("viewNaechelinService")
    ViewNaechelinService naechelinService;

    @Autowired
    @Qualifier("naechelinGuideService")
    NaechelinGuideService naechelinGuideService;

    @RequestMapping(value="review/{storeId}", method = RequestMethod.GET)
    public String insert(HttpSession session, @PathVariable("storeId") int storeId)
    {
        return "review/insert";
    }

    @RequestMapping(value="review/{storeId}", method = RequestMethod.POST)
    public String insert(HttpServletRequest request, @PathVariable("storeId") int storeId, HttpServletResponse response)
    {
//        HttpSession session = request.getSession(false);
//        String mStr = (session.getAttribute("memberId")).toString();
//        if(mStr == null){
//            return "review/error";
//        }
//        int memberId = Integer.parseInt(mStr);
        String reviewPac1 = request.getParameter("reviewPac");
        System.out.println("reviewPac" +":"+reviewPac1);
        int memberId = Integer.parseInt(request.getParameter("writer"));// 나중에 지우기
        int reviewRating = Integer.parseInt(request.getParameter("reviewRating"));
        String reviewPhoto = request.getParameter("reviewPhoto");
        String reviewPac = request.getParameter("reviewPac");

        ReviewVO review = new ReviewVO();
        if(reviewPhoto!= null){
            review.setReviewPhoto(reviewPhoto);
        }
        review.setStoreId(storeId);
        review.setReviewPac(reviewPac);
        review.setReviewRating(reviewRating);
        try
        {
            insertService.doService(memberId, review);
        }
        catch(ReviewException e){
            //에러 페이지 띄우기
        }
        return "redirect:/";
    }

    @RequestMapping(value = "review/{storeId}",method = RequestMethod.DELETE)
    public String delete(HttpServletRequest request, @PathVariable("storeId") int storeId)
    {
        HttpSession session = request.getSession(false);
        String memberStr = (session.getAttribute("memberId")).toString();
        if(memberStr == null){
            return "review/error";
        }
        int memberId = Integer.parseInt(memberStr);
        try{
            deleteService.doService(memberId,storeId);
        }
        catch(ReviewException e){

        }
        return "redirect:/";
    }

    @RequestMapping(value="review/{storeId}",method=RequestMethod.HEAD)
    public String update(HttpSession session)
    {
        return "review/insert";
    }

    @RequestMapping(value="review/{storeId}",method=RequestMethod.PUT)
    public String update(HttpSession session, @PathVariable("storeId") int storeId){
        String memStr = session.getAttribute("memberId").toString();
        if(memStr == null){
            return "review/error";
        }
        int memberId = Integer.parseInt(memStr);
        try{
            reviewUpdateService.doService(memberId,storeId);
        }
        catch (ReviewException e){

        }
        return "redirect:/";
    }

    @RequestMapping(value = "review/{storeId}/list",method = RequestMethod.GET)
    public void list( HttpServletRequest request,@PathVariable("storeId") int storeId,HttpServletResponse response){
        ArrayList<ReviewVO> list= null;
        try
        {
            list = (ArrayList<ReviewVO>)listService.doService("storeId", storeId);
            ReviewVO review;
        }
        catch(ReviewException e){
            e.printStackTrace();
        }
        JSONArray jArray = new JSONArray();
        JSONObject jObj = new JSONObject();
        try {
            for(ReviewVO review : list) {
                JSONObject jtemp = new JSONObject();
                jtemp.putAll(review.convertMap());
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

    @RequestMapping(value = "/naechelin",method = RequestMethod.GET)
    public void Naechelin(HttpServletRequest request, HttpServletResponse response){
//        HttpSession session = request.getSession(false);
//        int memberId = Integer.parseInt(session.getAttribute("memberId").toString());
        System.out.println("naechelin");
        int memberId = 2;

        ArrayList<NaechelinStarVO> list = null;
        try
        {
            list = (ArrayList<NaechelinStarVO>) naechelinService.doService("memberId",memberId);
        }
        catch(ReviewException e){
            e.printStackTrace();
        }

        JSONArray jArray = new JSONArray();
        JSONObject jObj = new JSONObject();
        try {
            for(NaechelinStarVO naechelin : list) {
                System.out.println(naechelin.getStoreLongitude()+","+naechelin.getStoreLatitude());
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

    @RequestMapping(value = "/naechelin/all", method=RequestMethod.GET)
    public void naechelinGuide(HttpServletRequest request,HttpServletResponse response){
//        HttpSession session = request.getSession(false);
//        int memberId = Integer.parseInt(session.getAttribute("memberId").toString());

        System.out.println("guide");
        ArrayList<NaechelinStarVO> list = null;
        try
        {
            list = (ArrayList<NaechelinStarVO>) naechelinGuideService.doService();
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
