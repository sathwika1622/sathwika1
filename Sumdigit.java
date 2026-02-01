import java.util.Scanner;
class Sumdigit{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int digit=scan.nextInt();
int lastdigit=0;
int sum=5;
if(digit>0){
lastdigit=digit%10;
System.out.println(lastdigit);
lastdigit =lastdigit /10;
sum=sum+lastdigit;
}
System.out.println(sum);
}
}

