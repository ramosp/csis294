package edu.gcccd.csis;

public class Employee {

    private final String name;
    private final String dob;
    private String title;
    public int eid = 0;


    public Employee (String name, String dob, String title, int eid)
    {
        this.name = name;
        this.dob = dob;
        this.title = title;
        this.eid = eid;


    }

    public String getName() {
        return name; }

    public String getDob() {
        return dob; }

    public int getEid() {
        return eid; }

    public String getTitle() {
        return title; }

    public void setTitle(String title) {
        this.title = title; }

    public void setEid(int eid) {
        this.eid = eid; }

}
