package com.wq.sbp.model;

import java.util.List;

public class Quote {

    private String carBrandName;

    private String carBrandLogo;

    private List<String> carpartList;

    private Integer id;

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandLogo() {
        return carBrandLogo;
    }

    public void setCarBrandLogo(String carBrandLogo) {
        this.carBrandLogo = carBrandLogo;
    }

    public List<String> getCarpartList() {
        return carpartList;
    }

    public void setCarpartList(List<String> carpartList) {
        this.carpartList = carpartList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
