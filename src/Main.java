import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Question q = Question.builder()
                .content("Sample question")
                .description("Sample description")
                .correctAnswer("Correct answer")
                .wrongAnswer("Wrong answer nr1")
                .wrongAnswer("Wrong answer n2")
                .build();

        Stream<Answer> answers = Stream.of(new Answer("Poprawna odpowiedź", true), new Answer("Błędna odpowiedź 1", false), new Answer("Błędna odpowiedź 2", false));
        Question q2 = Question.builder()
                .content("Przykładowe pytanie")
                .description("Dodaktowe wskazówki")
                .answers(answers)
                .build();

    }
}
