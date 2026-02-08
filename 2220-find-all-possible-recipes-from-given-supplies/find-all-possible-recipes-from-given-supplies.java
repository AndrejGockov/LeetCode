class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        int n = recipes.length;
        boolean canBuild = true;
        List<String>ans = new ArrayList<>();
        HashSet<String>allSupp = new HashSet<>(Arrays.asList(supplies));

        while(canBuild){
            canBuild = false;

            for(int i = 0; i < n; i++){
                if(ans.contains(recipes[i]))
                    continue;
                
                List<String> in = ingredients.get(i);
                boolean haveIngredients = true;

                for(String ingredient : in){
                    if(!allSupp.contains(ingredient)){
                        haveIngredients = false;
                        break;
                    }
                }

                if(haveIngredients){
                    ans.add(recipes[i]);
                    allSupp.add(recipes[i]);
                    canBuild = true;
                }
            }
        }

        return ans;
    }
}