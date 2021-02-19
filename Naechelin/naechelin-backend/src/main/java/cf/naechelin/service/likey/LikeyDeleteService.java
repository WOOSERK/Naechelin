package cf.naechelin.service.likey;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;

public interface LikeyDeleteService extends LikeyService
{
    void doService(int memberId,int storeId)throws LikeyException;
}
