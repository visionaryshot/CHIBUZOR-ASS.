import java.util.Scanner;
public class Nokia {
public static void main(String[] args ) {
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
  Scanner inputcollector = new Scanner(System.in);
      System.out.print("Select any option:");
      int input = inputcollector.nextInt();
  
switch(input){
  case 1:System.out.println("Phonebook");
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
  
""");

System.out.println("Enter option 8 to proceed:");
int input1 = inputcollector.nextInt();
switch(input1) {
case 8 :
System.out.print(

"""
1. Type of view
2. Memory status
""");
break;
case 1: 
System.out.println("Search");
break;
case 2: 
System.out.println("Service Nos");
break;
case 3: 
System.out.println("Add name");
break;
case 4: 
System.out.println("Erase");
break;
case 5: 
System.out.println("Edit");
break;
case 6: 
System.out.println("Assign tone");
break;
case 7: 
System.out.println("Send b' card ");
case 9: 
System.out.println("Speed dials");
break;
case 10: 
System.out.println("Voice tags");
break;

}

break;

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

  """);

 System.out.println("Select any option:");
 int input2 = inputcollector.nextInt();

switch(input2) {
case 7 : 
System.out.print(
                   
"""
1.Set
2.Common
""");

System.out.print("Select 1 or 2:");
int input3 = inputcollector.nextInt();
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

break;

case 1: 
System.out.println("Write messages");

break;

case 2: 
System.out.println("Inbox");

break;


case 3: 
System.out.println("Outbox");

break;


case 4: 
System.out.println("Picture message");

break;


case 5: 
System.out.println("Templates");

break;


case 6: 
System.out.println("Smileys");

break;
case 8: 
System.out.println("Info services");
break;
case 9: 
System.out.println("Voice mailbox number");
break;
case 10: 
System.out.println("Services");
break;


}

break;

case 3: System.out.print("""
    Chat
""");
int userinput = inputcollector.nextInt();

break;
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
 
""");

System.out.println("select any option:");
int input5 = inputcollector.nextInt();

switch(input5) {
case 5 : 
System.out.print(
                   
"""
5.Show call duration
6.Show call cost
7.Call cost settings

""");

System.out.print("Select 5 or 6 or 7:");
int user = inputcollector.nextInt();
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

case 1: 
System.out.println("Missed calls");

break;

case 2: 
System.out.println("Recieved calls");

break;

case 3: 
System.out.println("Dialled numbers");

break;

case 4: 
System.out.println("Erase recent call lists ");

break;

case 8 : 
System.out.println("Prepaid credits");

}


break;

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
""");

System.out.print("Select any option:");
int input7 = inputcollector.nextInt();
switch(input7) {

case 1: 
System.out.println("Ringing tone");
break;
case 2: 
System.out.println("Ringing volume");
break;
case 3: 
System.out.println("Incoming call alert");
break;
case 4: 
System.out.println("Composer");
break;
case 5: 
System.out.println("Message alert tone");
break;
case 6: 
System.out.println("Warning and game tones");
break;
case 7: 
System.out.println("Vibrating alert");
break;
case 8: 
System.out.println("Screen saver");
break;
}


case 6:System.out.println("Settings");

System.out.println(
"""
1. Call settings
2. Phone settings
3. Security settings
4. Restore factory settings
""");

System.out.print("click any option:");
int casie = inputcollector.nextInt();
switch(casie){
case 1: 
System.out.println(
"""
1.Call settings
2.Phone settings
3.Call waiting options
""");

System.out.println("Select 1 or 2 or 3");
int settings = inputcollector.nextInt();
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
}
break;

case 7: 
 System.out.print("""
      Call divert
""");

break;


case 8:
System.out.println("Games"); 
break;



case  9:
System.out.println("Calculator");
break;


case 10:
System.out.println("Reminder"); 
break;
case 11:System.out.println("Clock");
System.out.println(
"""
1. Alarm clock
2. Clock settings
3. Date setting
4. Stopwatch
5. Countdown timer
6.Auto update of date and time
""");



System.out.print("click any option:");
int Alarm = inputcollector.nextInt();
switch(Alarm){

case 1: 
System.out.println("Alarm clock");
break;
case 2: 
System.out.println("Clock settings");
break;
case 3: 
System.out.println("Date setting");
break;
case 4: 
System.out.println("Stopwatch");
break;
case 5: 
System.out.println("Countdown timer");
break;
case 6: 
System.out.println("Auto update of date and time");
break;
}
break;
case 12:
System.out.println("Profiles");

 
break;

case 13:
System.out.println("SIM services");
break;

default:System.out.print("wrong command");

}
}
}


