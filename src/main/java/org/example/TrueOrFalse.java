package org.example;

public class TrueOrFalse extends Question {

    private String options[] = {};

    public TrueOrFalse(String theQuestion, String correctAnswer, String[] options) {
        super(theQuestion, correctAnswer);
        this.options = options;
    }

    public String printAnswer() {
        return getCorrectAnswer();

    }

    public String printQuestion() {
        String printedOptions = "";
        for (String o : options) {
            printedOptions = String.join("\n", options);
        }
        return getTheQuestion() + "\n" + printedOptions;
    }


}
