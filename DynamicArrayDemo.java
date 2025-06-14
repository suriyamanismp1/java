package javaCourse;
import java.util.*;
public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray list = new DynamicArray();
        Scanner sc = new Scanner(System.in);
        int val, pos;

        System.out.println("Lise of operation: ");
        System.out.println("1.insert end of elements: ");
        System.out.println("2.Display the elements: ");
        System.out.println("3.Insert the element specific position: ");
        System.out.println("4.Delete the element specific position:  ");
        System.out.println("5.Exit \n");
        while (true) {
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter the elements ");
                    val = sc.nextInt();
                    list.add(val);
                    break;
                }
                case 2: {
                    System.out.println("The element are: ");
                    list.display();
                    break;
                }
                case 3: {
                    System.out.println("Enter the position(starts with 0)");
                    pos = sc.nextInt();
                    val = sc.nextInt();
                    if (pos < 0) {
                        System.out.println("Invalid element");
                        break;
                    }
                    list.insert(pos, val);
                    break;
                }
                case 4: {
                    System.out.println("Enter the position(starts with 0)");
                    pos = sc.nextInt();
                    if (pos < 0) {
                        System.out.println("Invalid element");
                        break;
                    }
                    list.delete(pos);
                    break;
                }
                case 5:{
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
class DynamicArray<T> {
    private T[] arr;
    private int size;
    private int capacity;
   static final int initialCapacity=16;
   public DynamicArray(){
       int size=0;
       arr=(T[])new Object[initialCapacity];
       capacity=initialCapacity;
   }

   public void add(T val){
       if(size==capacity){
           expandArray();
       }
       arr[size++]=val;
   }

   public void expandArray(){
       capacity*=2;
       arr=Arrays.copyOf(arr,capacity);
   }

   public void display(){
       for(int i=0;i<size;i++){
           System.out.print(arr[i]+" "); 
       }
       System.out.println();
   }

   public void insert(int pos,T val) {
       if (size == capacity)
           expandArray();

           for (int i = size - 1; i >= pos; i--) {
               arr[i + 1] = arr[i];
           }
           arr[pos] = val;
           size++;
       }
       public void delete(int pos){
       for(int i=pos+1;i>size;i++){
           arr[i-1]=arr[i];
       }
       size--;
       if(capacity>initialCapacity && capacity>3*size){
           reduceArray();
       }
       }
       public void reduceArray(){
           capacity /=2;
           arr=Arrays.copyOf(arr,capacity);
       }
   }
