package com.example.home_work_3_4;

public class Country {
    String country;
    String capital;
    String flag;

    public Country(String country, String capital, String flag) {
        this.country = country;
        this.capital = capital;
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
