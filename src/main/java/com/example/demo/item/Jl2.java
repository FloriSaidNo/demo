package com.example.demo.item;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jl333")
public class Jl2 {
    private String sex;
    private String cm;
    private String kg;
    private String[] year;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCm() {
        return cm;
    }

    public void setCm(String cm) {
        this.cm = cm;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }

    public String[] getYear() {
        return year;
    }

    public void setYear(String[] year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Jl2=="+this.cm+"--"+this.kg;
    }
}
