package task1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import java.io.FileWriter;

public class Task1{
    public static void main(String[] args) throws Exception{
        String[] hotel = new String[13];
initialiser(hotel);

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
//        Character endCharacter='q';
        if(userCommandLower==char1){
            addMemberToRoom(hotel);
//            System.out.println(hotel);
        }
        else if(userCommandLower==char2){
            showEmptyRooms(hotel);
        }
        else if(userCommandLower==char3){
            deleteCustomer(hotel);
        }
        else if(userCommandLower==char4){
            findTheCabin(hotel);
        }
        else if(userCommandLower==char5){
            writeDatatoTheFile(hotel);
        }
        else if(userCommandLower==char6){
            readFile();
        }
        else if(userCommandLower==char7){
            sortByName(hotel);
        }
        else if(userCommandLower==char8){
            showCabins(hotel);
        }
        userCommandLower=menu();
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
                "Q: Quit ");
        char userCommand = input.next().charAt(0);
        char userCommandLower=Character.toLowerCase(userCommand);
    return userCommandLower;
}
 
// add a member to the cabin **method
public static void addMemberToRoom(String[]hotel){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the cabin Number");
    int roomNum=input.nextInt();
    System.out.println("Enter Name for room"+roomNum+":");
    String roomName=input.next();
    hotel[roomNum]=roomName;
    System.out.println(roomNum+" room occupied by "+roomName);
    

}



//show the empty cabins **method
public static void showEmptyRooms(String [] hotel){
    
    for (int x=1; x<13;x++){
        if(hotel[x].equals("e"))
            System.out.println("room"+x+"is empty");
    }
    
}




//delete customer from the cabin**method
public static void deleteCustomer(String delCus[]){
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter the customer name:");
        String E = input.next();
        for (int i=1;i<13;i++){
            if(delCus[i].equals(E)){
                delCus[i]="e";
                System.out.println("Deleted!");
            }
        }
    }


//find a cabin according to the customer name
public static void findTheCabin(String hotel[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the Name of the customer");
    String customer=input.next();
    String customerLower=customer.toLowerCase();
    for(int i=1;i<13;i++){
    
        if (hotel[i].equals(customerLower)){
            System.out.println(i);
        }
        }
    }

//show all the cabins
public static void showCabins(String hotel[]){
    for (int i=1;i<13;i++){
        if(hotel[i].equals("e")){
            System.out.println("room "+i+" is empty");
        }
        else{
            System.out.println("room "+i+" is occupied by "+ hotel[i]);
        }
    }
}
public static void writeDatatoTheFile(String hotel[])throws Exception{
        try (FileWriter writer = new FileWriter("task1.txt")) {
            for (int i = 1; i < 13; i++) {
                if (hotel[i].equals("e")){
                    writer.write(i+" empty " + "\t"+ "");
                }
                else{
                writer.write(i+" "+hotel[i] + "\t"+ "");
                }
            } }
}
private static void initialiser( String hotelRef[]) 
{ 
for (int x = 1; x < 13; x++ ) hotelRef[x] = "e"; 
 
}
public static void sortByName(String hotel[]){
        String newstr;
        for (int i=1;i<13;i++){
            for (int j=i+1;j<12;j++){
                if (hotel[i].compareTo(hotel[j])>0){
                    newstr=hotel[i];
                    hotel[i]=hotel[j];
                    hotel[j]=newstr;
                }
            }
        }
        for (int i=1;i<13;i++){
            if(hotel[i]!="e"){
                System.out.print(hotel[i]+" ");
            }
        }
        System.out.println("\n");
    }
public static void readFile() throws FileNotFoundException{
          File myObj = new File("task1.txt");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            } }
}
}



