import java.util.Scanner;
public class NokiaFunctions {

public static void mainMenu() {

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
}

public static int GoToPhonebook(int phonebookInput) {
Scanner input = new Scanner(System.in);
switch (phonebookInput){
 case 1: System.out.println("1-> Phone book");
System.out.print( 

     """
  1. Search
  2. Service Nos
  3. Add name
  4. Erase
  5. Edit
  6. Assign tone
  7. Send b'card
  8. Option
  9. Speed dials
  10. Voice tags 
  11. Go back	
  
""");


System.out.print("Enter option 8 to proceed:");
int input11 = input.nextInt();
switch(input11) {
case 8 :
System.out.print(
                  """
1. Type of view
2. Memory status
""");
break;
case 1: System.out.println("Search");break;
case 2: System.out.println("Service Nos");break;
case 3: System.out.println("Add name");break;
case 4: System.out.println("Erase");break;
case 5: System.out.println("Edit");break;
case 6: System.out.println("Assign tone");break;
case 7: System.out.println("Send b' card ");break;
case 9: System.out.println("Speed dials");break;
case 10:System.out.println("Voice tags");break;
case 11:mainMenu(); break;
default:System.out.print("Wrong input");
}
}	return phonebookInput;
}

public static int GoToMessages(int messageInput) {
Scanner input = new Scanner(System.in);
switch (messageInput){

case 2: System.out.println("Messages");
 System.out.print("""
  1-> Write messages
  2-> Inbox 
  3-> Outbox
  4-> Picture messages
  5-> Templates
  6-> Smileys
  7-> Message settings
  8-> Info services
  9-> Voice mailbox number
  10-> Service command editor
  11-> Go back
  """);
	
System.out.print("messages:");
System.out.print("Enter any option:");
int input22 = input.nextInt();
switch (input22) {
case 7 : 
System.out.print(
                   
"""
1.Set
2.Common
""");

System.out.print("Select 1 or 2:");
int input3 = input.nextInt();
switch(input3) {
case 1:
System.out.println("""
 1. Message centre number
 2. Message sent as
 3. Message validity
  """);

break;

case 2:
System.out.println("""
 
 1. Delivery reports
 2. Reply via same centre
 3. Character support
  """);

break;
}
case 1: System.out.println("Write messages");break;
case 2: System.out.println("Inbox");break;
case 3: System.out.println("Outbox");break;
case 4: System.out.println("Picture message");break;
case 5: System.out.println("Templates");break;
case 6: System.out.println("Smileys");break;
case 8: System.out.println("Info services");break;
case 9: System.out.println("Voice mailbox number");break;
case 10: System.out.println("Services");break;
case 11:mainMenu(); break;
default:System.out.print("Wrong input");
}
}	return messageInput;
}

public static int GoToChat(int ChatInput) {
Scanner input = new Scanner(System.in);
switch (ChatInput){
case 3: System.out.println("3-> Chat");break;
}

return ChatInput;
}

public static int GoToCallregister(int CallregisterInput) {
Scanner input = new Scanner(System.in);
switch (CallregisterInput){
case 4:System.out.println ("Call register");
   System.out.print(

  """
 1. Missed calls
 2. Received calls
 3. Dialled numbers
 4. Erase recent call list
 5. Show call duration
 6. Show call cost
 7. Call cost setting
 8. Prepaid credit
 9. Go back
 
""");

System.out.println("select any option:");
int input5 = input.nextInt();

switch(input5) {
case 5 : 
System.out.print(
                   
"""
5.Show call duration
6.Show call cost
7.Call cost settings

""");

System.out.print("Select 5 or 6 or 7:");
int user = input.nextInt();
switch(user) {
case 5: System.out.println(

"""
 1. Last call duration
 2. All call's duration
 3. Received call's duration
 4. Dialled call's duration
 5. Clear timers
  """);

break;

case 6: System.out.println(

 """
 1. Last call cost
 2. All call's cost
 3. Clear counters
 """);

break;


case 7: System.out.println(

""" 
 1. Call cost limit
 2. Show costs in 
 
""");
break;
}

case 1: System.out.println("Missed calls");break;

case 2: System.out.println("Recieved calls");break;

case 3: System.out.println("Dialled numbers");break;

case 4: System.out.println("Erase recent call lists ");break;

case 8 :System.out.println("Prepaid credits");break;

case 9:mainMenu(); break;

default:System.out.print("Wrong input");

}

} return CallregisterInput;

}


public static int GoToTones(int TonesInput) {
Scanner input = new Scanner(System.in);
switch (TonesInput){
case 5: System.out.println("Tones");
 System.out.print(

  """
 1. Ringing tone
 2. Ringing volume
 3. Incoming call alert
 4. Composer
 5. Message alert tone
 6. Warning and game tones
 7. Vibrating alert
 8. Screen saver 
 9. Go back
""");

System.out.print("Select any option:");
int input7 = input.nextInt();
switch(input7) {

case 1: System.out.println("Ringing tone");break;

case 2: System.out.println("Ringing volume");break;

case 3: System.out.println("Incoming call alert");break;

case 4: System.out.println("Composer");break;

case 5: System.out.println("Message alert tone");break;

case 6: System.out.println("Warning and game tones");break;

case 7: System.out.println("Vibrating alert");break;

case 8: System.out.println("Screen saver");break;

case 9:mainMenu(); break;

default:System.out.print("Wrong input");

}

} return TonesInput;

}


public static int GoToSettings(int SettingsInput) {
Scanner input = new Scanner(System.in);
switch (SettingsInput){
case 6:System.out.println("Settings");

System.out.println(
"""
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
5. Go back
""");

System.out.print("click any option:");
int input222 = input.nextInt();
switch(input222){
case 1: 
System.out.println(
"""
1.Call settings
2.Phone settings
3.Call waiting options
""");

System.out.println("Select 1 or 2 or 3");
int settings = input.nextInt();
switch(settings) {
case 1: System.out.println("""
1.Automatic redial
2.Speed dialing
3.Call waiting option
4.Own number sending
5.Phone line in use
6.Automatic answer
""");
break;

case 2:System.out.println(
"""
1.Language
2.Cell info display
3.Welcome note
4.Network selection
5.Light
6.Confirm SIM service actions
""");
break;

case 3:System.out.println(
"""
1.PIN code request
2.Call barring service
3.Fixed dialling
4.Closed user group
5.Phone security
6.Change access codes
"""); 
break;
}
break;
case 4:System.out.println("""
Restore factory settings
""");
break;
case 5: mainMenu(); break;
default:System.out.print("Wrong input");
}
}   return SettingsInput;
}


public static int GoToCalldivert(int CalldivertInput) {
Scanner input = new Scanner(System.in );
switch (CalldivertInput){
case 7:System.out.println("Calldivert");break;
}
     return CalldivertInput;
}

public static int GoToGames(int GamesInput) {
Scanner input = new Scanner(System.in);
switch (GamesInput){
case 8:System.out.println("Games");break;
}
 return GamesInput;

}

public static int GoToCalculator(int CalculatorInput) {
Scanner input = new Scanner(System.in);
switch (CalculatorInput){
case 9:System.out.println("Calculator");break;
}
 return CalculatorInput;

}


public static int GoToReminders(int RemindersInput) {
Scanner input = new Scanner(System.in);
switch (RemindersInput){
case 10:System.out.println("Reminders");break;
}
 return RemindersInput;

}

public static int GoToClock(int ClockInput) {
Scanner input = new Scanner(System.in);
switch (ClockInput){
case 11: System.out.println("Clock");
 System.out.print(

  """
 1. Alarm clock
 2. Clock settings
 3. Date settings
 4. Stopwatch
 5. Countdown
 6. Auto update of date and time
 7. Go back
""");

System.out.print("Select any option:");
int input77 = input.nextInt();
switch(input77) {

case 1: System.out.println("Alarm clock");break;

case 2: System.out.println("Clock settings");break;

case 3: System.out.println("Date settings");break;

case 4: System.out.println("Stopwatch");break;

case 5: System.out.println("Countdown");break;

case 6: System.out.println("Auto update of date and time");break;

case 7:mainMenu(); break;

default:System.out.print("Wrong input");

}

} return ClockInput;

}

public static int GoToProfiles(int ProfilesInput) {
Scanner input = new Scanner(System.in);
switch (ProfilesInput){
case 12:System.out.println("Profiles");break;
}
 return ProfilesInput;

}

public static int GoToSIMservices(int  SIMservicesInput) {
Scanner input = new Scanner(System.in);
switch ( SIMservicesInput){
case 13:System.out.println(" SIMservices");break;
}
 return  SIMservicesInput;

}

























}

