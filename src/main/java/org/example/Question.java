package org.example;

public abstract class Question {

    private String theQuestion;

    private String correctAnswer;

//    private ArrayList<String> allOptions;

//    private boolean answeredCorrect;


    public Question(String theQuestion, String correctAnswer) {
        this.theQuestion = theQuestion;
        this.correctAnswer = correctAnswer;
    }

//    String theQuestion = "Which famous book is subtitled 'the modern Prometheus'?" + "\n" +
//            "1. Frankenstein" +  + "\n" +
//            "2. The Odessey" +  + "\n" +
//            "3. Dracula" +  + "\n" +
//            "4. The Legend of Sleepy Hallow";
//

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public abstract String printAnswer();

    public abstract String printQuestion();

}
