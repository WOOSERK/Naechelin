package cf.naechelin.dao;

import cf.naechelin.vo.LineVO;
import cf.naechelin.vo.QueryVO;

import java.awt.image.BufferedImage;
import java.util.List;

public interface LineDAO
{
    void insert(LineVO line);
    void update(LineVO line);
    void delete(int lineId);
    LineVO view(int lineId);
    List<LineVO> list(QueryVO query);
    BufferedImage createQR(LineVO line);
}
