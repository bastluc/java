import models.*;
import controllers.*;
import views.*;

public class Main{
    public static void main(String[] args){
        Card.getSavedCollection();
        Frame frame = new Frame();
        frame.setVisible(true);
        MenuController.getIndex(frame);
    }
}