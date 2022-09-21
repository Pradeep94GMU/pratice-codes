public class MultiplyMatrix {
    public static void main(String[] args) {
        int m[][] = { {2,1}, {5,2}};
        int n[][] = { {4,3}, {7,2}};
        //here we have 2 * 2 matrix so the result will be store in 2 * 2 matrix
        int res[][] = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                    int sum = 0;
                for(int k = 0; k < 2; k++){
                    sum = sum + m[i][k] * n[k][j];
                }
                res[i][j] = sum;
                sum = 0;
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
