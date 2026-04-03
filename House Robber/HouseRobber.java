public class HouseRobber {

    public static int rob(int[] nums) {

        //https://leetcode.com/problems/house-robber/submissions/1968093702

        // Caso base: si solo hay una casa
        if (nums.length == 1) {
            return nums[0];
        }

        // prev1 = dp[i-1] → mejor resultado hasta la casa anterior
        // prev2 = dp[i-2] → mejor resultado hasta dos casas atrás
        int prev1 = 0;
        int prev2 = 0;

        for (int num : nums) {

            // Decisión:
            // - No robar esta casa → prev1
            // - Robarla → prev2 + num
            int current = Math.max(prev1, prev2 + num);

            // Actualizamos para la siguiente iteración
            prev2 = prev1;
            prev1 = current;
        }

        // prev1 contiene el resultado final
        return prev1;
    }
}