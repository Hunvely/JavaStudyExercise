package example;

public class IfEx4 {

    public static void main(String[] args) {

        String grade = "G";

        switch (grade) {
            case "A" :
                System.out.println("grade : " + grade);
                System.out.println("탁월한 성과입니다!");
                break;
            case "B" :
                System.out.println("grade : " + grade);
                System.out.println("좋은 성과입니다!");
                break;
            case "C" :
                System.out.println("grade : " + grade);
                System.out.println("준수한 성과입니다!");
                break;
            case "D" :
                System.out.println("grade : " + grade);
                System.out.println("향상이 필요합니다!");
                break;
            case "F" :
                System.out.println("grade : " + grade);
                System.out.println("불합격입니다.!");
                break;
            default:
                System.out.println("잘못된 학점입니다.");

        }

    }
}
