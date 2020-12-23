package org.sla;

class Company extends Business{
    String Country;
    float profit;
    String Industry

    Company(int rank, String name, float revenue, int employeeCt, String country, float profit, String industry) {
        super(rank, name, revenue, employeeCt);
        Country = country;
        this.profit = profit;
        Industry = industry;
    }
}
