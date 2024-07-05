class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        vector<int> vecOne;
        vector<int> vecTwo;
        vector<vector<int>> ans;

        for(int i = 0; i < nums1.size(); i++){
            if(find(nums2.begin(), nums2.end(),nums1[i]) == nums2.end()
            && find(vecOne.begin(), vecOne.end(), nums1[i]) == vecOne.end())
                vecOne.push_back(nums1[i]);
        }

        for(int i = 0; i < nums2.size(); i++){
            if(find(nums1.begin(), nums1.end(),nums2[i]) == nums1.end()
            && find(vecTwo.begin(), vecTwo.end(), nums2[i]) == vecTwo.end())
                vecTwo.push_back(nums2[i]);
        }

        ans.push_back(vecOne);
        ans.push_back(vecTwo);
        return ans;
    }
};
