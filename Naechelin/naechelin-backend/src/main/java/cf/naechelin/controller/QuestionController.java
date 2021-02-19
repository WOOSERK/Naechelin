package cf.naechelin.controller;

import cf.naechelin.service.question.*;
import cf.naechelin.vo.AnswerVO;
import cf.naechelin.vo.QuestionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuestionController
{
    @Autowired
    @Qualifier("questionAnswerDeleteService")
    QuestionAnswerDeleteService questionAnswerDeleteService;

    @Autowired
    @Qualifier("questionAnswerInsertService")
    QuestionAnswerInsertService questionAnswerInsertService;

    @Autowired
    @Qualifier("questionDeleteService")
    QuestionDeleteService questionDeleteService;

    @Autowired
    @Qualifier("questionFindDetailService")
    QuestionFindDetailService questionFindDetailService;

    @Autowired
    @Qualifier("questionFindListService")
    QuestionFindListService questionFindListService;

    @Autowired
    @Qualifier("questionInsertService")
    QuestionInsertService questionInsertService;

    @Autowired
    @Qualifier("questionUpdateService")
    QuestionUpdateService questionUpdateService;

    @RequestMapping(value="/question", method=RequestMethod.GET)
    public String insert()
    {
        return "question/insert";
    }

    @RequestMapping(value="/question", method=RequestMethod.POST)
    public String insert(@ModelAttribute("questionInfo") QuestionVO question, Model model)
    {
        if(question.getQuestionTitle().trim().equals(""))
        {
            model.addAttribute("errorMessage", "문의글 제목을 입력하지 않으셨습니다.");
            return "question/insert";
        }

        if(question.getQuestionContent().trim().equals(""))
        {
            model.addAttribute("errorMessage", "문의글 내용을 입력하지 않으셨습니다.");
            return "question/insert";
        }

        questionInsertService.doService(question);
        return "question";
    }

    @RequestMapping(value="question/update", method=RequestMethod.GET)
    public String update()
    {
        return "question";
    }

    @RequestMapping(value="question/update", method=RequestMethod.PUT)
    public String update(@ModelAttribute("questionInfo") QuestionVO question, Model model)
    {
        if(question.getQuestionTitle().trim().equals(""))
        {
            model.addAttribute("errorMessage", "문의글 제목을 입력하지 않으셨습니다.");
            return "question/insert";
        }

        if(question.getQuestionContent().trim().equals(""))
        {
            model.addAttribute("errorMessage", "문의글 내용을 입력하지 않으셨습니다.");
            return "question/insert";
        }

        questionUpdateService.doService(question);
        return "question";
    }

    @RequestMapping(value="question/{memberId}", method=RequestMethod.DELETE)
    public String delete(@ModelAttribute("questionInfo") QuestionVO question)
    {
        questionDeleteService.doService(question);
        return "question";
    }

    @RequestMapping(method=RequestMethod.GET)
    public void findList(@ModelAttribute("questionInfo") QuestionVO question)
    {
        questionFindListService.doService(question);
    }

    @RequestMapping(value="question/{questionId}", method=RequestMethod.GET)
    public void findDetail(@ModelAttribute("questionInfo") QuestionVO question)
    {
        questionFindDetailService.doService(question);
    }

    @RequestMapping(value="answer/{questionId}", method=RequestMethod.GET)
    public String answerInsert()
    {
        return "answer";
    }

    @RequestMapping(value="answer/{questionId}", method=RequestMethod.POST)
    public String answerInsert(@ModelAttribute("answerInfo") AnswerVO answer, Model model)
    {
        if(answer.getAnswerContent().trim().equals(""))
        {
            model.addAttribute("errorMessage", "답변 내용이 작성되지 않았습니다.");
            return "answer/{questionId}";
        }

        questionAnswerInsertService.doService(answer);
        return "answer";
    }

    @RequestMapping(value="answer/{questionId}", method=RequestMethod.DELETE)
    public String answerDelete(@ModelAttribute("answerInfo") AnswerVO answer)
    {
        questionAnswerDeleteService.doService(answer);
        return "answer";
    }
}
