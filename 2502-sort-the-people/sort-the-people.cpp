class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
        for(int i = 0; i < heights.size() - 1; i++){
            bool found = false;
            for(int j = 0; j < heights.size() - i - 1; j++){
                if(heights[j] < heights[j + 1]){
                    found = true;
                    swap(names[j], names[j + 1]);
                    swap(heights[j], heights[j + 1]);
                }
            }

            if(!found)
                break;
        }
        return names;
    }
};