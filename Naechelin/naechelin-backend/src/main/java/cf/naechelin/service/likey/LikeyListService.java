package cf.naechelin.service.likey;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.NaechelinStarVO;
import cf.naechelin.vo.StoreVO;

import java.util.List;

public interface LikeyListService extends LikeyService
{
    List<NaechelinStarVO> doService(String condition, int intWord)throws LikeyException;
}
