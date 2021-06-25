public class Task1 {
    public static void main (String[] args){
        System.out.println("Hi");
    }

    public String findCommonPrefix(String[] words){
        String firstWord = words[0];
        StringBuilder stringBuilder = new StringBuilder();
        for(int i= 0; i< firstWord.length(); i++){ //iterate over first word
            if(checkIfSameChar(words, i)){
                stringBuilder.append(firstWord.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    private boolean checkIfSameChar(String[] words, int i) {
        for(int j=1; j<words.length; j++){
            if(words[j].length() <= i) return false;
            if(words[0].charAt(i) != words[j].charAt(i)) return false;
        }
        return true;
    }
}



