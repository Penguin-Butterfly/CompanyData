package org.sla;

class InternetCom extends Business{
    String HQLocation;
    float MarketCap;
    int FoundingYear;
    int FiscalYear;

    public InternetCom(int rank, String name, float revenue, int employeeCt, String HQLocation, float marketCap, int foundingYear, int fiscalYear) {
        super(rank, name, revenue, employeeCt);
        this.HQLocation = HQLocation;
        MarketCap = marketCap;
        FoundingYear = foundingYear;
        FiscalYear = fiscalYear;
    }
}
