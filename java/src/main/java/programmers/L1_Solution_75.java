package programmers;

public class L1_Solution_75 {
    public int[] solution(String[] wallpaper) {
        int minX = 51, minY = 51, maxX = 0, maxY = 0;
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if('#' == wallpaper[i].charAt(j)){
                    minX = Math.min(minX, j);
                    minY = Math.min(minY, i);
                    maxX = Math.max(maxX, j);
                    maxY = Math.max(maxY, i);
                }
            }
        }
        return new int[] {minY, minX, maxY+1, maxX+1};
    }
}
