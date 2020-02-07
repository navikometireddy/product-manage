import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mian {

     public static int countPairs(Integer arr[], int n){
        int ans = 0;
       //  System.out.print(Arrays.toString(arr));
        // for each index i and j
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                // finding the index with same
                // value but different index.
                if (arr[i] == arr[j]) {

                        ans++;

                }
            }
        }


         System.out.println(ans);
        return ans;
    }
    static int countClamps(Integer[] arr) {
        int result = 0;
        int prev = 0;
        boolean same = false;
        for(int i = 0; i < arr.length; i++) {
            if (i == 0) {
                prev = arr[i];
            } else {
                if (arr[i] == prev) {
                    if (!same) {
                        result++;
                        same = true;
                    }
                } else {
                    prev = arr[i];
                    same = false;
                }
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        List<Integer> w = new ArrayList<Integer>();
        List<Integer> w1 = new ArrayList<Integer>();
        List<Integer> w2 = new ArrayList<Integer>();
        List<Integer> w3 = new ArrayList<Integer>();
        List<Integer> main = new ArrayList<Integer>();
        List<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
        w.add(1);
        w.add(1);
        w.add(0);
        w.add(0);
        a.add(new ArrayList(w));
        w1.add(0);
        w1.add(0);
        w1.add(0);
        w1.add(0);
        a.add(new ArrayList(w1));
        w2.add(0);
        w2.add(0);
        w2.add(1);
        w2.add(1);
        a.add(new ArrayList(w2));
        w3.add(0);
        w3.add(0);
        w3.add(0);
        w3.add(0);
        a.add(new ArrayList(w3));
        Integer[] blankArray = new Integer[16];

        for (ArrayList ab:a) {
            for (Object bc:ab) {
                main.add((Integer) bc);

            }
            for (int i = 0; i < main.size(); i++)
                blankArray[i] = (Integer)main.get(i);
        }
           countPairs(blankArray,blankArray.length);
        countClamps(blankArray);
            //System.out.println(ab);

        }

        //Integer[] blankArray = new Integer[0];


       // countClamps(array);
       // System.out.println(Arrays.deepToString(array));
    }

