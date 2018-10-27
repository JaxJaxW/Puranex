import java.util.Scanner;
import Attributes.*;

public class Game {

    private static Scanner response = new Scanner(System.in);

    public static void main(String[] args) {

        String input, name, study;


        System.out.println("WELCOME TO PURANEX!");
        System.out.println("The finest city in the Northern Federation where dreams are reality!");
        System.out.println("What is your name young initiate?");

        name = response.next();

        /*while (true) {
            try {
                input = Integer.parseInt(response.next());
                if (input <= 0) {
                    System.out.println("Please enter a valid ");
                    continue;
                }
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Please enter a valid ");
            }
        }*/

        System.out.println("Ahh very well " + name + "! Allow me to welcome you to the league of heroes!");
        System.out.println("Many of our grand members have been summoned to Alpha Dex 5 to deal with the resurgence");
        System.out.println("of the Overlords in that quadrant so let's jump right in, shall we.");
        System.out.println("While here are you focusing on studying the blade arts of Sverð or the elemental arts of Galdur?");
        System.out.println("If you wish to study blade arts type \"Sword\" and hit Enter. To study elemental arts type \"Magic\" and hit Enter");
        study = response.next().toLowerCase();

        Study:
        while (true) {
            String master, joke;
            switch (study) {
                case "sword":
                    master = "Galdur";
                    joke = "And to set the record straight, Absedemus did not turn his last apprentice into a white rabbit.\nHeaven forbid why does everyone think he's a mere magician!";
                    System.out.println("Wonderful choice! Master " + master + " will surely be glad to meet you.\n" + joke);
                    break Study;
                case "magic":
                    master = "Sverð";
                    joke = "Oh be careful in conversation with Viknar, he can tend to be a touch \033[3msharp\033[0m in remark.\nAnd do watch the swinging blade trap!";
                    System.out.println("Wonderful choice! Master " + master + " will surely be glad to meet you.\n" + joke);
                    break Study;
                default:
                    System.out.println("Please respond with either \"Sword\" or \"Magic\" and hit Enter to record your response.");
                    break;
            }
        }






    }








}
