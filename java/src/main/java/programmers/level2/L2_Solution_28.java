package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class L2_Solution_28 {
    // 전화번호 목록: https://school.programmers.co.kr/learn/courses/30/lessons/42577
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
