package cf.naechelin.vo;

import java.util.HashMap;
import java.util.Objects;

public class StoreVO {
    private int storeId;
    private int memberId;
    private String storeBusinessNum;
    private String storeName;
    private String storeTypeType;
    private String storeAddress;
    private String storeAddressDetail;
    private String storeOwner;
    private String storeTel;
    private String storeFax;
    private String storeStateType;
    private String storeRegDate;
    private String storeEndDate;
    private double storeLatitude;
    private double storeLongitude;
    private MemberVO member;
    private StoreTypeVO storeType;
    private StoreStateVO storeState;

    public StoreVO(){

    }

    public StoreVO(int storeId, int memberId, String storeBusinessNum, String storeName, String storeTypeType, String storeAddress, String storeAddressDetail, String storeOwner, String storeTel, String storeFax, String storeStateType, String storeRegDate, String storeEndDate, double storeLatitude, double storeLongitude, MemberVO member, StoreTypeVO storeType, StoreStateVO storeState) {
        this.storeId = storeId;
        this.memberId = memberId;
        this.storeBusinessNum = storeBusinessNum;
        this.storeName = storeName;
        this.storeTypeType = storeTypeType;
        this.storeAddress = storeAddress;
        this.storeAddressDetail = storeAddressDetail;
        this.storeOwner = storeOwner;
        this.storeTel = storeTel;
        this.storeFax = storeFax;
        this.storeStateType = storeStateType;
        this.storeRegDate = storeRegDate;
        this.storeEndDate = storeEndDate;
        this.storeLatitude = storeLatitude;
        this.storeLongitude = storeLongitude;
        this.member = member;
        this.storeType = storeType;
        this.storeState = storeState;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getStoreBusinessNum() {
        return storeBusinessNum;
    }

    public void setStoreBusinessNum(String storeBusinessNum) {
        this.storeBusinessNum = storeBusinessNum;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreTypeType() {
        return storeTypeType;
    }

    public void setStoreTypeType(String storeTypeType) {
        this.storeTypeType = storeTypeType;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getStoreAddressDetail() {
        return storeAddressDetail;
    }

    public void setStoreAddressDetail(String storeAddressDetail) {
        this.storeAddressDetail = storeAddressDetail;
    }

    public String getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(String storeOwner) {
        this.storeOwner = storeOwner;
    }

    public String getStoreTel() {
        return storeTel;
    }

    public void setStoreTel(String storeTel) {
        this.storeTel = storeTel;
    }

    public String getStoreFax() {
        return storeFax;
    }

    public void setStoreFax(String storeFax) {
        this.storeFax = storeFax;
    }

    public String getStoreStateType() {
        return storeStateType;
    }

    public void setStoreStateType(String storeStateType) {
        this.storeStateType = storeStateType;
    }

    public String getStoreRegDate() { return storeRegDate; }

    public void setStoreRegDate(String storeRegDate) { this.storeRegDate = storeRegDate; }

    public String getStoreEndDate() {
        return storeEndDate;
    }

    public void setStoreEndDate(String storeEndDate) {
        this.storeEndDate = storeEndDate;
    }

    public double getStoreLatitude() {
        return storeLatitude;
    }

    public void setStoreLatitude(double storeLatitude) {
        this.storeLatitude = storeLatitude;
    }

    public double getStoreLongitude() {
        return storeLongitude;
    }

    public void setStoreLongitude(double storeLongitude) {
        this.storeLongitude = storeLongitude;
    }

    public MemberVO getMember() {
        return member;
    }

    public void setMember(MemberVO member) {
        this.member = member;
    }

    public StoreTypeVO getStoreType() {
        return storeType;
    }

    public void setStoreType(StoreTypeVO storeType) {
        this.storeType = storeType;
    }

    public StoreStateVO getStoreState() {
        return storeState;
    }

    public void setStoreState(StoreStateVO storeState) {
        this.storeState = storeState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreVO storeVO = (StoreVO) o;
        return storeId == storeVO.storeId &&
                memberId == storeVO.memberId &&
                Double.compare(storeVO.storeLatitude, storeLatitude) == 0 &&
                Double.compare(storeVO.storeLongitude, storeLongitude) == 0 &&
                Objects.equals(storeBusinessNum, storeVO.storeBusinessNum) &&
                Objects.equals(storeName, storeVO.storeName) &&
                Objects.equals(storeTypeType, storeVO.storeTypeType) &&
                Objects.equals(storeAddress, storeVO.storeAddress) &&
                Objects.equals(storeAddressDetail, storeVO.storeAddressDetail) &&
                Objects.equals(storeOwner, storeVO.storeOwner) &&
                Objects.equals(storeTel, storeVO.storeTel) &&
                Objects.equals(storeFax, storeVO.storeFax) &&
                Objects.equals(storeStateType, storeVO.storeStateType) &&
                Objects.equals(storeRegDate, storeVO.storeRegDate) &&
                Objects.equals(storeEndDate, storeVO.storeEndDate) &&
                Objects.equals(member, storeVO.member) &&
                Objects.equals(storeType, storeVO.storeType) &&
                Objects.equals(storeState, storeVO.storeState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, memberId, storeBusinessNum, storeName, storeTypeType, storeAddress, storeAddressDetail, storeOwner, storeTel, storeFax, storeStateType, storeRegDate, storeEndDate, storeLatitude, storeLongitude, member, storeType, storeState);
    }

    @Override
    public String toString() {
        return "StoreVO{" +
                "storeId=" + storeId +
                ", memberId=" + memberId +
                ", storeBusinessNum='" + storeBusinessNum + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeTypeType='" + storeTypeType + '\'' +
                ", storeAddress='" + storeAddress + '\'' +
                ", storeAddressDetail='" + storeAddressDetail + '\'' +
                ", storeOwner='" + storeOwner + '\'' +
                ", storeTel='" + storeTel + '\'' +
                ", storeFax='" + storeFax + '\'' +
                ", storeStateType='" + storeStateType + '\'' +
                ", storeRegDate='" + storeRegDate + '\'' +
                ", storeEndDate='" + storeEndDate + '\'' +
                ", storeLatitude=" + storeLatitude +
                ", storeLongitude=" + storeLongitude +
                ", member=" + member +
                ", storeType=" + storeType +
                ", storeState=" + storeState +
                '}';
    }

    public HashMap<String, Object> convertMap()
    {
        HashMap<String, Object> map = new HashMap<>();

        map.put("storeId", storeId);
        map.put("memberId", memberId);
        map.put("storeBusinessNum", storeBusinessNum);
        map.put("storeName", storeName);
        map.put("storeTypeType", storeTypeType);
        map.put("storeAddress", storeAddress);
        map.put("storeAddressDetail", storeAddressDetail);
        map.put("storeOwner", storeOwner);
        map.put("storeTel", storeTel);
        map.put("storeFax", storeFax);
        map.put("storeStateType", storeStateType);
        map.put("storeRegDate", storeRegDate);
        map.put("storeEndDate", storeEndDate);
        map.put("storeLatitude", storeLatitude);
        map.put("storeLongitude", storeLongitude);
        map.put("member", member);
        map.put("storeType", storeType);
        map.put("storeState", storeState);

        return map;
    }
}
