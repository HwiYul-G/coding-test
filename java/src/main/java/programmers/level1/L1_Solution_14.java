package programmers.level1;

public class L1_Solution_14 {
    // 서울에서 김서방 찾기: https://school.programmers.co.kr/learn/courses/30/lessons/12919
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }
}