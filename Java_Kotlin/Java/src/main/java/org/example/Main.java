package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int inputNumber=scan.nextInt();
      List<Integer> AllStudent=new ArrayList<>();

      for(int i=0;i<inputNumber;i++){
          int not =scan.nextInt();
          AllStudent.add(not);
      }



        System.out.println(gradingStudents(AllStudent));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> returnData=new ArrayList<>();


        for (int not:grades) {
            if(not<38) returnData.add(not);
            else if (not%10==2 ||not%10==1||not%10==6|| not%10==7) returnData.add(not);
            else if (not%10>5 && (10-not%10)<=3) returnData.add(not+(10-not%10));
            else if(not%10<5 && (5-not%10)<=3)returnData.add(not+(5-not%10));
            else returnData.add(not);
        }

        return returnData;
    }

}

