package Dk001;

public class bus {
        private int BusNo;
       private boolean AC;
        int Capacity;//get and set
 public bus(int no,boolean ac,int cap){
    this.BusNo=no;
    this.AC=ac;
    this.Capacity=cap;
}
 public int getCapacity(){//accessor

     return Capacity;
}
public void setCapacity(int cap){//Mutetor
     Capacity=cap;
}
public void displayBusInfo(){
    System.out.println("busNo"+BusNo+"ac"+AC+"Capacity"+Capacity);
}
    }

