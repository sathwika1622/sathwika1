import java.util.Scanner;
class nthfibonacci{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
int a=0;
int b=1;
System.out.println(a);
System.out.println(b);
int c=0;
for(int i=3;i<=n;i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
