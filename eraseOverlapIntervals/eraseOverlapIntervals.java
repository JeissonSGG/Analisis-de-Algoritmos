import java.util.Arrays;

public class eraseOverlapIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {

        // Ordenamos los intervalos por su tiempo de finalización (end)
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0; // número de intervalos a eliminar
        int end = intervals[0][1]; // fin del último intervalo válido

        // Recorremos desde el segundo intervalo
        for (int i = 1; i < intervals.length; i++) {

            // Si hay solapamiento (el inicio es menor que el fin actual)
            if (intervals[i][0] < end) {
                count++; // eliminamos este intervalo
            } else {
                // No hay solapamiento → actualizamos el fin
                end = intervals[i][1];
            }
        }

        return count;
    }
}