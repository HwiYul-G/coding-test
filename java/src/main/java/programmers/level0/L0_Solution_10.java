package programmers.level0;

public class L0_Solution_10 {
    public int solution(int angle) {
        if (angle < 90)
            return 1;
        if (angle == 90)
            return 2;
        if (angle < 180)
            return 3;
        return 4;
    }
}