class Solution {
public:
    int findChampion(vector<vector<int>>& grid) {
        int index = 0;
        int mostChampions = 0;
        for(int i = 0; i < grid.size(); i++){
            int currentChampions = 0;
            for(int j = 0; j < grid[i].size(); j++){
                if(grid[i][j] == 1)
                    currentChampions++;
            }

            if(mostChampions < currentChampions){
                mostChampions = currentChampions;
                index = i;
            }
        }

        return index;
    }
};