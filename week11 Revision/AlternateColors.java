// diagnostic
import java.lang.Math;
public class AlternateColors {
    public static String getColor(long r, long g, long b, long k) {
        long min = 0;
        long tmp = 0;
        tmp = Math.min(r, g);
        min = Math.min(tmp, b);

        // when k is running out but all three balls got left
        if(k <= 3L*min) {
            if(k % 3 == 1) {
                return "Red";
            }
            if(k % 3 == 2) {
                return "Green";
            }
            else
                return "Blue";
        }
        else {
            // update the value of each colour
            k -= 3L*min;
            r -= min;
            g -= min;
            b -= min;

            if(r == 0 && g == 0) {
                return "Blue";
            }
            else if (r == 0 && b == 0) {
                return "Green";
            }
            else if (g == 0 && b == 0) {
                return "Red";
            }

            // red ball run out first
            else if(r == 0) {
                long min2 = Math.min(g, b);
                if( k <= 2L*min2) {
                    if (k % 2 == 1) {
                        return "Green";
                    }
                    else {
                        return "Blue";
                    }
                }
                else if ( min2 == g) {
                    return "Blue";
                }
                else {
                    return "Green";
                }
            }

            else if(g == 0) {
                long min2 = Math.min(r, b);
                if( k <= 2L*min2) {
                    if (k % 2 == 1) {
                        return "Red";
                    }
                    else {
                        return "Blue";
                    }
                }
                else if (min2 == r) {
                    return "Blue";
                }
                else {
                    return "Red";
                }
            }

            else if(0 == b) {
                long min2 = Math.min(r, g);
                if( k <= 2L*min2) {
                    if(k % 2 == 1) {
                        return "Red";
                    }
                    else {
                        return "Green";
                    }
                }
                else if ( min2 == r) {
                    return "Green";
                }
                else {
                    return "Red";
                }
            }
        }


        return "shit";
    }

    public static void main(String[] args) {
        System.out.println(getColor(			18190633489L, 83578833264L, 20863098676L, 52515023334L	));
    }
}
