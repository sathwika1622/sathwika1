class Addition{
public int num1;
public int num2;
Addition(){
num1=5;
num2=3;
}
void Addition(int num1,int num2){
this.num1=num1;
this.num2=num2;
}
void Addition(float num1,float num2){
this.num1=num1;
this.num2=num2;
}
void display(){
System.out.println(this.num1+" "+this.num2);
}
public static void main(String[] args){
Addition obj= new Addition();
obj.display();
Addition obj1= new Addition(3,8);
obj1.display();

}
}
