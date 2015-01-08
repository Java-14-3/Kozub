package com.persononomo.Occupation;

public class EngineerRemote extends Engineer {
    @Override
    public void workType(){
        System.out.println("Remote work!");
    }

    @Override
    public int getKabinet() {
        return 0;
    }
    @Override
    public void setKabinet(int kabinet) {
        this.kabinet = 0;
    }

}
