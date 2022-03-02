import org.junit.Before;

public class Person {


    private String name;
    private String cohort;


    public Person(String _name, String _cohort) {
        this.name = _name;
        this.cohort = _cohort;
    }


    public String getName() {
        return name;
    }


    public String getCohort() {
        return cohort;
    }


    public void setName(String _name) {
        name = _name;
    }


    public void setCohort(String _cohort) {
        cohort = _cohort;
    }


    public String talk(String _language) {
        return "I Love " + _language;
    }






























}
