package cf.naechelin.controller;

import cf.naechelin.service.line.LineDeleteService;
import cf.naechelin.service.line.LineInsertService;
import cf.naechelin.service.line.LineListService;
import cf.naechelin.service.line.LineViewService;
import cf.naechelin.vo.LineCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/line")
public class LineController
{
    @Autowired
    @Qualifier("LineInsert")
    private LineInsertService insertService;
    @Autowired
    @Qualifier("LineDelete")
    private LineDeleteService deleteService;
    @Autowired
    @Qualifier("LineView")
    private LineViewService viewService;
    @Autowired
    @Qualifier("LineList")
    private LineListService listService;

    // 라인 생성 폼
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String insert(Model model)
    {
        LineCommand lineCommand = new LineCommand();
        model.addAttribute("lineCommand", lineCommand);
        return "addLine";
    }

    // 라인 생성
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String insert(LineCommand lineCommand, HttpSession session)
    {
        // 유효성 검사
//        lineCommand.setMemberId((int)session.getAttribute("memberId"));
        insertService.doService(lineCommand);

        // 다시 리스트로 보냄
        return "redirect:/line";
    }

    @RequestMapping(value = "/{lineId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("lineId") int lineId, HttpSession session)
    {
        deleteService.doService(lineId);
        return "redirect:/line";
    }

    @RequestMapping(value = "/{lineId}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable("lineId") int lineId, HttpSession session)
    {
        ModelAndView view = new ModelAndView();

        view.setViewName("lineView");
        view.addObject("line", viewService.doService(lineId));
        return view;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView list(HttpSession session)
    {
        ModelAndView view = new ModelAndView();

        view.setViewName("line");
        view.addObject("lineList", listService.doService());
        return view;
    }
}
