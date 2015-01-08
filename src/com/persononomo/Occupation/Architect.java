package com.persononomo.Occupation;

import com.persononomo.Person;

public class Architect extends Person {
    public Architect() {
        this.rank = 0;
    }
    public Architect(int i) {
        this.rank = i;
    }

   public static int rank;

   public int getKabinet() {
        return kabinet;
    }
   public void setKabinet(int kabinet) {
        this.kabinet = kabinet;
    }

   public int kabinet;
}