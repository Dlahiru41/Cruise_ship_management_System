package task2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class Task2 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        
    Cabin[] hotel=new Cabin[13]; //array of cabin class objects

        for (int j=0;j<13;j++){
            hotel[j]=new Cabin();
        }
Character endCharacter='q';
char userCommandLower=menu();
while (userCommandLower!=endCharacter){


        Character char1='a';
        Character char2='e';
        Character char3='d';
        Character char4='f';
        Character char5='s';
        Character char6='l';
        Character char7='o';
        Character char8='v';
        Character char9='t';
//        Character endCharacter='q';
        if(userCommandLower==char1){
            addUser(hotel);
//            System.out.println(hotel);
        }
        else if(userCommandLower==char8){
           viewCabin(hotel);
        }
        else if(userCommandLower==char2){
           viewEmptycabins(hotel);
        }
        else if(userCommandLower==char3){
            deletecustomer(hotel);
        }
        else if(userCommandLower==char4){
            findACustomer(hotel);
        }
        else if(userCommandLower==char5){
            writeDatatoTheFile(hotel);
        }
        else if(userCommandLower==char6){
            readFile();
        }        
        else if(userCommandLower==char8){
//            showCabins(hotel);
        }
        else if(userCommandLower==char9){
            expenses(hotel);
        }
        userCommandLower=menu();
    }
}
public static void addUser(Cabin[]hotel){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the CabinNo");
    int cabinNo=input.nextInt();
    System.out.println("Enter the firstname");
    String firstname=input.next();
    System.out.println("Enter the surname");
    String surName=input.next();
    System.out.println("Enter the Exspenses");
    int expenses=input.nextInt();
//    cabin 1 
if (cabinNo==1){
    if (hotel[1].psg1==null){
    hotel[1].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[1].psg2==null){
        hotel[1].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[1].psg3==null){
        hotel[1].psg3=new Passenger(firstname,surName,expenses);
    } 
    else{
        System.out.println("Cabin is full");
    }
}
//    cabin 2
if (cabinNo==2){
        if (hotel[2].psg1==null){
    hotel[2].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[2].psg2==null){
        hotel[2].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[2].psg3==null){
        hotel[2].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin3
if (cabinNo==3){
        if (hotel[3].psg1==null){
    hotel[3].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[3].psg2==null){
        hotel[3].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[3].psg3==null){
        hotel[3].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
//      cabin 4
if (cabinNo==4){
        if (hotel[4].psg1==null){
    hotel[4].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[4].psg2==null){
        hotel[4].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[4].psg3==null){
        hotel[4].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin5
if (cabinNo==5){
        if (hotel[5].psg1==null){
    hotel[5].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[5].psg2==null){
        hotel[5].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[5].psg3==null){
        hotel[5].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin 6
if (cabinNo==6){
        if (hotel[6].psg1==null){
    hotel[6].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[6].psg2==null){
        hotel[6].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[6].psg3==null){
        hotel[6].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin 7
if (cabinNo==7){
        if (hotel[7].psg1==null){
    hotel[7].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[7].psg2==null){
        hotel[7].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[7].psg3==null){
        hotel[7].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin 8
if (cabinNo==8){
        if (hotel[8].psg1==null){
    hotel[8].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[8].psg2==null){
        hotel[8].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[8].psg3==null){
        hotel[8].psg3=new Passenger(firstname,surName,expenses);
    } 
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin 9
if(cabinNo==9){
        if (hotel[9].psg1==null){
    hotel[9].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[9].psg2==null){
        hotel[9].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[9].psg3==null){
        hotel[9].psg3=new Passenger(firstname,surName,expenses);
    } 
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin 10
if (cabinNo==10){
        if (hotel[10].psg1==null){
    hotel[10].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[10].psg2==null){
        hotel[10].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[10].psg3==null){
        hotel[10].psg3=new Passenger(firstname,surName,expenses);
    } 
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin 11
if (cabinNo==11){
        if (hotel[11].psg1==null){
    hotel[11].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[11].psg2==null){
        hotel[11].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[11].psg3==null){
        hotel[11].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
//        cabin 12
if (cabinNo==12){
        if (hotel[12].psg1==null){
    hotel[12].psg1=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[12].psg2==null){
        hotel[12].psg2=new Passenger(firstname,surName,expenses);
    }
    else if(hotel[12].psg3==null){
        hotel[12].psg3=new Passenger(firstname,surName,expenses);
    }
            else{
        System.out.println("Cabin is full");
    }
}
}



    public static char menu(){
        Scanner input=new Scanner(System.in);
        System.out.println("A: Add a customer to a cabin\n"+
                   "V: view all cabins\n"+
                    "E: Display Empty cabins\n" +
                    "D: Delete customer from cabin\n" +
                   "F: Find cabin from customer name \n" +
                    "S: Store program data into file \n" +
                    "L: Load program data from file\n" +
                   "O: View passengers Ordered alphabetically by name\n"+
                "Q: Quit \n"+
                "T: print the expenses perpassenger as well as the total expenses of all passengers");
        char userCommand = input.next().charAt(0);
        char userCommandLower=Character.toLowerCase(userCommand);
    return userCommandLower;
}
public static void viewCabin(Cabin[]hotel){
        for (int i=1;i<13;i++){
        if(hotel[i].psg1==null&&hotel[i].psg2==null&&hotel[i].psg3==null){
            System.out.println("cabin "+i+" is empty");
        }
        if(hotel[i].psg1!=null){
            System.out.println("cabin "+i+" is occupied by "+ hotel[i].psg1.firstName);
        }
        if(hotel[i].psg2!=null){
            System.out.println("cabin "+i+" is occupied by "+ hotel[i].psg2.firstName);
        }
        if(hotel[i].psg3!=null){
            System.out.println("cabin "+i+" is occupied by "+ hotel[i].psg3.firstName);
        }
    }
}
public static void viewEmptycabins(Cabin[]hotel){
            for (int i=1;i<13;i++){
        if(hotel[i].psg1==null&&hotel[i].psg2==null&&hotel[i].psg3==null){
            System.out.println("cabin "+i+" is empty");
        }
}  
}
public static void deletecustomer(Cabin[]hotel){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the customer name");
    String customerName=input.next();
    for(int i=1; i<13;i++){
        try{
        if(hotel[i].psg1.firstName.equals(customerName)){
            hotel[i].psg1=null;
            System.out.println("Customer was successfully removed from the cabin");
                }
                else if(hotel[i].psg2.firstName.equals(customerName)){
            hotel[i].psg2=null;
            System.out.println("Customer was successfully removed from the cabin");
                }
                else if(hotel[i].psg3.firstName.equals(customerName)){
            hotel[i].psg3=null;
            System.out.println("Customer was successfully removed from the cabin");
                }   
        }
        catch(Exception e){
            continue;
        }

}
}
public static void findACustomer(Cabin[]hotel){
        Scanner input=new Scanner(System.in);
    System.out.println("Enter the customer name");
    String customerName=input.next();
    int count=1;
    for(int i=1; i<13;i++){
        try{
             if(hotel[i].psg1.firstName.equals(customerName)){
           System.out.println(customerName+" found in cabin " +i);
           count=0;
             }
             else if(hotel[i].psg2.firstName.equals(customerName)){
                 System.out.println(customerName+" found in cabin " +i);
           count=0;
             }
              else if(hotel[i].psg3.firstName.equals(customerName)){
                 System.out.println(customerName+" found in cabin " +i);
           count=0;
             }
        }
        catch(Exception e){
            continue;
        }
            }
             
}
public static void expenses(Cabin[]hotel){
    int total=0;
    for(int i=1;i<13;i++){
        if(hotel[i].psg1!=null){
        System.out.println(hotel[i].psg1.firstName+" "+hotel[i].psg1.expenses);
        total=total+hotel[i].psg1.expenses;
        }

        
        if(hotel[i].psg2!=null){
        System.out.println(hotel[i].psg2.firstName+" "+hotel[i].psg2.expenses);
        total=total+hotel[i].psg2.expenses;
        }
        if(hotel[i].psg3!=null){
        System.out.println(hotel[i].psg3.firstName+" "+hotel[i].psg3.expenses);
        total=total+hotel[i].psg3.expenses;
        }       
        
                }
System.out.println("total expenses "+total);
        }
public static void writeDatatoTheFile(Cabin hotel[]) throws IOException{
 
        try(FileWriter writer = new FileWriter("task2.txt")){
       for (int i=1;i<13;i++){
        if(hotel[i].psg1==null&&hotel[i].psg2==null&&hotel[i].psg3==null){
            writer.write("cabin "+i+" is empty"+"\t"+" ");
        }
        if(hotel[i].psg1!=null){
            writer.write("cabin "+i+" is occupied by "+ hotel[i].psg1.firstName+"\t"+" ");
        }
        if(hotel[i].psg2!=null){
            writer.write("cabin "+i+" is occupied by "+ hotel[i].psg2.firstName+"\t"+" ");
        }
        if(hotel[i].psg3!=null){
            writer.write("cabin "+i+" is occupied by "+ hotel[i].psg3.firstName+"\t"+" ");
        }
        }
        }
}
public static void readFile() throws FileNotFoundException{
          File myObj = new File("task2.txt");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            } }
}
}
    



class Passenger{
 String firstName;
 String surName;
 int expenses;
 public Passenger(String firstname,String surname,int expen){
    firstName=firstname;
    surName=surname;
    expenses=expen;      
}
 public Passenger(){   
 }
}
class Cabin{    
Passenger psg1;
Passenger psg2;
Passenger psg3;
}
