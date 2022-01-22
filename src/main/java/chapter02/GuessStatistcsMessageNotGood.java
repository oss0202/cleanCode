package chapter02;

public class GuessStatistcsMessageNotGood {
    /**
     * 3개의 String 변수의 의미는 함수를 끝까지 읽어야지만 어떤 변수인지 파악할 수 있다.
     * 세 변수를 함수 전반에 사용하기 떄문에 작은 조각으로 쪼개야 맥락이 분명해진다.
     * @param candidate
     * @param count
     */
    private void printGuessStatistics(char candidate, int count){
        String number;
        String verb;
        String pluraModifier;
        if(count == 0){
            number = "no";
            verb = "are";
            pluraModifier = "s";
        }else if(count == 1){
            number = "1";
            verb = "is";
            pluraModifier = "";
        }else {
            number = Integer.toString(count);
            verb = "are";
            pluraModifier = "s";
        }
        String guessMessage = String.format(
                "There %s %s %s%s", verb, number, candidate, pluraModifier
        );
        System.out.println(guessMessage);
    }
}
