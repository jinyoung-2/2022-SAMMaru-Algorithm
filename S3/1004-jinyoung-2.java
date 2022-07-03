import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());    // 테스트케이스 개수

        for (int i = 0; i < T; i++) {
            // 출발점과 도착점
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 행성계의 개수 n
            int n = Integer.parseInt(br.readLine());

            // 행성계의 중점과 반지름
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

            }

            // 거쳐야 할 최소의 행성계 진입/이탈 횟수 출력
            System.out.print(sb);
        }
    }
}