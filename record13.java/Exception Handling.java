import.java.util.Scanner;
public class tempconve
public static void main (string[] args){
Scanner sc=new scanner(system.in);

while(true){
System.out.println("/n---tempeature conveter---");
System.out.println("1.Celsius to Farhenheit");
System.out.println("2.Farhrenheit to celsius");
System.out.println("3.Exit");
System.out.println("select an option:");
int choice = sc.nextInt();
SC.nextLine();
if(choice==3){
System.out.println("execution terminated");
break;}
System.out.println("enter temperature");
string t=sc.nextLine();
try {
double tempeature=double.parseDouble(t);
double converted Temp;
switch(choice){
case1:
   Converted Temp=(tempeature *9/5)+32;
   System.out.printf("%:2f F is equal to % 2f c/n",tempeature converted Temp);
   break;
   default;
   System.out.println("Error: invalid selection.Try again");
   break;}}
   catch(Number Format exception){
   System.out.println("error:invalid input.you must enter a numerical value");}}
   System.out.println("Exception details:"+ e);
   System.out.println("Reason" + e.get message());
   }
   }
   }}  
 


