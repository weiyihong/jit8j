package org.layz.erp.enums.type;

public enum ErpDisable implements ErpType{
    DISABLE(0,"无效"),
    ENABLE(1,"有效");

    private Integer value;
    private String name;

    ErpDisable(Integer value,String name) {
        this.value = value;
        this.name = name;
    }
    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }
}
