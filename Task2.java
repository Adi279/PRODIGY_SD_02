import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int guessNo=(int)(Math.random()*100);
        boolean flag=true;
        int count=0,num;
        String condition;
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess a number between 0 to 100:\n");
        while(flag)
        {
            num=sc.nextInt();
            if(num<guessNo)
            {
                System.out.println("Guess is too low....guess again");
                ++count;
            }
            else if(num>guessNo)
            {
                System.out.println("Guess is too high....guess again");
                ++count;
            }
            else
            {
                ++count;
                System.out.println("Well done....Your guess is correct!!");
                System.out.println("It took you "+count+" no of guesses to find out the correct number!");
                System.out.println("Do you want to play again? Press [y] for yes or [n] for no: ");
                condition=sc.next();
                if(condition.equals("y"))
                {
                    flag=true;
                    count=0;
                    guessNo=(int)(Math.random()*100);
                    System.out.println("Guess a number between 0 to 100:\n");
                }
                else{
                    flag = false;
                }
            }
        }
    }
}
