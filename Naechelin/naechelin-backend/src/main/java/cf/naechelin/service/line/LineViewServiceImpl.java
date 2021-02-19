package cf.naechelin.service.line;

import cf.naechelin.dao.LineDAO;
import cf.naechelin.vo.LineVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("LineView")
public class LineViewServiceImpl implements LineViewService
{
    @Autowired
    @Qualifier("LineDAO")
    private LineDAO dao;

    @Override
    public LineVO doService(int lineId)
    {
        LineVO line = dao.view(lineId);
        line.setQR(dao.createQR(line));

        return line;
    }
}
