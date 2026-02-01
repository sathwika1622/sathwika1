import java.util.Scanner;
class Sumlastdigits{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int digit1=scan.nextInt();
int digit2=scan.nextInt();
int sum=0;
int lastdigit1 = 0;
int lastdigit2 =0;
if(digit1>0 && digit2>0){
lastdigit1 =digit1%10;
lastdigit2 =digit2%10;
sum=lastdigit1 + lastdigit2;
System.out.println(sum);
}
}
}

