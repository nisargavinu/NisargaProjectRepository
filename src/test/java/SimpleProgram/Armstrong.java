package SimpleProgram;
import java.lang.*;
import java.io.*;

public class Armstrong {

    public void findArm(int num){
        int rem, sum=0, num1=num;
        while(num1>0) {
            rem = num1 % 10;
            num1= num1 / 10;
            sum = sum + (rem * rem * rem);
        }
        if(sum==num){
            System.out.println("Provided number " +num+ "Armstrong number");
        }
        else{
            System.out.println("Provided number " +num+ "is not Armstrong number");
        }

    }

    public static void main(String[] arg){
        Armstrong am = new Armstrong();
        am.findArm(153);

    }
}
