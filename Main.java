class Main {
  public static void main(String[] args) {
    printMsg("Monday");
    printMsg("Tuesday");
    printMsg("Wednesday");
    printMsg("Thursday");
    printMsg("Friday");
    printMsg("Saturday");
    printMsg("Sunday");
  }

  //create the method here
   
     public static void printMsg(String Month){
    switch(Month){
      case "Monday":
      case "Tuesday":
      case "Wednesday":
      case "Thursday":
        System.out.println("Working Hard!!!");
      case "Friday":
        System.out.println("The weekend is almost here! TGIF!!!");
      case "Saturday":
      case "Sunday":
        System.out.println("It's party time! Alright, Alright, Alright!");
        break;
      default:
        System.out.println("You partied too hard this weekend!");
    }
  }
}


//Create a method that takes a day of the week as a String and prints one of these messages:
   
  // Monday-Thursday -> "Working Hard!!!"
  // Friday -> "The weekend is almost here! TGIF!!!"
   //Saturday-Sunday -> "It's party time! Alright, Alright, Alright!"
  // Funday/Dogday/BlaBlaDay/AnythingElse -> "You partied too hard this weekend!"  

//Use switch statement to control the flow of the execution. 


