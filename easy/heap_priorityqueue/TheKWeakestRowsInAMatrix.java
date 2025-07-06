//leetCode Problem: https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
package easy.heap_priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TheKWeakestRowsInAMatrix {
    public static int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for (int i = 0; i < mat.length; i++) {
            int cont = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    cont++;
            }
            pq.offer(new int[] { cont, i });
        }

        int[] answer = new int[k];
        for(int i=0; i<k; i++){
            answer[i] = pq.poll()[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(kWeakestRows(
                new int[][] {
                        { 1, 1, 0, 0, 0 },
                        { 1, 1, 1, 1, 0 },
                        { 1, 0, 0, 0, 0 },
                        { 1, 1, 0, 0, 0 },
                        { 1, 1, 1, 1, 1 }
                }, 3)));

                System.out.println(Arrays.toString(kWeakestRows(
                new int[][] {
                        {1, 0},
                        {1, 0},
                        {1, 0},
                        {1, 1}
                }, 4)));
    }
}
