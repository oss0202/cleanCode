package chapter02;

/**
 * GuessStatistcsMessageNotGood class에 있는
 * printGuessStatistics 함수를 맥락을 개선해서 함수를 쪼개었다.
 * 이럴 경우 알고리즘이 좀 더 명확해 진다.
 */
public class GuessStatistcsMessage {
    private String number;
    private String verb;
    private String pluraModifier;

    public String make(char candidate, int count){
        createPlualDependentMessageParts(count);
        return String.format(
                "There %s %s %s%s", verb, number, candidate, pluraModifier
        );
    }

    private void createPlualDependentMessageParts(int count) {
        if(count == 0){
            thereAreNoLetters();
        }else if(count == 1){
            thereIsOneLetter();
        }else{
            thereAreManyLetters(count);
        }
    }

    private void thereAreManyLetters(int count) {
        number = Integer.toString(count);
        verb = "are";
        pluraModifier = "s";
    }

    private void thereIsOneLetter() {
        number = "1";
        verb = "is";
        pluraModifier = "";
    }

    private void thereAreNoLetters() {
        number = "no";
        verb = "are";
        pluraModifier = "s";
    }
}
