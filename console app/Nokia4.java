import java.util.Scanner;
public class Nokia4 {

public static void main(String[] args ) {

Scanner input = new Scanner(System.in);
   String prompt = ("""
     
        WELCOME TO NOKIA 
            3310

  1-> Phone book 
  2-> Message
  3-> Chat
  4-> Call register
  5-> Tones
  6-> Settings
  7-> Call divert
  8-> Games
  9-> Calculator
  10-> Reminders
  11-> Clock
  12-> Profiles
  13-> SIM services
""");
 
       System.out.println(prompt);
System.out.println("Enter any option:");
int mainMenuInput = input.nextInt();
switch(mainMenuInput) {
	case 1: NokiaFunctions.GoToPhonebook(mainMenuInput); break;
        case 2: NokiaFunctions.GoToMessages(mainMenuInput); break;
        case 3: NokiaFunctions.GoToChat(mainMenuInput); break;
	case 4: NokiaFunctions.GoToCallregister(mainMenuInput);break;
        case 5: NokiaFunctions.GoToTones(mainMenuInput);break;
	case 6: NokiaFunctions.GoToSettings(mainMenuInput);break;
	case 7: NokiaFunctions.GoToCalldivert(mainMenuInput);break;
	case 8: NokiaFunctions.GoToGames(mainMenuInput); break;
	case 9: NokiaFunctions.GoToCalculator(mainMenuInput); break;
        case 10: NokiaFunctions.GoToReminders(mainMenuInput); break;
	case 11: NokiaFunctions.GoToClock(mainMenuInput);break;
	case 12: NokiaFunctions.GoToProfiles(mainMenuInput);break;
	case 13: NokiaFunctions.GoToSIMservices(mainMenuInput);break;

        
}
    
}
}
