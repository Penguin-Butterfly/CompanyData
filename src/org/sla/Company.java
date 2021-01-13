package org.sla;

class Company extends Business{
    private String Country;
    private double profit;
    private String Industry;

    Company(int rank, String name, double revenue, int employeeCt, String country, float profit, String industry) {
        super(rank, name, revenue, employeeCt);
        Country = country;
        this.profit = profit;
        Industry = industry;
    }

    String getCountry() {
        return Country;
    }

    void setCountry(String country) {
        Country = country;
    }

    double getProfit() {
        return profit;
    }

    void setProfit(float profit) {
        this.profit = profit;
    }

    String getIndustry() {
        return Industry;
    }

    void setIndustry(String industry) {
        Industry = industry;
    }


    public String toString() {
        String desc = "";
        desc += "Company: " + this.getName() + ", " + this.getIndustry() + ", " + this.getCountry();
        return desc;
    }
}
