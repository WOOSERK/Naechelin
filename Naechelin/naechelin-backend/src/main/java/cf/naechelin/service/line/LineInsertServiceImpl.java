package cf.naechelin.service.line;

import cf.naechelin.dao.LineDAO;
import cf.naechelin.dao.MissionDAO;
import cf.naechelin.vo.LineCommand;
import cf.naechelin.vo.LineVO;
import cf.naechelin.vo.MissionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("LineInsert")
public class LineInsertServiceImpl implements LineInsertService
{
    public static final int missionNum = 3;
    @Autowired
    @Qualifier("LineDAO")
    private LineDAO lineDAO;
    @Autowired
    @Qualifier("MissionDAO")
    private MissionDAO missionDAO;

    @Override
    public void doService(LineCommand lineCommand)
    {
        LineVO line = new LineVO();
        line.setMemberId(1);
        lineDAO.insert(line);
        int lineId = line.getLineId();

        MissionVO missionVO = new MissionVO();
        missionVO.setLineId(lineId);

        List<Integer> storeIds = new ArrayList<>();
        storeIds.add(lineCommand.getStoreFirst());
        storeIds.add(lineCommand.getStoreSecond());
        storeIds.add(lineCommand.getStoreThird());

        for(int i=0; i<missionNum; i++)
        {
            missionVO.setMissionOrder(i+1);
            missionVO.setStoreId(storeIds.get(i));
            missionDAO.insert(missionVO);
        }
    }
}
