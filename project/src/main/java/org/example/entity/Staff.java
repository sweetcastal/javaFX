package org.example.entity;

import lombok.Data;

@Data
public class Staff {
    private String name;
    private String idcard;
    private  String gender;
    private  String age;
    private  String position;
    private  String birthday;
    private  String depart;
    private String enterDate;

    public Staff() {
    }

    public Staff(String name, String idcard, String gender, String age, String position, String birthday, String depart, String enterDate) {
        this.name = name;
        this.idcard = idcard;
        this.gender = gender;
        this.age = age;
        this.position = position;
        this.birthday = birthday;
        this.depart = depart;
        this.enterDate = enterDate;
    }

    @Override
    public String toString() {
        return name + ","
                + idcard + ","
                + gender + ","
                + age + ","
                + position + ","
                + birthday + ","
                + depart + ","
                + enterDate;
    }
}
