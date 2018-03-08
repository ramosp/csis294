package edu.gcccd.csis;

public class MSEmployee extends edu.gcccd.csis.Employee {

    private String company ="MS";
    private int eid;

    public MSEmployee(String name, String title,
                          String dob, String company, int eid)
    {
        super(name, dob, title, eid);
        this.company = company;

    }



}