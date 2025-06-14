//import java.io.*;
//class MaxMin
//{
//    public static void main(String arg[ ])
//    {
//        int a[ ] = new int[100];
//        int max=0, min=0, n;
//        try
//        {
//            DataInputStream din = new DataInputStream(System.in);
//            System.out.println("Enter Number of Data");
//            n=Integer.parseInt (din.readLine( ));
//            System.out.println ("enter data one by one");
//            for(int i = 0; i<n; i++)
//            {
//                if(max<=a[i])
//                    max = a[i];
//                if(min>=a[i])
//                    min = a[i];
//            }
//            System.out.println("Maximum= "+max);
//            System.out.println("Minimum="+min);
//        }
//        catch(IOException e)
//        {
//            System.out.println("IOError" +e);
//        }
//    }

class Example
{
    String name;
    double salary;
   public Example(String n,double s){
        this.name=n;
        this.salary=s;
    }

    public Example() {

    }

    String getName(){
        return name;
    }
    void setName(String n){
       this.name=n;
        System.out.println(name);

    }
   public double getSalary(){
        return salary;
    }
    void setSalary(double s){
        this.salary=s;
        System.out.println(salary);
    }
  void  raiseSalary(double percent){
      salary=salary+ salary*percent/100;
      System.out.println(salary);
    }



    /*public static void main(String args[])
    {
//        Scanner s=new Scanner(System.in);
//        int a=s.nextInt();
//        int b=s.nextInt();
//        float f=(float) Math.pow(a,b);
//        System.out.println(f);
//        float f=(float)Math.PI;
//        System.out.println(Math.PI);
//        System.out.printf("%.3f",f);
        Example e=new Example("dk",35000);
        e.raiseSalary(20);
        e.getName();
        e.getSalary();

        //System.out.println(e.getName());
        //System.out.println( e.getSalary());
        System.out.println();
        System.out.println();
    }*/
}
class Manager extends Example{
     double bones;
    double Manager(String n, double s, double s2 ){
        name=n;
        salary=s;
        bones=s2;
        double getSalary;{
            return super.getSalary()+bones;
        }

    }
}