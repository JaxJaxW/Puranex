package Attributes;

public class Alignment {

    private String study, faction, hero;
    public Alignment() {

    }

    public boolean setStudy(String _study) {
        _study = _study.toLowerCase();
        if (study.equals("sword") || study.equals("magic")) {
            study = _study;
            return true;
        } else {
            System.out.println("Please respond with either \"Sword\" or \"Magic\" and hit Enter to record your response.");
            return false;
        }
    }




}
