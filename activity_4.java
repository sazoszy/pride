
public class activity_4 {

    public static void main(String[] args) {

        int[][] szao = {
            {1, 0, 1, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 1, 1}
        };

        int count = 0;

        for (int i = 0; i < szao.length; i++) {
            for (int j = 0; j < szao[i].length; j++) {
                if (szao[i][j] == 0) {
                    System.out.println("Available seats: Row " + i + ", Seat " + j);
                    count++;
                }
            }
        }
        System.out.println("Total seats found: " + count);
    }
}
