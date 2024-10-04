package katatennis;

public class TennisGame1 implements TennisGame {
    
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) throws IllegalArgumentException {
        if (playerName.equals(this.player1Name))
            scorePlayer1 += 1;
        else if (playerName.equals(this.player2Name))
            scorePlayer2 += 1;
        else {
            throw new IllegalArgumentException("Invalid player name");
        }
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore=0;
        if (scorePlayer1 == scorePlayer2)
        {
            switch (scorePlayer1)
            {
                case 0:
                        score = new StringBuilder("Love-All");
                    break;
                case 1:
                        score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                        score = new StringBuilder("Thirty-All");
                    break;
                default:
                        score = new StringBuilder("Deuce");
                    break;
                
            }
        }
        else if (scorePlayer1 >=4 || scorePlayer2 >=4)
        {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (minusResult==1) score = new StringBuilder("Advantage player1");
            else if (minusResult ==-1) score = new StringBuilder("Advantage player2");
            else if (minusResult>=2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scorePlayer1;
                else { score.append("-"); tempScore = scorePlayer2;}

                switch(tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");

                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    default:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}