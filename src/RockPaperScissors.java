public class RockPaperScissors {
    private String randomChoice;

    public RockPaperScissors(){
        randomChoice = "";
    }

    public String makeChoice(){
        int integer = (int)(Math.random() * 3);
        if (integer == 0){
            this.randomChoice = "rock";
        }
        if (integer == 1){
            this.randomChoice = "paper";
        }
        if (integer == 2){
            this.randomChoice = "scissors";
        }
        return randomChoice;
    }

}
