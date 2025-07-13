class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        ArrayList<String> list = new ArrayList<>();

        for(String word : words){
            int wordRow = 0;
            for(Character letter : word.toCharArray()){
                if(firstRow.contains(String.valueOf(Character.toLowerCase(letter)))){
                    if(wordRow == 0 || wordRow == 1){
                        wordRow = 1;
                    }else{
                        wordRow = 0;
                        break;
                    }
                    continue;
                }

                if(secondRow.contains(String.valueOf(Character.toLowerCase(letter)))){
                    if(wordRow == 0 || wordRow == 2){
                        wordRow = 2;
                    }else{
                        wordRow = 0;
                        break;
                    }
                    continue;
                }

                if(thirdRow.contains(String.valueOf(Character.toLowerCase(letter)))){
                    if(wordRow == 0 || wordRow == 3){
                        wordRow = 3;
                    }else{
                        wordRow = 0;
                        break;
                    }
                    continue;
                }
            }
            
            if(wordRow != 0)
                list.add(word);
        }
        System.out.println(list);
        int i = 0;
        String[] ans = new String[list.size()];

        for(String item : list){
            ans[i] = item;
            i++;
        }

        return ans;
    }
}