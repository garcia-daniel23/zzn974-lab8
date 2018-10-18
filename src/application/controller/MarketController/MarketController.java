package application.controller.MarketController;

import java.io.IOException;

import application.model.Cart.Cart;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
/**
 * 
 * @author Daniel
 *	This class takes you to the cart and recognizes when youve clicked any of the buttons
 */
public class MarketController 
{
	
	public static Cart cart = new Cart(Cart.itemMap);
	
	@FXML
	private AnchorPane rootPane;
	
	@FXML
	public void handleCart(ActionEvent event) throws IOException
	{
		Cart.add();
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/Cart.fxml"));
		rootPane.getChildren().setAll(pane);
		
	}
	
	@FXML
	public void handleAClick(ActionEvent event) throws IOException
	{
		Cart.A();
	}
	@FXML
	public void handleBClick(ActionEvent event) throws IOException
	{
		Cart.B();
	}
	@FXML
	public void handleCClick(ActionEvent event) throws IOException
	{
		Cart.C();
	}
	@FXML
	public void handleDClick(ActionEvent event) throws IOException
	{
		Cart.D();
	}
	@FXML
	public void handleEClick(ActionEvent event) throws IOException
	{
		Cart.E();
	}
	@FXML
	public void handleFClick(ActionEvent event) throws IOException
	{
		Cart.F();
	}
	@FXML
	public void handleGClick(ActionEvent event) throws IOException
	{
		Cart.G();
	}
	@FXML
	public void handleHClick(ActionEvent event) throws IOException
	{
		Cart.H();
	}
	@FXML
	public void handleIClick(ActionEvent event) throws IOException
	{
		Cart.I();
	}
	@FXML
	public void handleJClick(ActionEvent event) throws IOException
	{
		Cart.J();
	}
	@FXML
	public void handleKClick(ActionEvent event) throws IOException
	{
		Cart.K();
	}
	@FXML
	public void handleLClick(ActionEvent event) throws IOException
	{
		Cart.L();
	}
	

}
