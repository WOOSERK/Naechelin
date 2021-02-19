package cf.naechelin.controller;

import cf.naechelin.service.coupon.CouponListService;
import cf.naechelin.service.coupon.CouponViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/coupon")
public class CouponController
{
    @Autowired
    @Qualifier("CouponList")
    private CouponListService listService;
    @Autowired
    @Qualifier("CouponView")
    private CouponViewService viewService;

    public CouponController() {}

    @RequestMapping(value = "/{couponId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("couponId") int couponId, HttpSession session)
    {
        return "delete";
    }

    @RequestMapping(value = "/{lineId}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("lineId") int lineId, HttpSession session)
    {
        ModelAndView view = new ModelAndView();
        view.setViewName("couponView");
        view.addObject("coupon", viewService.doService(lineId));

        return view;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list(HttpSession session)
    {
        ModelAndView view = new ModelAndView();
        view.setViewName("coupon");
        view.addObject("couponList", listService.doService());
        return view;
    }

    @RequestMapping(method = RequestMethod.HEAD)
    public String usedList(HttpSession session)
    {
        return "list";
    }
}
