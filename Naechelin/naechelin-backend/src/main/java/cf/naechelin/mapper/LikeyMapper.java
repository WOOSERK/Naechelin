// Likey joenka 2020.08.15
package cf.naechelin.mapper;

import cf.naechelin.exception.LikeyException;
import cf.naechelin.vo.LikeyVO;
import cf.naechelin.vo.NaechelinStarVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;

import java.util.ArrayList;
import java.util.List;

public interface LikeyMapper
{
    void insert(LikeyVO likey)throws LikeyException;
    void delete(LikeyVO likey) throws LikeyException;
    ArrayList<NaechelinStarVO> likeyStoreList(QueryVO query)throws LikeyException;
}

