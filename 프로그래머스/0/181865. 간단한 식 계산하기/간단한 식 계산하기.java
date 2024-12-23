
class Solution {
    public int solution(String binomial) {
        int answer = 0;
       String[] parts = binomial.split(" ");
        int part1 = Integer.parseInt(parts[0]);
        String op = parts[1];
        int part2 = Integer.parseInt(parts[2]);
        
        switch(op){
            case "+":
                answer =part1+part2;
                break;
                case "-":
                answer =part1-part2;
                break;
                 case "*":
                answer =part1*part2;
                break;

            default:
                break;
        }
        return answer;
    }
}