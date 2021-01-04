package org.sla;

class Business {
    private int rank;
    private String Name;
    private float Revenue;
    private int EmployeeCt;

    public Business(int rank, String name, float revenue, int employeeCt) {
        this.rank = rank;
        Name = name;
        Revenue = revenue;
        EmployeeCt = employeeCt;
    }

    int getRank() {
        return rank;
    }

    void setRank(int rank) {
        this.rank = rank;
    }

    String getName() {
        return Name;
    }

    void setName(String name) {
        Name = name;
    }

    float getRevenue() {
        return Revenue;
    }

    void setRevenue(float revenue) {
        Revenue = revenue;
    }

    int getEmployeeCt() {
        return EmployeeCt;
    }

    void setEmployeeCt(int employeeCt) {
        EmployeeCt = employeeCt;
    }

    public String toString() {
        String desc = "";
        desc += "Company: " + this.getName() + ", " + this.getRank() + ", " + this.getRevenue();
        return desc;
    }
}
