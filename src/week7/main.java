package week7;

public class main {
    public static void main(String[] args){
        
        String caseNumber = "HC123/2026";

        HighCourt highCourt = new HighCourt("Nairobi High Court", "Justice");
        HighCourt highCourt1 = new HighCourt("Nairobi High Court", "Jane");
        
        highCourt.registerCase();
        highCourt.courtType();
        highCourt.conductHearing();
        highCourt.deliverJudgment();

        System.out.println("Case Number: " + caseNumber);

        highCourt1.registerCase();

        Court.showTotalCases();
    }

}
