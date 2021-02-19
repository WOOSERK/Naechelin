package cf.naechelin.mapper;

import cf.naechelin.vo.MissionVO;

public interface MissionMapper
{
    void insert(MissionVO mission);
    void deleteByLineId(int lineId);
}
