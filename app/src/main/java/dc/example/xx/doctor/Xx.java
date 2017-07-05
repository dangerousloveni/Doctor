package dc.example.xx.doctor;

import java.io.Serializable;

/**
 * Created by daier on 2017/3/9.
 */

public class Xx implements Serializable {
    private String building_num;
    private String room_num;
    private String bed_num;
    private int flag;

    private String tatol_soup;
    private String speed;
    private String residue_soup;
    private int imageID;

    public Xx(String num, String all, String rest, String building_num, String bed_num, String speed, int flag) {
        this.room_num = num;
        this.tatol_soup = all;
        this.residue_soup = rest;
        this.building_num = building_num;
        this.bed_num = bed_num;
        this.speed = speed;
        this.flag = flag;
        setImageID();
    }

    public void Reset(String rest, String speed) {
        this.residue_soup = rest;
        this.speed = speed;
        setImageID();
    }
    public void setImageID() {
        if (getRestNum() < 100) {
            imageID = R.drawable.redtubiao;
        } else {
            imageID = R.drawable.ss;
        }
    }

    public int getImageID() {
        return imageID;
    }

    public String getNum() {
        return room_num;
    }

    public String getAll() {
        return tatol_soup;
    }

    public String getRest() {
        return residue_soup;
    }

    public int getRestNum() {
        return Integer.parseInt(residue_soup);
    }

    public String getBuilding_num() {
        return building_num;
    }

    public String getBed_num() {
        return bed_num;
    }

    public int getFlag() {
        return flag;
    }

    public String getSpeed() {
        return speed;
    }


}
