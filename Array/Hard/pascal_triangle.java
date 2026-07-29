/*Time Complexity: O(n²)
Auxiliary Space: O(1)
Output Space: O(n²)*/


class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            
            if(i==0){
                row.add(1);
                result.add(row);
               continue;
            }
            if(i==1){
                row.add(1);
                row.add(1);
                result.add(row);
                continue;
            }
             List<Integer> prev = result.get(i-1);
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(prev.get(j) + prev.get(j - 1));
                  /* Without prev
row.add(result.get(i - 1).get(j - 1)
      + result.get(i - 1).get(j));*/
                    }
                }
            
            result.add(row);
        }
        return result;
    }
}
