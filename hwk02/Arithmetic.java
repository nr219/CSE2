//
// Nicholai Redfern
// hwk02
// Arithmetic.java
//
// This program calcutales the cost and tax of some items

// class
public class Arithmetic{
    
//main statement
    public static void main(String[] args){

//Number of pairs of socks
    int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
    double sockCost$=2.58;
//Number of drinking glasses
    int nGlasses=6;
//Cost per glass
    double glassCost$=2.29;
//Number of boxes of envelopes
    int nEnvelopes=1;
//cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06; 

//Sock 
    double sockTotal;
 
  //Sock Calculations 
        double sockTotalWithoutTax;
        double sockTax;
        sockTotalWithoutTax = nSocks * sockCost$;
        sockTax = (((int) sockTotalWithoutTax * taxPercent)*100)/100.0;
        
    //Sock Print
        System.out.println("The cost of the socks without tax is $"+sockTotalWithoutTax+" and the tax would be $"+sockTax+".");
 
//Glass
    double glassTotal;
 
  //Glass Calculations 
        double glassTotalWithoutTax;
        double glassTax;
        glassTotalWithoutTax = nGlasses * glassCost$;
        glassTax = (((int) glassTotalWithoutTax * taxPercent)*100)/100.0;
        
    //Glass Print
        System.out.println("The cost of the glasses without tax is $"+glassTotalWithoutTax+" and the tax would be $"+glassTax+".");
        
//Envelopes
    double envelopesTotal;
 
  //Envelopes Calculations 
        double envelopesTotalWithoutTax;
        double envelopesTax;
        envelopesTotalWithoutTax = nEnvelopes * envelopeCost$;
        envelopesTax = (((int) envelopesTotalWithoutTax * taxPercent)*100)/100.0;
        
        
    // EnvelopesPrint
        System.out.println("The cost of the envelopes without tax is $"+envelopesTotalWithoutTax+" and the tax would be $"+envelopesTax+".");
        
// Totals
    double totalWithoutTax;
    double totalWithTax;
    totalWithoutTax = sockTotalWithoutTax + glassTotalWithoutTax + envelopesTotalWithoutTax;
    totalWithTax = (((int) totalWithoutTax * taxPercent)*100)/100;
    System.out.println("The cost of the transaction without tax is $"+totalWithoutTax+" and the tax would be $"+totalWithTax+".");
        
    }
}
