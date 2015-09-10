// Nicholai Redfern
// CSE2
// 9/3/15
//
// This program is dsigned to calculate varoius things for a bike using time and rotaions of the wheel
//
// class
    public class Cyclometer{
    
//main
    public static void main(String[] args){
 
//varibles       
   int sec1 = 480; //time of trip 1
   int sec2 = 3220; //time of trip 2
   int rot1 = 1561; //# of rotaions in 1
   int rot2 = 9037; //# of rotaions in 2
//standard varibles
    double wd = 27, //Wheel Diameter
    PI = 3.14159, // Pie
    fpm = 5280, // Conversition for feet to miles
    ipf = 12, // Converstion for inches to feet
    spm = 60; // Converstion for secnonds to min
    double dtp1,
    dtp2,
    td;  // distance per trip, and total distance
  
// print out
    System.out.println("Trip 1 took "+(sec1/spm)+" minutes and had "+rot1+" counts.");
    System.out.println("Trip 2 took "+(sec2/spm)+" minutes and had "+rot2+" counts.");
        
// caluculations
// calucualtes the disdance travled by the bike
    dtp1 = rot1 * wd * PI; // # of inches traveld by the bike
    dtp1/= ipf * fpm; // Distance in miles not inches
    dtp2 = rot2 * wd * PI / ipf / fpm; // calculations for #2
    td = dtp1 + dtp2; // total distance
    
// print out the distances
    System.out.println("Trip 1 was "+dtp1+" miles");
    System.out.println("Trip 2 was "+dtp2+" miles");    
    System.out.println("The total disdance was "+td+" miles");
        
    } // end of main
}// end of class