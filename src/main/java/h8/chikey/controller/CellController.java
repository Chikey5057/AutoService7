package h8.chikey.controller;

import h8.chikey.model.Client;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CellController {

    @FXML
    private Label txtName;

    @FXML
    private Label txtBirthday;

    @FXML
    private Label txtGender;

    @FXML
    private ImageView image;

    Client client = new Client();

    public void setItems(Client client){
        txtName.setText(client.getClientFirstName());
        txtBirthday.setText(client.getClientBirthday().toString());
        txtGender.setText(client.getGender().getGenderName());
        image.setImage(new Image("/"+client.getClientPhotoPath()));
    }
}
