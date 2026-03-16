package week7;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        
        String caseNumber = "HC123/2026";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Court name");
        String courtname = sc.next();

        System.out.println("Enter Judge name");
        String judgename = sc.next();

        HighCourt highCourt = new HighCourt(courtname, judgename);
        HighCourt highCourt1 = new HighCourt(courtname, judgename);
        
        highCourt.registerCase();
        highCourt.courtType();
        highCourt.conductHearing();
        highCourt.deliverJudgment();

        System.out.println("Case Number: " + caseNumber);

        highCourt1.registerCase();

        Court.showTotalCases();
    }

}
