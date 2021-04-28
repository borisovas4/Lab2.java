import java.util.Scanner;
public class Zad2_2 {
    public static void m(int a) {
        int b;
        String temp="";
        while(a!=0){
            b=a%2;
            temp=b+temp;
            a=a/2;
        }
        System.out.print(temp);
    }
    public static void main(String[]args ){
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Введите число=> ");
        int n=sc.nextInt();
        Zad2_2 country[]=new Zad2_2[n];
       m(22);
    }
}
