package DailyChallenge;

class MonotoneIncreasing {

    public static int minFlipsMonoIncr(String s) {
        int ones=0;
        int flips = 0;
        for(char i : s.toCharArray()){
            if(i == '1'){
                ones++;
            }
            else
                flips++;
            flips = Math.min(flips,ones);
        }
        return flips;
    }
    public static void main(String[] args) {
        System.out.print(minFlipsMonoIncr("00010"));
    }
}
