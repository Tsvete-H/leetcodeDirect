class Solution {
    public int maxNumberOfBalloons(String text) {
     int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b': ++b;
                        break;
                case 'a': ++a;
                        break;
                case 'l': ++l;
                        break;
                case 'o': ++o;
                        break;
                case 'n': ++n;
                        break;
            
            }
        }
        
       return Arrays.asList(b,a,l/2,o/2,n).stream().min(Integer::compareTo).get();
    }
}