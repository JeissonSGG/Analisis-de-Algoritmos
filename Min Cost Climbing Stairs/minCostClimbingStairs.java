public class minCostClimbingStairs {

    public static int minCostClimbingStairs(int[] cost) {
        //https://leetcode.com/problems/min-cost-climbing-stairs/submissions/1968114195

        // prev1 = costo mínimo hasta el paso anterior
        // prev2 = costo mínimo hasta dos pasos atrás
        int prev1 = 0;
        int prev2 = 0;

        for (int i = 0; i < cost.length; i++) {

            // Costo actual: el costo del paso actual + el mínimo de los anteriores
            int current = cost[i] + Math.min(prev1, prev2);

            // Actualizamos
            prev2 = prev1;
            prev1 = current;
        }

        // Puedes terminar en el último o el penúltimo paso
        return Math.min(prev1, prev2);
    }
}