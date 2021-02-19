package cf.naechelin.service.line;

import cf.naechelin.dao.LineDAO;
import cf.naechelin.vo.LineVO;
import cf.naechelin.vo.QueryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("LineList")
public class LineListServiceImpl implements LineListService
{
    @Autowired
    @Qualifier("LineDAO")
    LineDAO dao;

    @Override
    public List<LineVO> doService()
    {
        return dao.list(new QueryVO());
    }
}
