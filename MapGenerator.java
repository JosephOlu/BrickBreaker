public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    public MapGenerator(int row, int col){
        map = new int[row][col];
        for (int[] map1 : map){
            for(int j = 0; j<map1[0].length; j++){
                map1[j] = 1;
            }
        }
        brickWidth = 540/col;
        brickHeight = 540/row;
    }
    public void draw 
}
