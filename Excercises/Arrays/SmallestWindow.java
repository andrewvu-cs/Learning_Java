public class SmallestWindow{

    public static void getSmallestWindow(int[] myArr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int left = 0, right = myArr.length - 1;
        for(int i = 0; i < myArr.length; i++){
            max = Integer.max(myArr[i], max);
            if (myArr[i] < max){
                right = i;
            }
        }

        for(int i = myArr.length - 1 ; i > -1; i--){
            min = Integer.min(myArr[i], min);
            if (myArr[i] > min){
                left = i;
            }
        }

        System.out.println("Left: " + Integer.toString(left) +  "| Right: " + Integer.toString(right));

        return;
    }
    public static void main(String[] args){
        int[] myArr = {3, 7, 5, 6, 9};
        SmallestWindow.getSmallestWindow(myArr);
        // SmallestWindow win = new SmallestWindow();
        // win.getSmallestWindow(myArr);
    }

}