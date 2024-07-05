class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int res = 0;
        if(mat.size() % 2 == 1 || mat.size() == 1)
            res = -(mat[mat.size() / 2][mat.size() / 2]);
        
        for(int i = 0; i < mat.size(); i++){
            for(int j = 0; j < mat[i].size(); j++){
                if(i == j)
                    res += mat[i][j];

                if(i + j == mat.size() - 1)
                    res += mat[i][j];
            }
        }
        return res;
    }
};