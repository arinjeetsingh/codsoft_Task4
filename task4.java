import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Storming Quiz !!!\n");
        System.out.println("Rules :");
        System.out.println("1. There will be 3 questions in the quiz.");
        System.out.println("2. Out of 4 options only one is correct.");
        System.out.println("3. You will be given only 15 sec to answer each question.");
        System.out.println("4. +4 for correct, -1 for wrong , 0 if you fail to answer within time.");
        System.out.println("5. Timer will start as soon as the question will be displayed.\n");
        System.out.println("\t LETS START \n");
        String Questions[] = {
                "The Centre for Cellular and Molecular Biology is situated atThe Centre for Cellular and Molecular Biology is situated at.",
                "Where is the Railway Staff College located?",
                 "The famous Dilwara Temples are situated in",
                };
        String options[] = { "1)Patna\n2)Bombay\n3)Gwalior\n4)Hyderabad\n",
                "1)Varanasi\n2)Vadodara\n3)Allahabad\n4)Gwalior\n",
                "1)Rajasthan\n2)Uttar pradesh\n3)Bihar\n4)Goa\n",
                 };
        int score = 0;
        int answers[] = { 4, 2, 1 };
        int users_input[] = new int[5];
        System.out.println("Press 1 to begin--");
        int k = sc.nextInt();
        switch (k) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    System.out.println("Q" + (i + 1) + ".");
                    System.out.println(Questions[i]);
                    System.out.println(options[i]);
                    long t1 = System.currentTimeMillis() / 1000;
                    System.out.print("Enter answer:");
                    users_input[i] = sc.nextInt();
                    long t2 = System.currentTimeMillis() / 1000;

                    if ((t2 - t1) <= 15 && (answers[i] == users_input[i])) {
                        score += 4;
                        System.out.println("Time took : " + (t2 - t1) + "s\n");
                    } else if ((t2 - t1) <= 15 && (answers[i] != users_input[i])) {
                        score -= 1;
                        System.out.println("Time took : " + (t2 - t1) + "s\n");
                    } else {
                        System.out.println("Time took : " + (t2 - t1) + "s");
                        System.out.println("This answer will not be evaluated because of over time.\n");
                    }
                    t1 = 0;
                    t2 = 0;
                }
                System.out.println("\nScore : " + score + "/12");
                System.out.println("\nCorrect Ans.   Your Ans.");
                for (int i = 0; i < 3; i++) {
                    System.out.println("\t" + answers[i] + "\t" + users_input[i]);
                }
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
        sc.close();
    }
}
