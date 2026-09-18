package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void createGame(){
        assertNotNull(game);
    }

    @Test
    void throwExceptionWhenInputIsNull() {
        try{
            game.guess(null);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void throwExceptionWhenInputLengthIsUnmatched() {
        try {
            game.guess("12");
            fail();
        } catch (IllegalArgumentException e) {

        }
    }


}