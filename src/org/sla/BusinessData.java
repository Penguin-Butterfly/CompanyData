package org.sla;


class BusinessData {
    public static void main(String[] args) {
        // write your code here
            String pathToDotComData = args[0];
            String pathToCompanyData = args[1];

        new Company(1,"Walmart",523964,2200000,"United States",14881,"Retail");
        new DotCom(1,"Amazon",280500,798000,"Seattle",920.22,1994);

        Business.describeAll();
    }
}
