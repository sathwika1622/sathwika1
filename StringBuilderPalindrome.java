class StringBuilderPalindrome{
public static void main(String[] args){
isPalindrome();
}
static void isPalindrome(){
String str="Amma";
StringBuilder sb=new StringBuilder(str);
sb=sb.reverse();
String temp=sb.toString();
if(str.equals(temp)){
System.out.println("palindrome");
}
else{
System.out.println("not palindrome");
}
}
}
































