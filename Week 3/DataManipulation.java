
import java.io.*;  
import java.util.Scanner;  

class DataManipulation {
    public static void main(String []args){
        //parsing a CSV file into Scanner class constructor  
        Scanner sc = new Scanner(new File("F:\\CSVDemo.csv"));  
        sc.useDelimiter(",");   //sets the delimiter pattern  
        while (sc.hasNext())  //returns a boolean value  
            {  
                System.out.print(sc.next());  //find and returns the next complete token from this scanner  
            }   
        sc.close();  //closes the scanner  
    }  
}  
   //https://builtin.com/blockchain/blockchain-applications