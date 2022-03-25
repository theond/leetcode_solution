package arrays;

public class ImageSmoother {

    /*
     * https://leetcode-cn.com/problems/image-smoother/
     */
    public int[][] imageSmoother(int[][] img) {

        int rowLength = img.length;
        int colLength = img[0].length;
        int[][] resultImg = new int[rowLength][colLength];
        if(rowLength == 1 && colLength == 1)
            return img;
        if(rowLength == 1 && colLength > 1){
            for(int j =0; j<colLength;j++){
                if(j ==0){
                    resultImg[0][j] = (img[0][j] + img[0][j+1])/2;
                    continue;
                }
                if(j ==colLength -1){
                    resultImg[0][j] = (img[0][j-1] + img[0][j])/2;
                    continue;
                }
                if(j >0 && j < colLength - 1){
                    resultImg[0][j] = (img[0][j-1] + img[0][j] + img[0][j+1])/3;
                }
            }
            return resultImg;
        }

        if(rowLength > 1 && colLength == 1){
            for(int i =0; i<rowLength;i++){
                if(i ==0){
                    resultImg[i][0] = (img[i][0] + img[i+1][0])/2;
                    continue;
                }
                if(i ==rowLength -1){
                    resultImg[i][0] = (img[i-1][0] + img[i][0])/2;
                    continue;
                }
                if(i >0 && i < rowLength - 1){
                    resultImg[i][0] = (img[i-1][0] + img[i][0] + img[i+1][0])/3;
                }
            }
            return resultImg;
        }

        for(int i = 0; i < rowLength; i ++){
            for(int j = 0; j < colLength; j++){
                if(i == 0 && j ==0){
                    resultImg[i][j] = (img[i][j] + img[i][j+1] + img[i+1][j+1] + img[i+1][j])/4;
                    continue;
                }
                if( i == 0 && j >0 && j < colLength - 1){
                    resultImg[i][j] = (img[i][j-1] + img[i][j] + img[i][j+1] + img[i+1][j+1] + img[i+1][j] + img[i+1][j-1])/6;
                    continue;
                }
                if(i == 0 && j == colLength - 1){
                    resultImg[i][j] = (img[i][j-1] + img[i][j] + img[i+1][j] + img[i+1][j-1])/4;
                    continue;
                }

                if(i > 0 && i < rowLength - 1 && j == colLength - 1){
                    resultImg[i][j] = (img[i-1][j-1] + img[i-1][j] + img[i][j] + img[i+1][j] + img[i+1][j-1] + img[i][j-1])/6;
                    continue;
                }

                if(i == rowLength - 1 && j == colLength - 1){
                    resultImg[i][j] = (img[i-1][j-1] + img[i-1][j] + img[i][j] + img[i][j-1])/4;
                    continue;
                }

                if( i == rowLength -1 && j >0 && j < colLength - 1){
                    resultImg[i][j] = (img[i-1][j-1] + img[i-1][j] + img[i-1][j+1] + img[i][j+1] + img[i][j] + img[i][j-1])/6;
                    continue;
                }

                if( i == rowLength -1 && j == 0){
                    resultImg[i][j] = (img[i-1][j] + img[i-1][j+1] + img[i][j+1] + img[i][j])/4;
                    continue;
                }
                if(i > 0 && i < rowLength - 1 && j == 0){
                    resultImg[i][j] = (img[i-1][j] + img[i-1][j+1] + img[i][j+1] + img[i+1][j+1] + img[i+1][j] + img[i][j])/6;
                    continue;
                }
                if(i > 0 && i < rowLength - 1 && j >0 && j < colLength - 1) {
                    resultImg[i][j] = (img[i - 1][j - 1] + img[i - 1][j] + img[i - 1][j + 1] + img[i][j + 1] +
                            img[i + 1][j + 1] + img[i + 1][j] + img[i + 1][j - 1] + img[i][j - 1] + img[i][j]) / 9;
                }
            }
        }
        return resultImg;
    }

    /*更优雅的实现
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length;
        int[][] ret = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = 0, sum = 0;
                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            num++;
                            sum += img[x][y];
                        }
                    }
                }
                ret[i][j] = sum / num;
            }
        }
        return ret;
    }

     */


}
