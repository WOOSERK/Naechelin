package cf.naechelin.vo;

import java.util.HashMap;

public class NaechelinStarVO
{
    int storeId;
    int reviewRating;
    double storeLatitude;
    double storeLongitude;

    public NaechelinStarVO(){}

    public NaechelinStarVO(int storeId, int reviewRating, int storeLatitude, int storeLongitude)
    {
        this.storeId = storeId;
        this.reviewRating = reviewRating;
        this.storeLatitude = storeLatitude;
        this.storeLongitude = storeLongitude;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public int getReviewRating()
    {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating)
    {
        this.reviewRating = reviewRating;
    }

    public double getStoreLatitude()
    {
        return storeLatitude;
    }

    public void setStoreLatitude(double storeLatitude)
    {
        this.storeLatitude = storeLatitude;
    }

    public double getStoreLongitude()
    {
        return storeLongitude;
    }

    public void setStoreLongitude(double storeLongitude)
    {
        this.storeLongitude = storeLongitude;
    }

    public HashMap<String, Object> convertMap()
    {
        HashMap<String, Object> map = new HashMap<>();
        map.put("storeId", storeId);
        map.put("reviewRating", reviewRating);
        map.put("y", storeLatitude);
        map.put("x", storeLongitude);

        return map;
    }
}
