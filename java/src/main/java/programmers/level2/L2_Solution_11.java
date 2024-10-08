package programmers.level2;

public class L2_Solution_11 {
    // 점프와 순간 이동: https://school.programmers.co.kr/learn/courses/30/lessons/12980
    public int solution(int n) {
        int ans = 0;
        while(n != 0){
            if(n % 2 == 1){
                n -= 1;
                ans++;
            }else{
                n /= 2;
            }
        }
        return ans;
    }
}
