class ToggleCase{
public static void main(String[] args){
toToggle();
}
static void toToggle(){
String str="sATHWIKA@134";
String temp=" ";
int i=0;
while(i<str.length()){
char ch=str.charAt(i);
if(Character.isLowerCase(ch)){
temp +=Character.toUpperCase(ch);
}
else if(Character.isUpperCase(ch)){
temp +=Character.toLowerCase(ch);
}
else{
temp=temp+ch;
}
i++;
}
System.out.println(temp);
}
}
