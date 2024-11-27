import java.util.Scanner;

public class classwork {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int score=0;
        System.out.println("Carefully listen ,for every right answer you gain +2 For wrong answer -1");
        System.out.println ("1.What is the capital of Bhutan ?\n a.Dhaka     b.Kathmandu      c.Thimphu ");
        System.out.print("Your answer: ");
        char answer1 = input.next().charAt(0);

        if (answer1 == 'c' || answer1 == 'C') {
            System.out.println("Correct!");
            score+=2;
        } else {
            System.out.println("Wrong! The correct answer is c. Thimphu");
            score--;
        }


        System.out.println ("2. The curency of Russia is !\n a.Taka     b.Russian Ruble     c.Dolar ");
        System.out.print("Your answer: ");
        char answer2 = input.next().charAt(0);

        if (answer2 == 'b' || answer2 == 'b') {
            System.out.println("Correct!");
            score+=2;
        } else {
            System.out.println("Wrong! The correct answer is b. Russian Ruble");
            score --;
        }


        System.out.println ("3.Concider x,y,z are the angle of a Triangle  ,which equation is right ?\n a.x+y+z=180     b.x+y+z>180      c.x+y+z<180 ");
        System.out.print("Your answer: ");
        char answer3=input.next().charAt(0);
        if (answer3 == 'a') {
            System.out.println("Correct!");
            score+=2;
        } else {
            System.out.println("Wrong! The correct answer is a.x+y+z=180");
            score --;
        }
        System.out.println ("4.The bigest city of the world is ...\n a.Dhaka    b.Zurich      c.London ");
        System.out.print("Your answer: ");
        char answer4=input.next().charAt(0);
        if (answer4 == 'b') {
            System.out.println("Correct!");
            score+=2;
        } else {
            System.out.println("Wrong! The correct answer is b.Zurich");
            score --;
        }
        System.out.println ("4.what is the time zone of BANGLADESH ?\n a.UTC+5    b.UTC+6      c.UTC=12 ");
        System.out.print("Your answer: ");
        char answer5=input.next().charAt(0);
        if (answer5 == 'b') {
            System.out.println("Correct!");
            score+=2;
        } else {
            System.out.println("Wrong! The correct answer is b.UTC+6");
            score --;
        }

           System.out.println("Question Finished ,better luck for the next time ");
           System.out.println("Your score is : "+ score);
        }



    }

