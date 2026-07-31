
Time Complexity: O(n²) 
Space Complexity: O(n²)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<= rowIndex; i++){
            List<Integer> rows = new ArrayList<>();
            if(i==0){
                rows.add(1);
                result.add(rows);
                continue;
            }
            if(i==1){
                rows.add(1);
                rows.add(1);
                result.add(rows);
                continue;
            }
            List<Integer> prev = result.get(i-1);
            for(int j=0; j<=i; j++){
                if(j ==0 || j == i){
                    rows.add(1);
                }
                else{
                    rows.add(prev.get(j) + prev.get(j-1));
                }
            }
            result.add(rows);
        }
        return result.get(rowIndex);
    }
}
