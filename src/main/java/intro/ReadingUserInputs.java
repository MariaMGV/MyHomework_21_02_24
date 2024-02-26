package intro;
import java.util.Scanner;

public class ReadingUserInputs
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//test if updating works
        System.out.println("Please, enter your name:");
        String userName = sc.nextLine();

        System.out.println("Nice to meet you, " + userName + "!" + " What is your favorite hobby?");
        String userHobby = sc.nextLine();

        System.out.println("That's great, " + userName + "!" + " And my hobby is " + userHobby + " too :) .");


    }
}
