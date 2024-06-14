public class QuestRewardGenerator {

    private static final double INTERPOLATION_B_START = 1;
    private static final double INTERPOLATION_B_END = 0;
    private static final double INTERPOLATION_S_START = 0;
    private static final double INTERPOLATION_S_END = 1;

    private static double interpolate(double alpha, double start, double end) {
        return end * alpha + start * (1 - alpha);
    }

    public static void generateRewardSequence(int numQuests) {
        StringBuilder rewards = new StringBuilder(numQuests);
        double cumulativeB = 0, cumulativeS = 0;
        int countB = 0, countS = 0;

        while (rewards.length() < numQuests) {
            double alpha = (1.0 / numQuests) * (rewards.length() + 1);
            double interpolatedB = interpolate(alpha, INTERPOLATION_B_START, INTERPOLATION_B_END);
            double interpolatedS = interpolate(alpha, INTERPOLATION_S_START, INTERPOLATION_S_END);

            cumulativeB += interpolatedB;
            cumulativeS += interpolatedS;

            int numB = (int) Math.floor(cumulativeB);

            cumulativeB -= numB;

            for (int i = 0; i < numB; i++) {
                rewards.append("b");
                countB += 1;
            }

            int numS = (int) Math.floor(cumulativeS);

            cumulativeS -= numS;

            for (int i = 0; i < numS; i++) {
                rewards.append("s");
                countS += 1;
            }
        }

        System.out.println(rewards);
        System.out.println("bronze: " + countB + ", silver: " + countS);
    }
}
