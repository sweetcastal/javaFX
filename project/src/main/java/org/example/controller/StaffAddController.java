package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.example.entity.Staff;
import org.example.util.FileUtil;

public class StaffAddController{
    @FXML private TextField name;
    @FXML private TextField idcard;
    @FXML  private ChoiceBox<String> gender;
    @FXML  private TextField age;
    @FXML  private TextField position;
    @FXML private DatePicker birthday;
    @FXML  private TextField depart;
    @FXML  private DatePicker enterDate;

    @FXML
    public void initialize(){
        gender.getItems().clear();
        gender.getItems().addAll("男","女");
    }

    //新增的逻辑
    @FXML
    public void addDataToFile(){
        Staff staff = new Staff(name.getText(),idcard.getText(),gender.getValue(),
                age.getText(),position.getText(),birthday.getEditor().getText(),depart.getText(),enterDate.getEditor().getText());
        FileUtil.addData(staff);
    }

}
