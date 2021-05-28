/*
    이름 : 이호민
    학번 : 201735030
    문제 : J7
*/
import java.util.*;

public class AirplaneManager {
    private static int regNumber = 1; // 등록 순서 저장 필드
    private ArrayList<Airplane> aircraft = new ArrayList<>(); // Airplane 객체로 구체화된 ArrayList

    // 비행기 등록 메서드
    void regist() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 아래 정보를 입력하세요. ===");
        System.out.print("비행기 제조회사: ");
        String usrIn1 = sc.nextLine();
        System.out.print("비행기 타입정보: ");
        String usrIn2 = sc.nextLine();
        System.out.println();

        aircraft.add(new Airplane(usrIn1, usrIn2, generateID(usrIn1, usrIn2, regNumber))); // 입력받은 값을 기반으로 객체 생성 및 배열 추가
        regNumber++; // 등록 순서 +1
    }

    // 식별번호 생성 메서드
    String generateID(String usrIn1, String usrIn2, int regNumber) {
        String genID = "";

        genID += (usrIn1.equals("아시아나")) ? "A" : (usrIn1.equals("대한항공")) ? "K" : "Z";
        genID += (usrIn2.equals("여객기")) ? "L" : (usrIn2.equals("전투기")) ? "F" : "Z";
        genID += String.format("%03d", regNumber);

        return genID;
    }

    // 전체 기체 목록 출력 메서드
    void showAll() {
        // Use Iterator & while loop intentional
        Iterator<Airplane> it = aircraft.iterator();
        while (it.hasNext()) {
            Airplane tmp = it.next();
            System.out.println("--------------------------");
            System.out.println("비행기 제조회사: " + tmp.getManufacturer());
            System.out.println("비행기 타입정보: " + tmp.getType());
            System.out.println("비행기 식별번호: " + tmp.getIdentify() + "\n");
        }
    }

    public static void main(String[] args) {
        AirplaneManager am = new AirplaneManager(); // AirplaneManager 객체 생성

        // 3개의 객체 등록
        for (int i = 0; i < 3; i++){
            am.regist();
        }

        // 전체 리스트 출력
        am.showAll();
    }
}
