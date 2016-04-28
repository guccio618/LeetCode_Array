
public class Le_243_Shortest_Word_Distance {
	public int shortestDistance(String[] words, String word1, String word2) {
        int n = words.length;
        int flag = 0;
        int position1 = 0, position2 = 0;
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(words[i].equals(word1)){
                position1 = i;
                if(flag == 2){
                    ans = Math.min(ans, position1 - position2);
                }
                flag = 1;
            }
            if(words[i].equals(word2)){
                position2 = i;
                if(flag == 1){
                    ans = Math.min(ans, position2 - position1);
                }
                flag = 2;
            }
        }
        
        return ans;
    }
}
