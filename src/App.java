import java.util.*;
    //The problem should include the split method. You might also add in any String methods
    //or array skills. Think about Practice Quiz problem or CodingBat problems.
    //Create a question AND a solution to that question

    //Give instructions for your problem below:
    //take in NFL team names and records seperated by commas. For example "Rams,8-2". 
    // Print the name of and numbers of wins for the team with the most wins

public class App {
    public static void main(String[] args) throws Exception {
        //Write setup code (if needed)
        Scanner reader = new Scanner(System.in);
        ArrayList<String> Storage = new ArrayList<>();
        ArrayList<String> Teamnames = new ArrayList<>();
        ArrayList<String> Records = new ArrayList<>();
        ArrayList<String> Wins = new ArrayList<>();
        int maxwins = 0;
        int teammostwins=0;
        System.out.println("enter all team names and records:");
        while (true) {
            String temp = String.valueOf(reader.nextLine());
            if(temp.equals("")){
                break;
            }
            Storage.add(temp);
            
        }
        for(int i = 0; i < Storage.size(); i++ ){
            String[] splitcommas = Storage.get(i).split(",");
            Teamnames.add(splitcommas[0]);
            Records.add(splitcommas[1]);
        }
        for(int i = 0; i < Storage.size(); i++){
            String[] splithyphens = Records.get(i).split("-");
            int wins = Integer.parseInt(splithyphens[0]);
            if(wins > maxwins){
                maxwins = wins;
                teammostwins = i;
            }

            
        }
        System.out.println("The team with the most wins is: " + Teamnames.get(teammostwins )+" with "+ maxwins + "wins");
        





        // ######################################
        // Leave room to complete code below
    }
}
