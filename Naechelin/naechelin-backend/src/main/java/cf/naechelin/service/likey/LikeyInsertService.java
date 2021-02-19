package cf.naechelin.service.likey;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import org.springframework.stereotype.Service;


public interface LikeyInsertService extends LikeyService
{
    void doService(int memberId,int storeId)throws LikeyException;
}
