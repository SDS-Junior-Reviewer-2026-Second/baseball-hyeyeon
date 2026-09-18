package baseball;

public class GuessResult {
    public boolean solved;
    public int strikes;
    public int balls;
    GuessResult(boolean solved, int strikes, int balls) {
        this.solved = solved;
        this.strikes = strikes;
        this.balls = balls;
    }
}
