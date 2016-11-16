import classes.Customer;
import classes.Employee;
//import classes.MyMethods;
import classes.MyMethods;
import classes.Person;

import java.util.Random;

import static classes.MyMethods.*;

public class Main {



    public static void main(String[] args) {

        //System.out.println("You can take " + MyMethods.getNumSubjects(true,true) + " subjects");

        // this line is for display

//-----------------------------------------------------------------------------------------------------//
        /* byte byteVariable = 127;
       short mobo =32767;
       int decimal =2147483;
       long largeDecimalVariableFrom = -922320;
       float numberWithdDecimalPlaces =8.2f;
       double verylarge = 1231;
       boolean trueorfalse = true;
       char usakaletra = 'A';
       String name = "Venhor";
       largeDecimalVariableFrom = decimal;*/
//----------------------------------------------------------------------------------------------------//
     /*  int grades [] = new int [5];
       grades[0] = 89;
       grades[1] = 90;
       grades[2] = 91;
       grades[3] = 92;
       grades[3] = 93;


       System.out.println ("English" + grades [0]);
       System.out.println ("Math" + grades [1]);
       System.out.println ("Science" + grades [2]);
       System.out.println ("Geometry" + grades [3]);
       System.out.println ("Filipino" + grades [4]);
*/
//---------------------------------------------------------------------------------------------------//
  /*   String errorMessages[] = new String [3];
       errorMessages[0] = "Page not found";
       errorMessages[1] = "No network found";
       errorMessages[2] = "No read return";

       System.out.println ("Error 1 ="+ errorMessages [0]);
       System.out.println ("Error 2 ="+ errorMessages [1]);
       System.out.println ("Error 3 ="+ errorMessages [2]);

*/

//-------------------------------------------------------------------------------------------------//

//-------------------------------------------------------------------------------------------------//
  /*  // System.out.println("HELLO WORLD");
       System.out.println(byteVariable  );
       System.out.println( mobo  );
       System.out.println( decimal );
       System.out.println(largeDecimalVariableFrom );
       System.out.println(numberWithdDecimalPlaces );
       System.out.println(verylarge );
       System.out.println(trueorfalse );
       System.out.println(usakaletra );
       System.out.println(name );

*/

//----------------------------------------------------------------------------------------------------//
     /* Person personObject = new Person();
       personObject.setName("Venz");
       personObject.setGender(true);
       personObject.setAge(23);
       personObject.setEmail("degamo@gmail.com");
       personObject.setHeight(167);
       personObject.setWeight(67);


       System.out.println("Name=" +personObject.getName());
       System.out.println("Gender="+personObject.isGender());
       System.out.println("Age="+personObject.getAge());
       System.out.println("Email="+personObject.getEmail());
       System.out.println("Height="+personObject.getHeight());*/


      /* Employee employee=new Employee();
       employee.setName("James");
       employee.setDepartment("Accounting");
       employee.setId(1);
       employee.setPagibig_id(2);

       System.out.println("The  Name is "+employee.getName());
       System.out.println("The Department is "+employee.getDepartment());
       System.out.println("The ID no. is "+employee.getId());
       System.out.println("The The Pag-ibig ID  is "+employee.getPagibig_id());

       Customer customer = new Customer();
       customer.setCustomer_ID(1);
       customer.setAddress("San Jose Cebu City");
       customer.setLevel(2);
       customer.setCredit_card(21349);
       customer.setMembership_id(2);
       customer.setName("Ven");*/

       /*System.out.println("The customer id is " +customer.getCustomer_ID());
       System.out.println("The customer level is "+customer.getLevel());
       System.out.println("The customer address is "+customer.getAddress());
       System.out.println("The customer credit card no is" +customer.getCredit_card());
       System.out.println("The customer Membership ID is"+customer.getMembership_id());

       System.out.println(customer.introduceYourself("Venz Alpha","  I from  " + customer.getAddress()));
       System.out.println(employee.introduceYourself("Venz Beta","   I from  " + employee.getDepartment()));*/
        // System.out.println("Hi I am "+employee.introduceYourself("James1"));


       /*int a = 13;
       int b =5;

       if( a < b )

       {
           System.out.println(a +  "  is less than  "+b);
       }
       else{
           System.out.println(a+ "is greater than " +b);
       }*/


      /* int number =2;

       if (number >= 13)
       {

           System.out.println(number+ " is less than " );

       }else if (number == 13){

           System.out.println(number+ " is greater or equal to ");

       }*/


        //**Primitive variables */

        /*int tstudents = 20;
        int cstudents = 16;
        String day = "Tuesday";

        if (day=="Monday" && cstudents <= 15) {
            System.out.println("Today is "+ day);
            System.out.println("Current subject is Math and Teacher 1, has a total of "+cstudents+" students");
        }else if(day=="Tuesday" && cstudents == tstudents){
            System.out.println("Today is "+ day);
            System.out.println("Current subject is Science and Teacher 3, has a total of "+cstudents+" students");
        }

        if(cstudents < tstudents || cstudents > tstudents){
            System.out.println("Current subject is English, OOP & Server Maintenance, has a total of "+cstudents+" students");
        }
        */

      /* *//* boolean weekday = true;
        boolean weekday = false;

        if (!weekday || holiday) {
            System.out.println("Today is vacation")

        } else {
            System.out.println("Today is not vacation")*//**//*
        }*//*
    }
}*/


   /*// A regular student could get a maximum of 7 subjects per trimester but an irregular student can only
   //   only do 5 unless he is working as part-time in school which will allow to take 6 subjects . But,
   // regular students working as part-time in school can only do 6 subjects too.

   // Create a logic that will satisfy the logic above. Then, set your code with the following scenarios.

        //Regular student = 7 subjects
        // Regular student but working part time in school = 6 subjects;
        // Irregular student = 5 subject;
        // Irregular but working part-time = 6 subjects;*/


  /* boolean Regular_students=false;
   boolean Partime=true;

        if (Partime==true){

            System.out.println("The regular students but working in part time has 6 subjects");
        }
        else if(!Regular_students && !Partime) {

            System.out.println("The irregular students has 5 subjects");
        }
            else{

                System.out.println("The irregular students has 7 subjects only !");

            }*/

/*
            boolean isRegular = false;
            boolean isWorking = false;*/

            //System.out.println(getNumSubjects(isRegular,isWorking))

// Switch  Statements

      /*  boolean isPartTime = true;
        int isPar = 0;
        int getNum = MyMethods.getNumSubjects(true, true);
        String message;


        switch (isPar) {

            case 1:

                message = "Regular /Irregular Student but working part-time in school  = " + getNum;

                break;

            default:
                message = isRegular ? "Regular Student =" + getNum : "Irregular Student =" + getNum ;
                break;
        }
        System.out.println(message);*/


// While


      //  MyMethods.printWhile();
      //  MyMethods.printWhile();

     //   System.out.println("The sum is "     + MyMethods.Sum_of_Integers());

//        System.out.println("The sum is "     + MyMethods.Do_While_loop(9));


/*// do while loop
          MyMethods.Do_While_loop(9);*/


// For Loops Example
//        MyMethods.For_Loop_Friends();


        /*Random ran = new Random();
        int top = 3;
        char data = ' ';
        String dat = "";

        for (int i=0; i<=top; i++) {
            data = (char)(ran.nextInt(25)+97);
            dat = data + dat;
        }

        System.out.println(dat);*/

//------------------------------------------------------------------------------------------------------------------

          //  System.out.print(MyMethods.myFriends() + " " + MyMethods.relationship() + " " + MyMethods.girlFriends());
        

         //   System.out.print(MyMethods.relationship());
         //   System.out.print(MyMethods.girlFriends());




//--------------------------------------------------------------------------------------------------------------------------------------------//

//-------------------------------------This code will return random display of boy and girl interchanges----------------------------------------//
       Random rand = new Random();

        boolean getRandom = rand.nextBoolean();


        System.out.println(getRandom);
        if (getRandom==true) {

            System.out.println(MyMethods.myFriends() + " " + MyMethods.relationship() + " " + MyMethods.girlFriends());

        }else {

            System.out.println(MyMethods.girlFriends() + " " + MyMethods.relationship() + " " + MyMethods.myFriends());

        }

   //----------------------------------------------------------------------------------------------------------------------------//
            }

    }

