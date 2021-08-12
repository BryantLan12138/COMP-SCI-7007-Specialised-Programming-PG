/*
	Your little son is counting numbers with his left hand.
	Starting with his thumb and going toward his pinky, he counts each finger in order.
	After counting his pinky, he reverses direction and goes back toward his thumb.
	He repeats this process until he reaches his target number. He never skips a finger.
	For example, to count to ten, he would count: thumb, index, middle, ring, pinky,
	ring, middle, index, thumb, index. Sadly, one of his fingers hurts
	and he can only count on it a limited number of times. His fingers are numbered 1 through 5
	from thumb to pinky. You are given an int weakFinger, the finger that hurts, and an int maxCount,
	the maximum number of times he can use that finger. Return the largest number he can count to.
	If he cannot even begin counting, return 0.
*/

public class FingerCounting {
    public static int maxNumber(int weakFinger, int maxCount) {
        int currentFinger = 0;
        int currentCount = 0;
        int result = 0;

        //counting toward left means true, right means false
        boolean direction = true;

        //base case if the maxCount is '0'
        if (maxCount == 0) {
            return weakFinger - 1;
        }

        while (currentCount != maxCount + 1) {
            // weak finger = 2, maxCount = 3
            if (direction) {
                currentFinger++;
            }
            else {
                currentFinger--;
            }
            if (currentFinger == 5) {
                direction = false;
            }
            if (currentFinger == 1) {
                direction = true;
            }
            if(currentFinger == weakFinger){
                currentCount++;
            }
            result++;
        }
        return result - 1;
    }

    public static void main(String[] args){
        System.out.println(maxNumber(	3, 99999));
    }

}
