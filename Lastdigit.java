import java.util.Scanner;
class Lastdigit{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int digit=scan.nextInt();
int lastdigit=0;
if(digit>0){
lastdigit=digit%10;
System.out.println(lastdigit);
}
}
}

