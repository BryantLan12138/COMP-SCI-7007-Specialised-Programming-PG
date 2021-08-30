public class Truckloads {
    public static int numTrucks(int numCrates, int loadSize) {
        int result = 1;
        //base case
        if(numCrates <= loadSize) {
            return result;
        }

        int left = 0, right = 0;
        if(numCrates % 2 == 0) {
            left = right = numCrates / 2;
        }
        else {
            left = numCrates / 2;
            right = left + 1;
        }

        return numTrucks(left, loadSize) + numTrucks(right,loadSize);
    }

    public static void main(String[] args) {
        System.out.println(numTrucks(894, 22));
    }
}
