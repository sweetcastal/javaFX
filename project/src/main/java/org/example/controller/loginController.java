package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.Main;
import org.example.util.StringUtil;

public class loginController {
    @FXML TextField account;
    @FXML TextField password ;
    @FXML Label errorInfo;
    @FXML
    public void initialize(){}

    @FXML
    public void dologin(){
        String accountText = account.getText();
        String passwordText = password.getText();
        if(StringUtil.isEmpty(accountText)){
            errorInfo.setText("请输入账户！！！");
            errorInfo.setVisible(true);
            return;
        }

        if(StringUtil.isEmpty(passwordText)){
            errorInfo.setText("请输入密码！！！");
            errorInfo.setVisible(true);
            return;
        }

        if(accountText.equals("admin") && passwordText.equals("123456")){
            Main.changeView("view/main.fxml");
        }else {
            errorInfo.setText("账户/密码错误");
            errorInfo.setVisible(true);
        }
    }
}
