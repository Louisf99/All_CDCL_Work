public class Instructor extends Person {

    private String moduleTeam;

    public Instructor(String name, String cohort, String _moduleTeam) {
        super(name, cohort);
        moduleTeam = _moduleTeam;
    }

    public String talk(String _language){
        return "I Love teaching " +  _language + " and " + moduleTeam;
    }
}