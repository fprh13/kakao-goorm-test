package javaEx01;
import java.util.Scanner;

public class ConsoleIOEx {

    public static void main(String[] args) {
        // 콘솔 출력
        System.out.print("Hello, java!"); // 줄바꿈 안됨
        System.out.println("Hello, java!"); // 줄바꿈 됨

        Scanner sc = new Scanner(System.in);
        /**
        // 콘솔 입출력
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine(); // next, nextInt, nextDouble

        System.out.println("Welcome " + name + "님!");
         **/

        // 변수 : 데이터를 저장하는 메모리 공간, 선언과 초기화
        int age = 24;
        long population = 899999999999L;

        // 실수형
        double height = 169.4;
        float weight = 70.5f;

        // 문자열
        char ch = '3';

        // 논리형
        boolean isStudent = true;

        // 출력
        System.out.println("Age" + age);

        // 명시적 형 변환(타입 캐스팅) : 큰 타입에서 작은 타입으로 수동 변환
        double pi = 3.14;
        int truncatedPi = (int) pi;

        System.out.println("pi: " + pi + "\n" + "truncatedPi : " + truncatedPi);

        // 홀수 인지 짝 수 인지
        System.out.print("숫자를 입력해주세요 -> ");

        int num = sc.nextInt();

        if (num%2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }


    }
}
