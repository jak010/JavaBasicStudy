package Example;

public class practice01 {

    public static void main(String[] args) {

        int[][] grid = {
                {0, 0, 0}, // {  0.0   0.1   0,2   }
                {0, 0, 0}, // {  1.0   1,1   1.2   }
                {0, 0, 0}  // {  2,0   2.1   2.2   }
        };

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                // 기본 대각선에 1 채우기
                if (i == j) {
                    grid[i][j] = 1;
                }

                // 역 대각선에 1 채우기
                if (i + j == 2) {
                    grid[i][j] = 1;
                }

            }
        }

        // 2차원 배열 출력
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println(" ");
        }

    }
}