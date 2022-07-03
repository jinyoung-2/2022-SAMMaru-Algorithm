import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());    // 테스트케이스 개수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int powD = (int) (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
            int powRadiusMinus = (int) Math.pow(r2 - r1, 2);
            int powRadiusPlus = (int) Math.pow(r2 + r1, 2);

            // Case 1 : 중점 및 반지름 모두 동일한 경우 => 접점의 개수 무한개
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append("\n");
            }

            // Case 2-1 : 접점이 0개인 경우 => 한 원이 다른 원의 외부에 있는 경우 (단, 접하는 경우 제외)
            else if (powD > powRadiusPlus) {
                sb.append(0).append("\n");
            }

            // Case 2-2 : 접점이 0개인 경우 => 한 원이 다른 원의 내부에 있는 경우 (단, 접하는 경우 제외)
            else if (powD < powRadiusMinus) {
                sb.append(0).append("\n");
            }

            // Case 3-1 : 접점이 1개인 경우 => 내접한 경우
            else if (powD == powRadiusMinus) {
                sb.append(1).append("\n");
            }

            // Case 3-2 : 접점이 1개인 경우 => 외접한 경우
            else if (powD == powRadiusPlus) {
                sb.append(1).append("\n");
            }

            // Case 4 : 접점이 2개인 경우
            else {
                sb.append(2).append("\n");
            }
        }
        System.out.print(sb);
    }
}