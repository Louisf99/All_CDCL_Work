public class Student extends Person {

    private String moduleTeam;

    public Student(String name, String cohort, String _moduleTeam) {
        super(name, cohort);
        this.moduleTeam = _moduleTeam;
    }
    public String talk(String _language){
        return "I Love learning " + _language;
    }

}

