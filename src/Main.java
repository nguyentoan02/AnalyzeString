
import controller.AnalysisController;
import model.AnalysisString;
import view.AnalysisView;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSII
 */
public class Main {
    public static void main(String[] args) {
        AnalysisString model = new AnalysisString();
        AnalysisView view = new AnalysisView();
        AnalysisController controller = new AnalysisController(model, view);

        controller.analyzeInput();
    }
}


