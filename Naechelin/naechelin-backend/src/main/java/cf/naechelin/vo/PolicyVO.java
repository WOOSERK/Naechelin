package cf.naechelin.vo;

import java.util.Objects;

public class PolicyVO {
    private int storeId;
    private StoreVO store;
    private String policyDay;
    private String policyContent;

    public PolicyVO(){}

    public PolicyVO(int storeId, String policyDay, String policyContent)
    {
        this.storeId = storeId;
        this.policyDay = policyDay;
        this.policyContent = policyContent;
    }

    public PolicyVO(int storeId, StoreVO store, String policyDay, String policyContent) {
        this.storeId = storeId;
        this.store = store;
        this.policyDay = policyDay;
        this.policyContent = policyContent;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public StoreVO getStore() {
        return store;
    }

    public void setStore(StoreVO store) {
        this.store = store;
    }

    public String getPolicyDay() {
        return policyDay;
    }

    public void setPolicyDay(String policyDay) {
        this.policyDay = policyDay;
    }

    public String getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyVO policyVO = (PolicyVO) o;
        return storeId == policyVO.storeId &&
                Objects.equals(store, policyVO.store) &&
                Objects.equals(policyDay, policyVO.policyDay) &&
                Objects.equals(policyContent, policyVO.policyContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, store, policyDay, policyContent);
    }

    @Override
    public String toString() {
        return "PolicyVO{" +
                "storeId=" + storeId +
                ", store=" + store +
                ", policyDay='" + policyDay + '\'' +
                ", policyContent='" + policyContent + '\'' +
                '}';
    }
}
