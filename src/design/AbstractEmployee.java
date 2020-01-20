package design;

public abstract class AbstractEmployee implements Employee {
    final String empName = "Fahim";
    static String resignationDate = "11/21/2019";

    public void farewell () {
        System.out.println(empName+"'s last day was"+resignationDate);
    }
    public abstract void farewell (int date);

}

