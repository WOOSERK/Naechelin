package cf.naechelin.vo;

import java.util.Objects;

public class StoreTypeVO {
    private String storeTypeType;
    private String storeTypeName;

    public StoreTypeVO(){}

    public StoreTypeVO(String storeTypeType, String storeTypeName) {
        this.storeTypeType = storeTypeType;
        this.storeTypeName = storeTypeName;
    }

    public String getStoreTypeType() {
        return storeTypeType;
    }

    public void setStoreTypeType(String storeTypeType) {
        this.storeTypeType = storeTypeType;
    }

    public String getStoreTypeName() {
        return storeTypeName;
    }

    public void setStoreTypeName(String storeTypeName) {
        this.storeTypeName = storeTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreTypeVO that = (StoreTypeVO) o;
        return Objects.equals(storeTypeType, that.storeTypeType) &&
                Objects.equals(storeTypeName, that.storeTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeTypeType, storeTypeName);
    }

    @Override
    public String toString() {
        return "StoreTypeVO{" +
                "storeTypeType='" + storeTypeType + '\'' +
                ", storeTypeName='" + storeTypeName + '\'' +
                '}';
    }
}
