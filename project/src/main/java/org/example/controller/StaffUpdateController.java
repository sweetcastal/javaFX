package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.example.entity.Staff;
import org.example.util.FileUtil;

public class StaffUpdateController{
    @FXML private TextField name;
    @FXML private TextField idcard;
    @FXML  private ChoiceBox<String> gender;
    @FXML  private TextField age;
    @FXML  private TextField position;
    @FXML private DatePicker birthday;
    @FXML  private TextField depart;
    @FXML  private DatePicker enterDate;

    private static Staff current;
    static void setCurrent(Staff current){
        StaffUpdateController.current = current;
    }

    @FXML
    public void initialize(){
        gender.getItems().clear();
        gender.getItems().addAll("男","女");

        //把已有的数据回显出来
        name.setText(current.getName());
        idcard.setText(current.getIdcard());
        gender.setValue(current.getGender());
        age.setText(current.getAge());
        position.setText(current.getPosition());
        birthday.getEditor().setText(current.getBirthday());
        depart.setText(current.getDepart());
        enterDate.getEditor().setText(current.getEnterDate());
    }

    @FXML
    public void updateDataToFIle(){
        Staff staff = new Staff(name.getText(),idcard.getText(),gender.getValue(),
                age.getText(),position.getText(),birthday.getEditor().getText(),depart.getText(),enterDate.getEditor().getText());
        FileUtil.updateData(staff);
    }

}
