package com.pluralsight;

public class CellPhone {



    //Instance Varibles
   private int serialNumber ;
   private String model ;
   private String carrier ;
   private String phoneNumber ;
   private String owner ;


   public CellPhone(){
        int serialNumber = 0;
        String model = "";
        String carrier = "";
        String phoneNumber = "";
        String owner = "";
   }

   public int getSerialNumber(){
       return this.serialNumber;
   }
   public void setSerialNumber(int SerialNumber){
       this.serialNumber = SerialNumber;
   }


   public String getModel (){
       return this.model;
   }
   public void setModel(String model){
       this.model = model;
   }


   public String getCarrier(){
       return this.carrier;
   }
   public void setCarrier(String carrier){
       this.carrier = carrier;
   }


   public String getPhoneNumber(){
       return this.phoneNumber;
   }
   public void setPhoneNumber(String PhoneNumber){
       this.phoneNumber = PhoneNumber;
   }


   public String getOwner(){
       return  this.owner;
   }
    public void setOwner(String owner) {
        this.owner = owner;
    }


    public void dail (String phoneNumberToCall){
        System.out.println( owner + "'s Phone ( " + phoneNumberToCall + " ) is calling");
        System.out.println("*Ring*");
        System.out.println("*Ring*");
        System.out.println("*Ring*");
    }
}

