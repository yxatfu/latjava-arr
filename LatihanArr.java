import java.util.*; 

//Compiler version JDK 11.0.2

public class LatihanArray
{  
  public static void main(String args[])
  {  
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukkan angka : ");
    int counter = scan.nextInt();
    int[] a = new int[counter];
    int jum = 0;
    float rata;
    for (int i = 0; i < a.length; i++) {
       if (i == 2 || i == 4) {
       a[i] = i;
       }
       else {
           a[i] = i;
       System.out.println("a[" + i + "] = " + a[i]);
       }
    }
  }
}
