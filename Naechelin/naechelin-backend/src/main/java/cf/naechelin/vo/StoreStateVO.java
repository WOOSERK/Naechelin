package cf.naechelin.vo;

import java.util.Objects;

public class StoreStateVO {
    private String storeStateType;
    private String storeStateName;

    public StoreStateVO(){}

    public StoreStateVO(String storeStateType, String storeStateName) {
        this.storeStateType = storeStateType;
        this.storeStateName = storeStateName;
    }

    public String getStoreStateType() {
        return storeStateType;
    }

    public void setStoreStateType(String storeStateType) {
        this.storeStateType = storeStateType;
    }

    public String getStoreStateName() {
        return storeStateName;
    }

    public void setStoreStateName(String storeStateName) {
        this.storeStateName = storeStateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreStateVO that = (StoreStateVO) o;
        return Objects.equals(storeStateType, that.storeStateType) &&
                Objects.equals(storeStateName, that.storeStateName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeStateType, storeStateName);
    }

    @Override
    public String toString() {
        return "StoreStateVO{" +
                "storeStateType='" + storeStateType + '\'' +
                ", storeStateName='" + storeStateName + '\'' +
                '}';
    }
}
