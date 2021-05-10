package h8.chikey.controller;

import h8.chikey.dao.DAO;
import h8.chikey.daoimpl.ClientDaoImpl;
import h8.chikey.model.Client;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class MainController {

        @FXML
        private ScrollPane scrolpane;

        @FXML
        private TilePane tilepane;


        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        ObservableList<Client> list = FXCollections.observableArrayList();

        @FXML
        void initialize() throws IOException {
                DAO<Client,Integer> dao = new ClientDaoImpl(factory);
                list.addAll(dao.readAll());

                scrolpane.widthProperty().addListener((observableValue, number, t1) ->
                        tilepane.setPrefWidth(t1.doubleValue()));

                for (Client client: list) {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Cell.fxml"));
                        AnchorPane anchorPane = loader.load();
                        CellController controller = loader.getController();
                        controller.setItems(client);
                        tilepane.getChildren().add(anchorPane);
                }
        }
}
