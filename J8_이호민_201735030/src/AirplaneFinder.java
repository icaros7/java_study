/*
    이름 : 이호민
    학번 : 201735030
    문제 : J8
*/

import java.io.*;
import java.util.*;

public class AirplaneFinder {
    private HashMap<String, Airplane> map = new HashMap<>(); // 식별번호를 Key, Airplane 객체를 Value 로 하는 Hashmap

    // 파일 읽기 메서드
    void readAirplaneFile(){
        try{
            FileReader fileReader = new FileReader("/Users/homin/Downloads/airplane.txt"); // TODO: C:\\Java\\airplane.txt 로 수정
            BufferedReader buffer = new BufferedReader(fileReader); // 입력 스트림 생성

            String line;
            while ((line = buffer.readLine()) != null){ // 한줄씩 읽어오기
                String[] s = line.split(" "); // " "를 기준으로 잘라 배열 s에 저장
                map.put(s[0], new Airplane(s[0], s[1], Integer.parseInt(s[2]))); // 식별번호를 Key, 불러오 정보로 만들어진 Airplane을 Value로 추가
            }
        }
        catch (IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }

    // 파일 쓰기 메서드
    void writeAirplaneFile(){
        try{
            FileWriter fileWriter = new FileWriter("/Users/homin/Downloads/airplane.txt", true); // TODO: C:\\Java\\airplane.txt 로 수정
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); // 입력 스트림 생성
            boolean addNew;

            while (true) {
                System.out.print("새로운 비행기 정보를 입력하시겠습니까? (Y/N): ");
                String answer = buffer.readLine();

                addNew = answer.equals("y") || answer.equals("Y"); // 답변에 따른 boolean 값 정의
                if (addNew) {
                    ArrayList<String> al = new ArrayList<>(3);

                    System.out.print("비행기 식별번호: ");
                    al.add(buffer.readLine());
                    System.out.print("비행기 제조회사: ");
                    al.add(buffer.readLine());
                    System.out.print("비행기 탑승인원: ");
                    al.add(buffer.readLine());
                    String line = al.get(0) + " " + al.get(1) + " " + al.get(2);

                    fileWriter.write(line, 0, line.length());
                    fileWriter.write("\r\n", 0, 2);
                }
                else { break; }
                System.out.println();
            }
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("파일 입출력 오류");
        }
    }

    void findAirplane(){
        Scanner sc = new Scanner(System.in);

        System.out.print("검색할 비행기 식별번호를 입력하세요: ");
        String temp = sc.nextLine();

        for (String id : map.keySet()){
            if (map.get(id).getIdentify().equals(temp)) { System.out.println(map.get(id).toString()); }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        AirplaneFinder airplaneFinder = new AirplaneFinder();
        airplaneFinder.readAirplaneFile();
        airplaneFinder.findAirplane();
        airplaneFinder.writeAirplaneFile();
    }
}
