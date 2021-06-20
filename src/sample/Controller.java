package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {

    @FXML
    private Tab phoneTab;
    @FXML
    private Tab computerTab;
    @FXML
    private ComboBox<String> phoneModelComboBox;
    @FXML
    private ComboBox<String>  phoneBrandComboBox;
    @FXML
    private ComboBox<String>  computerModelComboBox;
    @FXML
    private ComboBox<String>  computerBrandComboBox;
    @FXML
    private Button getProductsButton;
    @FXML
    private Button sortPriceButton;
    @FXML
    private Button compareButton;
    @FXML
    private TableView<Object> productListView;
    @FXML
    private TableColumn<Object,Float> priceColumn;
    @FXML
    private TableColumn<Object,String> featureColumn;
    @FXML
    private TableColumn<Object,String> productColumn;
    @FXML
    private TableView<Object> compareTable;
    @FXML
    private TableColumn<Object,String> computerBrand;
    @FXML
    private TableColumn<Object,Float> computerPrice;
    @FXML
    private TableColumn<Object,String> computerScreenSize;
    @FXML
    private TableColumn<Object,String> computerModel;
    @FXML
    private TableColumn<Object,String> screenResolution;
    @FXML
    private TableColumn<Object,String> processor;
    @FXML
    private TableColumn<Object,String> memory;
    @FXML
    private TableColumn<Object,String> storageCapacity;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if(true) {
            String url1 = "http://localhost:8080/";
            if (computerTab.isSelected())
                url1 += "getAllComputer";
            else
                url1 += "getAllPhone";
            String response = "";
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL("http://localhost:8080/getAllComputer").openConnection();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                connection.setRequestMethod("GET");
            } catch (ProtocolException e) {
                e.printStackTrace();
            }
            int responseCode = 0;
            try {
                responseCode = connection.getResponseCode();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (responseCode == 200) {
                Scanner scanner = null;
                try {
                    scanner = new Scanner(connection.getInputStream());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                boolean x = scanner.hasNextLine();
                while (scanner.hasNextLine()) {
                    response += scanner.nextLine();
                    response += "\n";
                }
                scanner.close();
            }
        }

    }
}
