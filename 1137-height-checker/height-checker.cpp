class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int ans = 0;
        vector<int> newHeights;
        
        for(int i = 0; i < heights.size(); i++)
            newHeights.push_back(heights[i]);

        for(int i = 0; i < heights.size() - 1; i++){
            bool swapped = false;
            for(int j = 0; j < heights.size() - i - 1; j++){
                if(newHeights[j] > newHeights[j + 1]){
                    swap(newHeights[j], newHeights[j + 1]);
                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }

        for(int i = 0; i < heights.size(); i++){
            cout<<newHeights[i]<<" ";
            if(heights[i] != newHeights[i]){
                ans++;
            }
        }
        return ans;
    }
};