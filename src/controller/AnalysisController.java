/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.AnalysisString;


/**
 *
 * @author MSII
 */
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import view.AnalysisView;

public class AnalysisController {
    private AnalysisString model;
    private AnalysisView view;

    public AnalysisController(AnalysisString model, AnalysisView view) {
        this.model = model;
        this.view = view;
    }

    public void analyzeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        HashMap<String, List<Integer>> numberAnalysis = model.getNumber(input);
        HashMap<String, StringBuilder> characterAnalysis = model.getCharacter(input);

        view.printAnalysisResults(numberAnalysis, characterAnalysis);
    }
}


