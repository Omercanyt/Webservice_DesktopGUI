package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

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
}
