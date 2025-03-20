Class A{
void f1(){
System.out.println("i");
}}
Class B extends A
{
void f2(){
System.out.println("write");
}}
Class c
{
B b=new B();
b.f2();
}