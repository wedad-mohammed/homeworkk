public class Q12 {
    public class MultiplayerGame {
        private boolean[][] meetings; // Matrix to track meetings between players
        private int numPlayers; // Total number of players

        public MultiplayerGame(int numPlayers) {
            this.numPlayers = numPlayers;
            this.meetings = new boolean[numPlayers][numPlayers];
            // Initialize all meetings to false
            for (int i = 0; i < numPlayers; i++) {
                for (int j = 0; j < numPlayers; j++) {
                    meetings[i][j] = false;
                }
            }
        }

        // Method to record a meeting between players i and j
        public void meet(int i, int j) {
            if (i != j) { // Ensure i and j are different players
                meetings[i - 1][j - 1] = true; // Mark the meeting in the matrix
                meetings[j - 1][i - 1] = true; // Meeting is bidirectional
            }
        }

        // Method to determine the winner of the game
        public int getWinner() {
            for (int player = 0; player < numPlayers; player++) {
                boolean allMet = true;
                for (int otherPlayer = 0; otherPlayer < numPlayers; otherPlayer++) {
                    if (player != otherPlayer && !meetings[player][otherPlayer]) {
                        allMet = false; // Player hasn't met all other players
                        break;
                    }
                }
                if (allMet) {
                    return player + 1; // Return the winning player (players are 1-indexed)
                }
            }
            return -1; // No winner yet
        }

        public static void main(String[] args) {
            int numPlayers = 1000;
            MultiplayerGame game = new MultiplayerGame(numPlayers);
            // Simulate meetings between players (e.g., using a loop)
            // After each meeting, check if a winner has emerged using game.getWinner()
        }
    }
}
