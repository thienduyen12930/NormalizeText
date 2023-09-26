package view;

import controller.NormalizeTextController;
import model.NormalizeTextModel;

public class Main {

    public static void main(String[] args) {
        NormalizeTextModel model = new NormalizeTextModel();
        
        new NormalizeTextController(model).runMenu();
    }
    
}