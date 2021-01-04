package org.sla;

class Company extends Business{
    private String Country;
    private float profit;
    private String Industry;

    Company(int rank, String name, float revenue, int employeeCt, String country, float profit, String industry) {
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

    float getProfit() {
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
}
