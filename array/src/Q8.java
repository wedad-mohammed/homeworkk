public class Q8 {
    import java.util.LinkedList;

    public class Scoreboard {
        private LinkedList<GameEntry> board;
        private int numEntries;

        public Scoreboard(int capacity) {
            board = new LinkedList<>();
            numEntries = 0;
        }

        private static class GameEntry {
            private String name;
            private int score;

            public GameEntry(String name, int score) {
                this.name = name;
                this.score = score;
            }
        }

        public void add(GameEntry e) {
            if (numEntries < board.size()) {
                board.set(numEntries, e);
            } else {
                board.add(e);
            }
            numEntries++;
        }

        public GameEntry remove(int i) {
            if (i < 0 || i >= numEntries) {
                throw new IndexOutOfBoundsException("Invalid index: " + i);
            }
            numEntries--;
            return board.remove(i);
        }
    }
}
