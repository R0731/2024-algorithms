package SWEA.d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D4_1864_정사각형방 {
    static int N;
    static int[][] nums;
    static int minN;
    static int max;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            N = Integer.parseInt(br.readLine());

            nums = new int[N][N];

            minN = N * N;
            max = 0;

            for (int r = 0; r < N; r++) {
                StringTokenizer line = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; c++) {
                    nums[r][c] = Integer.parseInt(line.nextToken());
                }
            }

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    sum(r, c);
                }
            }

            System.out.println("#" + tc + " " + minN + " " + max);
        }
    }

    private static int sum(int r, int c){
        int n = nums[r][c];
        int currentCount = 1;

        int d = 0;

        while(d < 4){
            int nr = r + dr[d];
            int nc = c + dc[d];

            if(nr >= 0 && nr < N && nc >= 0 && nc < N && nums[nr][nc] == n + 1){
                currentCount += sum(nr, nc);
            }
            d++;
        }

        if(currentCount > max){
            max = currentCount;
            minN = nums[r][c];
        }else if(currentCount == max && nums[r][c] < minN){
            minN = nums[r][c];
        }

        return currentCount;

    }
}
