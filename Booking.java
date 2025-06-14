package Dk001;
/*
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.*;
public class Booking {
    String passengerName;
    int bus_no;
    Date date;

    public Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the passenger name :");
        String passengerName = sc.next();
        System.out.println("Enter the bus no :");
        int bus_no = sc.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateinput = sc.next();
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            dataFormat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        public boolean isAvailable
        (ArrayList < Booking > book, ArrayList < bus > buses){
             int Capacity;
             for(bus b:buses){
                 if(bus.getBusNO()==bus_no)
                     Capacity=bus.getCapacity();
             }
             int booked=0;
             for(Booking b:book)
                 if(b.bus_no==bus_no&&b.date.equals(date));
             booked++;
        }


    }
    return booked<Capacity?true:false;
}

*/