class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> sqrs = new HashMap<>();

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char c = board[i][j];
                if (c == '.') continue;
                if (rows.containsKey(i)){
                    if (rows.get(i).contains(c)){
                        return false;
                    } else {
                        rows.get(i).add(c);
                    }
                } else {
                    rows.put(i, new HashSet<>());
                    rows.get(i).add(c);
                }
                if (cols.containsKey(j)){
                    if (cols.get(j).contains(c)){
                        return false;
                    } else {
                        cols.get(j).add(c);
                    }
                } else {
                    cols.put(j, new HashSet<>());
                    cols.get(j).add(c);
                }
                String pos = (i / 3) + "," + (j / 3);
                if (sqrs.containsKey(pos)){
                    if (sqrs.get(pos).contains(c)){
                        return false;
                    } else {
                        sqrs.get(pos).add(c);
                    }
                } else {
                    sqrs.put(pos, new HashSet<>());
                    sqrs.get(pos).add(c);
                }
            }
        }
        return true;
        
    }
}
