class complex{
double real;
double img;
}
complex() {
 real=0;
 img=0;
 }
 complex(double r,double i){
  real=r;
  img=i;
 }
 complex add(complex c2){
 complex result=new complex();
 result.real=real+c2.real;
 result.img=img+c2.img;
 return result;
 }
 
 complex substract(complex c2){
 complex result=new complex();
 result.real=real-c2.real;
 result.img=img-c2.img;
 return result;
 }
 complex multi(complex c2){
 complex result=new complex();
 result.real=(real*c2.real)-(img * c2.img);
 result.img=(img*c2.img)-(img * c2.real);
 return result;
 
 }
 
 void display(){
  system.out.println(real+"+"+img+"i");
  }
  public class complexmain{
  public static voidmain(string[] args){
    Scanner sc=new scanner(system.in);
    system.out.println("Enter the real and imaginary part1:");
    
  double r1=sc.nextdouble();
  double i1=sc.nextdouble();
  complex c1=new complex(r1,i1);
  
 system.out.println("Enter the real and imaginary part2:");
 double r2=sc.nextdouble():
 double i2=sc.nextdouble();
 complex c2=new complex(r2,i2);
 
 system.out.println("---Result---");
 
 complex sum = c1.add(c2);
 complex diff = c1.substract(c2);
 complex prod = c1. multiply(c2);
 
 system.out.println("sum");
 sum.display();
 
 system.out.println("diff");
 diff.display();
 
 system.out.println("product");
 product.display();
 }
 
 
 
    
