/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author MSII
 */

import java.util.HashMap;
import java.util.List;

public class AnalysisView {
    public void printAnalysisResults(HashMap<String, List<Integer>> numberAnalysis, HashMap<String, StringBuilder> characterAnalysis) {
        System.out.println("Analysis Results:\n");

        for (String key : numberAnalysis.keySet()) {
            System.out.println(key + ": " + numberAnalysis.get(key));
        }

        for (String key : characterAnalysis.keySet()) {
            System.out.println(key + ": " + characterAnalysis.get(key));
        }
    }
}

