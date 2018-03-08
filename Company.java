package edu.gcccd.csis;

public class Company {

    public String name;
    public int numE;
    public int cid;

    public Company (String name, int numE, int cid)
    {
        this.name = name;
        this.numE = numE;
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getNumE() {
        return numE;
    }
}

