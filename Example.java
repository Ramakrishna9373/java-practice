import java.util.*;
class Example{
public static void main(String[] args){
System.out.println("enter string");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
System.out.println(a.length());
System.out.println(a.toUpperCase());
System.out.println(a.split(" "));
System.out.println(a.trim());
// char h=a.chatAt(2);
//System.out.println(h);
System.out.println(a.indexOf('a'));
}}