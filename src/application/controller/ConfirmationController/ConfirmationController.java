package application.controller.ConfirmationController;

import java.io.IOException;
import application.model.Cart.Cart;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
/**
 * 
 * @author Daniel
 *This class call the reciept to be made and takes you back to the market
 */
public class ConfirmationController 
{
	@FXML
	private AnchorPane rootPane2;
	@FXML
	public Label reciept;
	@FXML
	public Label total;
	/**
	 * Sets text for fxml and prints receipt
	 * @throws IOException
	 */
	@FXML
	public void initialize() throws IOException
	{
		total.setText(Double.toString(Cart.printReceipt().getPrice()));
		reciept.setText(Cart.name);
	}
	/**
	 * Takes you back to market and resets hashtable
	 * @param event
	 * @throws IOException
	 */
	@FXML
	public void handleMarket(ActionEvent event) throws IOException
	{
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/Market.fxml"));
		rootPane2.getChildren().setAll(pane);
		
		Cart.reset();
	}

}
