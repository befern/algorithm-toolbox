package bfg.math.greedy_algorithms;

public class Change {
    private int[] coins;

    public Change(int[] coins) {
        this.coins = coins;
    }

    public int getChange(int total) {
        int coinsUsed = 0;

        while (total > 0) {
            total = GreedyMath.extractBiggestValue(total, coins);
            coinsUsed += 1;
        }

        return coinsUsed;
    }
}
