package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by JPMPC-B201 on 11/12/2016.
 */
public class MyMethods {

//    public static int getNumSubjects(boolean student, boolean work) {}

// else if statement
       /* int numSubjects = 6;

        if (work) {

            numSubjects = 6;
        } else if (!student && !work)
            numSubjects = 5;

        else {
            numSubjects = 7;
        }

        return numSubjects;
    }*/


  /*  // while Loop
    public static void printWhile(int number) {

        int n = 1;

        while (n <= number) {
            System.out.print("[" + n + "]");
            n++;
        }
    }*/

    // while loops (11/4/2016)

   // Write a method with a while loop
   // that computes the sum of first n positve integers;
   // sum = 1 + 2 + 3 + 4 + 5 ... + n

// Solutions:
//--------------------------------------------------------------------//
   /* public static int Sum_of_Integers(){

        int n=1;
        int s=0;

        while (n<= 6){

            s+= n;
            n++;


          //  System.out.println("The sum is "     + s );
        }
        return s;
//   - - -- - - -------------------------------------------------------------//
        */




  // do while loop
//----------------------------------------------------------------------------------------------//
    /*public static void Do_While_loop(int number) {

        int num = 1;
        int sum = 0;

        do {

            System.out.print("[" + num + "]");
            num++;

        } while (num <= number);

//-------------------------------------------------------------------------------------------------//

*/

 /*   // For loop
    public static void For_Loop_Friends(){

        String MyFriends[]={"Dan","Wayne","Loki","Tabads","Amille"};
        for (int i =0;i < MyFriends.length;i++){

            System.out.println(MyFriends[i]);
        }


    }*/

//---------------- This program will return random of friends..----------------------------------//

    public static String myFriends() {
        List<String> myFriends = new ArrayList<String>();

        Random rand = new Random();
        int getsRand = rand.nextInt(6);

        myFriends.add("Arboy");
        myFriends.add("Larrobis");
        myFriends.add("Mark");
        myFriends.add("Gart");
        myFriends.add("Wayne");
        myFriends.add("Adalid");


        return myFriends.get(getsRand);

    }

    //---------------- This program code will return random of relationships ..-----------------//
    public static String relationship(){

        List<String> relationship = new ArrayList<String>();

        Random rand = new Random();
        int getsRand =rand.nextInt(6);

            relationship.add(" Loves ");
            relationship.add(" Friendzoned ");
            relationship.add(" Mutual Understanding ");
            relationship.add(" Super Best Friend ");
            relationship.add(" Hates ");
            relationship.add(" Super Crush ");


        return relationship.get(getsRand);
    }

    //---------------- This program code will return random of girlfriends..-----------------//

    public static String girlFriends(){
        List<String> girlFriends = new ArrayList<String>();

        Random rand = new Random();
        int getsRand =rand.nextInt(6);

        girlFriends.add(" Angel Locsin ");
        girlFriends.add(" Angelina Jolie ");
        girlFriends.add(" Jennelyn Mercado ");
        girlFriends.add(" Jackilyn Jose ");
        girlFriends.add(" Ann Curtis ");
        girlFriends.add(" Kyrelle Yuson ");


        return girlFriends.get(getsRand);
    //------- -----End of Code Block -------------------------------------------------------//





    }


}






