import java.util.Scanner;

public class javagame {

	  // Global
	  public static int currentLocale = 1; //player start area.
	  public static String command;  
	  public static boolean done = false;
	  
	  public static void main(String[] args) {
		 init();
		 updateDisplay();

		
		  //game loop
		 while(! done){
		 getCommand();
	     navigate();
	     updateDisplay();
		 }
		 System.out.println("Thanks for playing!");
	  }
	  
	  private static void init(){
		  command = new String();
	  }  
	 

	  private static void updateDisplay() {
	     String msg = new String();
	     msg = "";
	     switch (currentLocale) {
	        case 0: msg = "The hull";
	                break;
	        case 1: msg = "Main deck";
            		break;
	        case 2: msg = "Below Deck";
            		break;
	        default: msg = "currentLocale" + currentLocale + " does not compute.";
	     }
	     System.out.println(msg);
	  } 
	  
	  private static void getCommand(){
		  Scanner inputReader = new Scanner(System.in);
		  command = inputReader.nextLine();

	  }
	  private static void navigate(){
		  if (command.equals("north") || command.equals("n") ){
			//north
			  if (currentLocale == 1){
				  currentLocale = 0;
			  } else if (currentLocale == 2){
				  currentLocale = 1;
			  } else if (currentLocale == 0){
				  System.out.println("You jumped off the boat. Good job.");
			  }
			  }
		  if (command.equals("south") || command.equals("s") ){
					//north
					  if (currentLocale == 1){
						  currentLocale = 2;
					  } else if (currentLocale == 0){
						  currentLocale = 1;
					  } else if (currentLocale == 2){
						  System.out.println("You can't go beneath the boat.");
					  }
		  } else if ( command.equals("exit") || command.equals("quit")){
			done = true; 
		 }

	  }

}

