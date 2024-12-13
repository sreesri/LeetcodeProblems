package DailyChallenge;

import java.util.HashMap;
import java.util.Map;

class TwoSum {

     private Map<Integer,Integer> storage = new HashMap<>();

     public void add(int val){
         if(storage.containsKey(val)){
             storage.put(val,storage.get(val)+1);
         }else{
             storage.put(val,1);
         }
     }

     public boolean find( int target){
         System.out.println(storage);
         for(Map.Entry<Integer,Integer> entry : storage.entrySet()){
             System.out.println(entry);
             int key = entry.getKey();
             int dif = target-key;
             System.out.println(dif);
             if (dif == key && entry.getValue() == 1){
                 return  false;
             }
             if(storage.containsKey(dif))
                 return true;
         }
         return false;
     }

}

class TwoSum_Solution{
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        twoSum.add(2);
        twoSum.add(7);
        twoSum.add(11);
        twoSum.add(15);

        System.out.println(twoSum.find(9));
    }
}
