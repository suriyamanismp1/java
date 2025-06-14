package com.company;
import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats=new ArrayList<>();

    public Theatre(String theatreName,int numRows,int seatsPerrow) {
        this.theatreName = theatreName;
        int lastRow='A'+(numRows-1);
        for(char row='A';row<=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerrow;seatNum++){
                Seat seat =new Seat(row+String.format("%02d",seatNum));
                seats.add(seat);
            }
//            Seat seat=new Seat(".");
//            seats.add(seat);
        }
    }

    public String getTheatreName() {
        return theatreName;
    }
    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat=new Seat(seatNumber);
        int foundSeat=Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat "+seatNumber);
            return false;
        }
//        for(Seat seat:seats){
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(".")){
//                System.out.println("");
//            }else if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat=seat;
//                break;
//            }
//        }
//        if(requestedSeat==null){
//            System.out.println("There is no seat "+seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }
    public void getSeats(){
        for(Seat seat:seats){
            if(seat.getSeatNumber().equals(".")){
                System.out.println("");
            }else {
                System.out.println(seat.getSeatNumber()+" ");
            }
        }
    }
    public Collections<Seat> getSeats(){
        
    }
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved=false;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price=price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean  reserve(){
            if(!this.reserved){
                this.reserved=true;
                System.out.println("Seat "+ seatNumber+" reserved");
                return true;
            }else{
                return false;
            }
        }
        public boolean cancel(){
            if(this.reserved){
                this.reserved =false;
                System.out.println("Reservation of seat "+ seatNumber);
                return true;
            }else{
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
