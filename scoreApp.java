/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import java.util.*;

/**
 *
 * @author taruc
 */
public class scoreApp {
    private ArrayList<Integer> scoreList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void inputScore() {
        int score = 0;

        String instruction = "Enter a score (0..100, -1 to quit):";
        do{
            System.out.println(instruction);
            score = scanner.nextInt();
            if(score >= 0 && score <= 100){
                scoreList.add(score);
            }
        }while(score != -1);
    }
   
    
    public void displayList(){
        System.out.println("\nScore List:");
        for (int i = 0; i < scoreList.size(); i++) {
            System.out.println(scoreList.get(i));
        }
    }
    
    public int findLowest(){
        int lowestScore = 100;
        for (int i = 0; i <scoreList.size(); i++) {
            if(scoreList.get(i) < lowestScore){
                lowestScore = scoreList.get(i);
            }
        }
        return lowestScore;
    }
    
        public int findHighest(){
        int highestScore = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            if(scoreList.get(i) > highestScore){
                highestScore = scoreList.get(i);
            }
        }
        return highestScore;
    }
        
        public double findAvg(){
            int Avg = 0;
            for (int i = 0; i < scoreList.size(); i++) {
                Avg += scoreList.get(i);
            }
            return(double)Avg/scoreList.size();           
        }

    public static void main(String[] args) {
        scoreApp scoreApp = new scoreApp();
        scoreApp.inputScore();
        scoreApp.displayList();
    
        System.out.println("\nLowest Score :" + scoreApp.findLowest());
        System.out.println("\nHighest Score :" + scoreApp.findHighest());
        System.out.println("\n Avrage Score:" + scoreApp.findAvg());
    }
}


