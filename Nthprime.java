import java.util.Scanner;
class Nthprime{
public static void main(String[] args){
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
int count=0;
int num=1;
while(count<n){
num++;
int fact=0;
for(int i=0;i<=num;i++){
if(num%i==0){
fact++;
}
if(fact==2){
count++;
}
System.out.println(num);
}
}
}
}
