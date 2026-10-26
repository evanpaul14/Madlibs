import java.util.Scanner;
public class Madlibs {
    Scanner scanner = new Scanner(System.in);
    String story = "Without warning, a wild <noun> burst into the <adjective1> computer lab and started to <verb> directly toward the server. The manager dropped a tray of <pluralNoun> into the <place> causing <adjective2> laughter!";

    System.out.println("Welcome to Mad Libs!");
    System.out.println("Please provide words to complete the story.\n");
    // Split the story around noun
    int startNoun = story.indexOf("<");
    int endNoun = story.indexOf(">");
    String part1 = story.substring(0, startNoun);
    String part2 = story.substring(endNoun + 1);
    // Enter the noun
    System.out.print("Enter a noun: ");
    String noun = scanner.nextLine();
    story = part1 + noun + part2;
}
