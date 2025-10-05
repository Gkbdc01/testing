                set.add(s.charAt(i));
                cnt++;
            }else{
                max = Math.max(cnt,max);
                while(set.contains(s.charAt(j)) && set.contains(s.charAt(i))){
                    set.remove(s.charAt(j));
                    j++;
                }
                set.add(s.charAt(i));
                cnt = i-j+1;
            }
        }
            if(!set.contains(s.charAt(i))){
        for(int i = 0;i<s.length();i++){
        int j = 0;
        int max =  0;
        int cnt = 0;
        HashSet<Character> set = new HashSet<>();
    public int lengthOfLongestSubstring(String s) {
class Solution {