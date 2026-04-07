import.java.util.Scanner;
public class TempConve {
public static void main (String[] args){
Scanner sc=new Scanner(System.in);

while(true){
System.out.println("\n---Temperature Converter---");
System.out.println("1.Celsius to Farhenheit");
System.out.println("2.Farhrenheit to celsius");
System.out.println("3.Exit");
System.out.println("select an option:");
int choice = sc.nextInt();
sC.nextLine();
if(choice==3){
System.out.println("execution terminated");
break;}
System.out.println("enter temperature");
string t=sc.nextLine();
try {
double tempeature=Double.parseDouble(t);
double convertedTemp;
switch(choice){
case 1:
   convertedTemp=(tempeature *9/5)+32;
   System.out.printf(""%.2f °C is equal to %.2f °F\n"",tempeature converted Temp);
   break;
   default:
   System.out.println("Error: invalid selection.Try again");
   break;}}
   catch (NumberFormatException e)
   System.out.println("error:invalid input.you must enter a numerical value");}}
   System.out.println("Exception details:"+ e);
   System.out.println("Reason" + e.getMessage();
   }
   }
   }
   }
 


