package main.java.models.person;

public class Guard extends Staff{
     private int parkingFloorNumber;

     Guard(String name,String email,String address,int age){
         super(name,email,address,age);
     }

     public int getParkingFloorNumber(){
          return parkingFloorNumber;
     }

     public void setParkingFloorNumber(int p){
          parkingFloorNumber = p;
     }


}
