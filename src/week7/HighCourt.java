package week7;

public class HighCourt extends Court implements LegalProcedure {
    String judgeName;

    HighCourt(String courtName, String judgeName){
        super(courtName);
        this.judgeName = judgeName;

    }

    void courtType(){
        System.out.println("This is the High Court");
    }

    public void conductHearing(){
        System.out.println("Hearing Conducted by "+judgeName);
    }

    public void deliverJudgment(){
        System.out.println("Judgement delivered by "+judgeName);
    }

}
