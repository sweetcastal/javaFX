package org.example.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.Main;
import org.example.entity.Staff;
import org.example.util.FileUtil;

import java.io.IOException;
import java.util.List;

public class MainController {

    @FXML
    private TableView<Staff> tableView;
    @FXML
    private TableColumn<Staff,String> name;
    @FXML
    private TableColumn<Staff,String> idcard;
    @FXML
    private TableColumn<Staff,String> gender;
    @FXML
    private TableColumn<Staff,String> age;
    @FXML
    private TableColumn<Staff,String> position;
    @FXML
    private TableColumn<Staff,String> birthday;
    @FXML
    private TableColumn<Staff,String> depart;
    @FXML
    private TableColumn<Staff,String> enterDate;

    @FXML
    public void initialize() throws IOException {
        getData();
    }

    private void getData(){
        List<Staff> staff = FileUtil.readData();
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        idcard.setCellValueFactory(new PropertyValueFactory<>("idcard"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        position.setCellValueFactory(new PropertyValueFactory<>("position"));
        birthday.setCellValueFactory(new PropertyValueFactory<>("birthday"));
        depart.setCellValueFactory(new PropertyValueFactory<>("depart"));
        enterDate.setCellValueFactory(new PropertyValueFactory<>("enterDate"));
        tableView.setItems(FXCollections.observableList(staff));
    }

    @FXML
    public void showAddView(){
        Main.addView("view/staff-add.fxml");
    }

    @FXML
    public void doDelete(){
        Staff staff = tableView.getSelectionModel().getSelectedItem();
        if(staff != null){
            FileUtil.deleteData(staff.getIdcard());
            getData();
        }

    }

    @FXML
    public void showUpdateView(){
        Staff staff = tableView.getSelectionModel().getSelectedItem();
        if(staff != null){
            StaffUpdateController.setCurrent(staff);
            Main.addView("view/staff-update.fxml");
        }
    }

    @FXML
    public void refresh(){
        getData();
    }



}
