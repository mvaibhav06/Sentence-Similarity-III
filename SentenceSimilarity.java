public class SentenceSimilarity {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.equals(sentence2)) return true;

        String[] input1 = sentence1.split(" ");
        String[] input2 = sentence2.split(" ");

        int i = 0;
        int j = 0;
        int p = input1.length-1;
        int q = input2.length-1;

        while(i<input1.length && j<input2.length){
            if(input1[i].equals(input2[j])){
                i++;
                j++;
            }
            else{
                break;
            }
        }

        if(i==input1.length || j==input2.length){
            return true;
        }

        while(p>=i && q>=j){
            if(input1[p].equals(input2[q])){
                p--;
                q--;
            }
            else{
                break;
            }
        }

        if(i>p || j>q){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "My name is Haley";
        String s2 = "My Haley";

        System.out.println(areSentencesSimilar(s1,s2));
    }
}
