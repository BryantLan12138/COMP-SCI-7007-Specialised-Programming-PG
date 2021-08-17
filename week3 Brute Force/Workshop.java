/*
*
You work in a workshop which makes garden instruments from metal. At the end of each working day there remains a pile of scrap metal that cannot be used to make anything useful. Because you dislike the idea of throwing things away (even scrap metal), you decide to utilize this metal to make some triangular picture frames that can be sold at the local market.

Given a int[] pieces where each element represents the length of a straight metallic piece, return the number of possible different picture frames that can be made from those pieces. Two picture frames are considered to be identical if each of their corresponding sides is equal in length. If no picture frames can be created from pieces then return 0.
*/
public class Workshop {
    public static int pictureFrames(int[] pieces){
        int min, max, tmp_min, tmp_max = 0;
        int middle = 0;
        int count = 0;
        for(int i = 0; i < pieces.length; i++){
            for(int j = i + 1; j < pieces.length; j++){
                for(int k = j + 1; k < pieces.length; k++){
                    tmp_min = pieces[i] < pieces[j] ? pieces[i] : pieces[j];
                    tmp_max = pieces[i] > pieces[j] ? pieces[i] : pieces[j];
                    min = tmp_min < pieces[k] ? tmp_min : pieces[k];
                    max = tmp_max > pieces[k] ? tmp_max : pieces[k];
                    if((pieces[i] == min && pieces[j] == max) || (pieces[i] == max && pieces[j] == min) ){
                        middle = pieces[k];
                        if(middle + min > max){
                            count++;
                        }
                    }
                    else if((pieces[i] == min && pieces[k] == max) || (pieces[i] == max && pieces[k] == min)){
                        middle = pieces[j];
                        if(middle + min > max){
                            count++;
                        }
                    }
                    else if((pieces[j] == min && pieces[k] == max) || (pieces[j] == max && pieces[k] == min)){
                        middle = pieces[i];
                        if(middle + min > max){
                            count++;
                        }
                    }

                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] test_case = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        System.out.println(pictureFrames(test_case));

    }
}
