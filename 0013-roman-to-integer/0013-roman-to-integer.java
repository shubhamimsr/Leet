class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int sum = hm.get(s.charAt(s.length()-1)),i;
        for(i=s.length()-2; i>=0; i--){
            if(hm.get(s.charAt(i)) >= hm.get(s.charAt(i+1))){
                sum += hm.get(s.charAt(i));
            }else{
                sum -= hm.get(s.charAt(i));
            }
        }
        return sum;
    }
}