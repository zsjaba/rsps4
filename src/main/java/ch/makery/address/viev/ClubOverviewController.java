package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ch.makery.address.MainApp;
import ch.makery.address.model.Club;

public class ClubOverviewController {
    @FXML
    private TableView<Club> ClubTable;
    @FXML
    private TableColumn<Club, String> SchoolColumn;
    @FXML
    private TableColumn<Club, String> clubColumn;

    @FXML
    private Label SchoolLabel;
    @FXML
    private Label clubLabel;
    @FXML
    private Label directorLabel;
    @FXML
    private Label phonenumberLabel;
    @FXML
    private Label adressLabel;
    @FXML
    private Label clubactivityLabel;
    @FXML
    private Label childnumberLabel;
    @FXML
    private Label cost;

    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ClubOverviewController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the Club table with the two columns.
        SchoolColumn.setCellValueFactory(cellData -> cellData.getValue().SchoolProperty());
        clubColumn.setCellValueFactory(cellData -> cellData.getValue().clubProperty());
    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        ClubTable.setItems(mainApp.getClubData());
    }
}