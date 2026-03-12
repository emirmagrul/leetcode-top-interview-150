public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) {
            return -1;
        }

        int idx = 0;
        int amount = 0;
        for (int i = 0; i < gas.length; i++) {
            amount += gas[i] - cost[i];

            if (amount < 0) {
                idx = i + 1;
                amount = 0;
            }
        }
        return idx;
    }
}
