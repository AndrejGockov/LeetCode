class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int>points;
        int ans = 0;
        for(int i = 0; i < operations.size(); i++){
            if(operations[i] == "+"){
                points.push_back(points[points.size() - 1] + points[points.size() - 2]);
            }
            else if(operations[i] == "C"){
                points.pop_back();
            }else if(operations[i] == "D"){
                points.push_back(points[points.size() - 1] * 2);
            }else{
                int tmp = stoi(operations[i]);
                points.push_back(tmp);
            }
        }

        for(int i = 0; i < points.size(); i++)
            ans+=points[i];
        return ans;
    }
};