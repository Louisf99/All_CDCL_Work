public class SeniorInstructor extends Instructor {
    private String hiringTeam;

    public SeniorInstructor(String _name, String _cohort, String _moduleTeam, String _hiringTeam){
        super(_name, _cohort, _moduleTeam);
        hiringTeam = _hiringTeam;
    }
}
