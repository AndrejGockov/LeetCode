class Solution {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        int arr[] = new int[str.length()];
        int tmp = num;
        int i = 0;
        
        while(tmp > 0){
            arr[i] = tmp % 10;
            tmp /= 10;
            i++;
        }

        num = 0;
        boolean changed = false;
        for(i = arr.length - 1; i >= 0; i--){
            if(!changed && arr[i] == 6){
                num = num * 10 + 9;
                changed = true;
                continue;
            }
            num = num * 10 + arr[i];
        }

        return num;
    }
}