package cf.naechelin.mapper;

import cf.naechelin.vo.LineVO;
import cf.naechelin.vo.QueryVO;

import java.util.List;

public interface LineMapper
{
    void insert(LineVO line);
    void update(LineVO line);
    void delete(int lineId);
    LineVO view(int lineId);
    List<LineVO> list(QueryVO query);
}
