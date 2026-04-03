public class MaxSubarray {

    //https://leetcode.com/problems/maximum-subarray/submissions/1968066223

    public static int maxSubArray(int[] nums) {
        // Inicializamos la suma actual y la suma máxima con el primer elemento
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Recorremos el arreglo desde el segundo elemento
        for (int i = 1; i < nums.length; i++) {

            // Decidimos si:
            // 1. Empezar un nuevo subarreglo desde nums[i]
            // 2. O continuar el subarreglo anterior sumando nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Actualizamos la suma máxima encontrada hasta ahora
            maxSum = Math.max(maxSum, currentSum);
        }

        // Retornamos la mayor suma encontrada
        return maxSum;
    }
}