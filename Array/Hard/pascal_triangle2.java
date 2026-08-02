
Time Complexity: O(n²)
Space Complexity: O(n)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> currentRow = new ArrayList<>();
            if( i==0){
                currentRow.add(1);
                result = currentRow;
                continue;
            }
            if(i==1){
                currentRow.add(1);
                currentRow.add(1);
                result = currentRow;
                continue;
            }
            for(int j=0; j<=i; j++){
                if(j ==0 || j==i){
                    currentRow.add(1);
                }
                else{
                    currentRow.add(result.get(j) + result.get(j-1));
                }
            }
            result = currentRow;
        }
        return result;
    }
}
