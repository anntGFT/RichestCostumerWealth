import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class SolutionTest {

    Solution solution;
    int[][] accounts;
    int result;

    @BeforeAll
    void setup(){
        solution = new Solution();
    }

    @Test
    public void getTheRichestCostumerWealthBetweenTwoCostumers(){

        accounts = new int[][] {{1,3,4,5,6,7,2},{5,3,4,8,9,8,9}};
        result = 46;
        assertEquals(result, solution.maximumWealth(accounts));
    }

    @Test
    public void getTheRichestCostumerWealthBetweenThreeCostumers(){

        accounts = new int[][] {{1,3,4,5,6,7,2},{5,3,4,8,9,8,9}, {0,3,4,8,2,8,9}};
        result = 46;
        assertEquals(result, solution.maximumWealth(accounts));
    }

    @Test
    public void getTheRichestCostumerWealthBetweenFiveCostumers(){

        accounts = new int[][] {{1,3,4,5,6,7,2},{5,3,4,8,9,8,9}, {0,3,4,8,2,8,9}, {5,3,4,8,9,8,9}, {6,6,4,8,9,8,11}};
        result = 52;
        assertEquals(result, solution.maximumWealth(accounts));
    }
}
