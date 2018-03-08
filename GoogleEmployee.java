package edu.gcccd.csis;

public class GoogleEmployee extends edu.gcccd.csis.Employee {
    private String company ="Google";
    private int eid;

    public GoogleEmployee(String name, String title,
                          String dob, String company, int eid)
    {
        super(name, dob, title, eid);
        this.company = company;

    }



}