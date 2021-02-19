package cf.naechelin.dao;

import cf.naechelin.vo.MissionVO;

import java.awt.image.BufferedImage;
import java.util.List;

public interface MissionDAO
{
    void insert(MissionVO mission);
    void update(MissionVO mission);
    void deleteByLineId(int lineId);
    MissionVO view(MissionVO mission);
    List<MissionVO> list(String condition, String word);
    BufferedImage createQR(MissionVO mission);
}
