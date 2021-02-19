package cf.naechelin.controller;

import cf.naechelin.service.mission.MissionService;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

@Controller
public class MissionController
{
    private MissionService service;

    public String insert(HttpSession session)
    {
        return "insert";
    }

    public String update(HttpSession session)
    {
        return "update";
    }

    public String delete(HttpSession session)
    {
        return "delete";
    }

    public String view(HttpSession session)
    {
        return "view";
    }
}
