package application.controller.CartController;

import java.io.IOException;
import application.model.Cart.Cart;
import application.model.Item.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
/**
 * 
 * @author Daniel
 *	This class takes you back to market or to checkout while changing vaules in fxml and adding information to the listview
 */
public class CartController 
{
	@FXML
	private AnchorPane rootPane1;
	
	@FXML
	private Label total;
	@FXML
	private ListView<Item> list;
	
	@FXML
	public void initialize() throws IOException
	{
		total.setText(Double.toString(Cart.total2.getPrice()));
		
		for(Item nebular : Cart.itemMap.values())
		{
			list.getItems().add(nebular);
		}
		
	}
	
	
	
	@FXML
	public void handleMarket(ActionEvent event) throws IOException
	{
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/Market.fxml"));
		rootPane1.getChildren().setAll(pane);
		
	}
	@FXML
	public void handleCheck(ActionEvent event) throws IOException
	{
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/Confirmation.fxml"));
		rootPane1.getChildren().setAll(pane);
	}
	

}
