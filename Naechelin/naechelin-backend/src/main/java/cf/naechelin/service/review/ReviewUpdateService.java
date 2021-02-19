package cf.naechelin.service.review;

import cf.naechelin.exception.ReviewException;

public interface ReviewUpdateService
{
    void doService(int memberId,int storeId)throws ReviewException;
}
