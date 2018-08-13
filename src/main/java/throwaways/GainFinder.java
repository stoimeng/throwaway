package throwaways;

public class GainFinder {
    public static void findMax(int prices[]) {
        int maxGainLowIndex = 0;
        int maxGainHighIndex = 0;
        int lowIndex = 0;
        int highIndex = 0;
        int maxGain = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[lowIndex] > prices[i]) {
                lowIndex = i;
                highIndex = i;
            }

            if (prices[highIndex] < prices[i]) {
                highIndex = i;
            }

            maxGain = prices[maxGainHighIndex] - prices[maxGainLowIndex];
            int currentGain = prices[highIndex] - prices[lowIndex];
            if (currentGain > maxGain) {
                maxGainLowIndex = lowIndex;
                maxGainHighIndex = highIndex;
                maxGain = currentGain;
            }
        }

        System.out.println(String.format("Maximum gain: %d, low: %d, high: %d", maxGain,
                maxGainLowIndex, maxGainHighIndex));
    }
}
