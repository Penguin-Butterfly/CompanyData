package org.sla;

class InternetCom extends Business{
    private String HQLocation;
    private float MarketCap;
    private int FoundingYear;
    private int FiscalYear;

    public InternetCom(int rank, String name, float revenue, int employeeCt, String HQLocation, float marketCap, int foundingYear, int fiscalYear) {
        super(rank, name, revenue, employeeCt);
        this.HQLocation = HQLocation;
        MarketCap = marketCap;
        FoundingYear = foundingYear;
        FiscalYear = fiscalYear;
    }

    String getHQLocation() {
        return HQLocation;
    }

    void setHQLocation(String HQLocation) {
        this.HQLocation = HQLocation;
    }

    float getMarketCap() {
        return MarketCap;
    }

    void setMarketCap(float marketCap) {
        MarketCap = marketCap;
    }

    int getFoundingYear() {
        return FoundingYear;
    }

    void setFoundingYear(int foundingYear) {
        FoundingYear = foundingYear;
    }

    int getFiscalYear() {
        return FiscalYear;
    }

    void setFiscalYear(int fiscalYear) {
        FiscalYear = fiscalYear;
    }
}
