package userInterface;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;

public class SmileyFaceController {

    @FXML
    private Pane pane;
    
    @FXML
    private Circle head;



    @FXML
    private Circle eye1;

    @FXML
    private Circle eye2;
    
    @FXML
    void createFace(MouseEvent event) {
    	Circle mouse = new Circle(event.getX(), event.getY()+20, 30);
    	Circle eye1 =  new Circle(event.getX() -20, event.getY()-30, 5);
    	Circle head =  new Circle(event.getX(), event.getY(), 70);
    	Circle eye2 =  new Circle(event.getX() + 20, event.getY()-30, 5);
    	Rectangle eyeBrow1 = new Rectangle(event.getX()-35, event.getY()-50, 30, 5);
    	Rectangle eyeBrow2 = new Rectangle(event.getX()+10, event.getY()-50, 30, 5);
    	eyeBrow1.setFill(Color.BROWN);
    	eyeBrow2.setFill(Color.BROWN);
    	head.setFill(Color.YELLOW);
    	pane.getChildren().add(head);
    	pane.getChildren().add(mouse);
    	pane.getChildren().add(eye1);
    	pane.getChildren().add(eye2);
    	pane.getChildren().add(eyeBrow1);
    	pane.getChildren().add(eyeBrow2);
    }

}