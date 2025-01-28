class Solution {
    public class Transaction{
        public String name, city;
        public int time, price;

        public Transaction(String trans){
            String[]cuts = trans.split(",");
            name = cuts[0];
            city = cuts[3];
            time = Integer.parseInt(cuts[1]);
            price = Integer.parseInt(cuts[2]);
        }
    }

    public List<String> invalidTransactions(String[] transactions) {
        HashMap<String, List<Transaction>>hash = new HashMap<>();
        List<String>ans = new ArrayList<>();

        for(String i : transactions){
            Transaction tran = new Transaction(i);
            hash.putIfAbsent(tran.name, new ArrayList<Transaction>());
            hash.get(tran.name).add(tran);
        }

        for(String i : transactions){
            Transaction tran = new Transaction(i);

            if(tran.price > 1000){
                ans.add(i);
                continue;
            }

            if(hash.containsKey(tran.name)){
                for(Transaction tr : hash.get(tran.name)){
                    if(Math.abs(tran.time - tr.time) <= 60  && !tr.city.equals(tran.city)){
                        ans.add(i);
                        break;
                    }
                }
            }
        }

        return ans;
    }
}