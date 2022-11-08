package baseball.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GameTest {
    @Test
    void a() {
        Game game = new Game();
        PlayResult expected = new PlayResult(1, 1);
        BaseballNumber userNumber = new BaseballNumber("124");

        assertThat(game.playGame(userNumber)).isEqualTo(expected);
    }
}
