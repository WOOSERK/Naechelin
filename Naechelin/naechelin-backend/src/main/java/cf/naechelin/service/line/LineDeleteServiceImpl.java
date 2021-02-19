package cf.naechelin.service.line;

import cf.naechelin.dao.LineDAO;
import cf.naechelin.dao.MissionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("LineDelete")
public class LineDeleteServiceImpl implements LineDeleteService
{
    @Autowired
    @Qualifier("LineDAO")
    private LineDAO lineDAO;
    @Autowired
    @Qualifier("MissionDAO")
    private MissionDAO missionDAO;

    @Override
    public void doService(int lineId)
    {
        missionDAO.deleteByLineId(lineId);

        lineDAO.delete(lineId);
    }
}
