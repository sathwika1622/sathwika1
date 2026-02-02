import java.util.Scanner; 
class Array{
public static void main(String[] args){

CreateArray();


}

static void CreateArray(){
Scanner scan=new Scanner(System.in);
int arr[]=new int[6];
for(int i=0;i<arr.length;i++){
 arr[i]=scan.nextInt();
}

for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}