import java.util.Scanner;
public class resultProgram{ 
   public static void main(String args[]){ 
   Scanner _scTrx = new Scanner(System.in);
    double a;
    double b;
    double c;
    String x;
    String y;
    String z;
System.out.println("Hello World");
x = _scTrx.nextLine();
a = _scTrx.nextDouble();
System.out.println(a);
a = 2+3-5*8/a-a*a;
if (a>5) {System.out.println("a maior que 5");
}else {System.out.println("a menor ou igual a 5");
}
while (a<10) {
System.out.println("a ainda menor que 10");
a = a+1;
}
System.out.println("O Resultado vale");
System.out.println(a);
   }
}
