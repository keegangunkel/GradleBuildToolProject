import java.util.Scanner;

public class Geometry {
    public static void main(String args[]){
        userMenu();
    }
    public static void userMenu(){
       //Creating a boolean to continue/break the while loop
       boolean valid = true;
       //Scanner to get user input
       Scanner reader = new Scanner(System.in);
       //While loop to create the selection menu
       while(valid){
        System.out.println("Welcome to my geometry program!\nSelect from the following options:\n1. Cylinder\n2. Sphere\n3.) Cone\n0.) Quit");
        
        int answer = reader.nextInt();

        if(answer == 1){
            cylinderPrompt();
        }
        if(answer == 0){
            System.out.println("Terminating program...");
            reader.close();
        }
       }
      }
      private static void cylinderPrompt()
      {
  
      System.out.println("------------------------------------------------------------");
      System.out.println("PYTHON PROGRAM TO FIND VOLUME AND SURFACE AREA OF A CYLINDER");
      System.out.println("------------------------------------------------------------");
  
      Scanner radiusReader = new Scanner(System.in);
      System.out.println("Please enter the radius:");
      int radiusInput = radiusReader.nextInt();
      System.out.println("Please enter the height:");
      Scanner heightReader = new Scanner(System.in);
      int heightInput = heightReader.nextInt();
      //Instantiating a local Cylinder object
      Cylinder cylinder = new Cylinder();
      //invokes volume and surface area method in cylinder class to calculate 
      double volume = cylinder.volume(radiusInput, heightInput);
      double surfaceArea = cylinder.surfaceArea(radiusInput, heightInput);
      //prints out volume and surface area
      System.out.println("\nThe volume of the Cylinder: " + volume); 
      System.out.println("\nThe surface area of the Cylinder: " + surfaceArea + "\n");
       //invokes menu again
      userMenu();
      //Closes scanners
      radiusReader.close();
      heightReader.close();
      }
}