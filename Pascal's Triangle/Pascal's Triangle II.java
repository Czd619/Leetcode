// Given an index k, return the kth row of the Pascal's triangle.
//
// For example, given k = 3,
// Return [1,3,3,1].
//
// Note:
// Could you optimize your algorithm to use only O(k) extra space?

// solution:
// When generating each row, we can use the previous row directly, so this way we only use O(k) space with k being the number of row. For each new row, we append a 1, letting j iterate from i - 1 backward to 1, and set the jth element as res.set(j, res.get(j-1) + res.get(j)). For example, when k = 4, the process goes like this:

// k == 0
// [1]
// k == 1
// [11]
// k == 2
// [111]  add 1
// [121]  calculate jth spot
// k == 3
// [1211]  add 1
// [1331]   calculate jth spot
// k == 4
// [13311]  add 1
// [14641]  calculate jth spot

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer> ();
        for(int i = 0; i <= rowIndex; i++){
            res.add(1);
            for(int j = i - 1; j > 0; j--){
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }

        return res;
    }
}
