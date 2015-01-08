package com.persononomo.Occupation;

import com.persononomo.Person;

public class Engineer extends Person {
    public int getKabinet() {
        return kabinet;
    }
    public void setKabinet(int kabinet) {
        this.kabinet = kabinet;
    }

    public int kabinet;

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    String department;

}
