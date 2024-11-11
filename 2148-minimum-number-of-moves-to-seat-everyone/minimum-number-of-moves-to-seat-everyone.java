class Solution {
    public int[] sort(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        seats = sort(seats, seats.length);
        students = sort(students, students.length);
        
        for(int i = 0; i < seats.length; i++){
            ans += Math.abs(students[i] - seats[i]);
        }
        return ans;
    }
}


// for(int i = 0; i < seats.length; i++)
//             System.out.print(seats[i] + " ");
        
//         System.out.println();
//         for(int i = 0; i < students.length; i++)
//             System.out.print(students[i] + " ");