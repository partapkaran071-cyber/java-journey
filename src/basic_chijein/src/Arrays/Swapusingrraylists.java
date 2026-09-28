package Arrays;

import java.util.ArrayList;

public class Swapusingrraylists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);
      int i =  0 , j = arr.size()-1;
      while(i<j){
          int temp = arr.get(i);
          arr.set(i,arr.get(j));
          arr.set(j,temp);
          i++;
          j--;
      }
        System.out.println(arr);
    }
}
