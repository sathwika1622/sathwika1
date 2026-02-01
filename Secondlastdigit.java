import java.util.Scanner;
class Secondlastdigit{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int digit=scan.nextInt();
int secondlastdigit=0;
if(digit>0){
secondlastdigit=digit%10;
System.out.println(secondlastdigit);
}
}
}

