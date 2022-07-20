package Programmers.level1.없는숫자더하기;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        Solution s = new Solution();
        assertEquals(14, s.solution(new int[]{1,2,3,4,6,7,8,0}));
        assertEquals(6, s.solution(new int[]{5,8,4,0,6,7,9}));
    }
}