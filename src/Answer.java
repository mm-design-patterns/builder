/**
 * Created by muller on 2019-05-31.
 */
public class Answer {
    private final String content;
    private final boolean correct;

    public Answer(String content, boolean correct) {
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Answer must have non-empty content");
        }
        this.content = content;
        this.correct = correct;
    }

    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return correct;
    }
}
