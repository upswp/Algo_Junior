package Programmers.level1.없는숫자더하기;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            if (IntStream.of(numbers).noneMatch(s -> s == finalI)) answer += i;
        }
        return answer;
    }
}
