/*
    이름 : 이호민
    학번 : 201735030
    문제 : J6

*/
package airplane;
import java.util.Scanner;

abstract class Airplane {
    // ==== Code from J5 ====
    private String id; // 모델 식별 번호
    private String type; // 기체 타입

    // 필드 값 설정 메서드
    void setId(String id) { this.id = id; }
    void setType(String type) { this.type = type; }

    // 필드 값 리턴 메서드
    String getId() { return this.id; } //
    String getType() { return this.type; }
    // ==== End of code from J5 ====

    // 식별번호와 비행기 타입 출력
    abstract void showInfo();

    // 비행기 Take Off 메서드
    abstract void takeOff();

    // 비행기 Landing 메서드
    abstract void landing();

    // 비행기 Flight 메서드
    abstract void flight();

    Airplane(String id, String type){
        this.id = id;
        this.type = type;
    }
}

class Airliner extends Airplane{
    // ==== Code from J5 ====
    private int passenger; //승객 수 저장 필드

    void setPassenger(int passenger){ this.passenger = passenger; } //승객 수 설정 필드

    int getPassenger() { return this.passenger; } //승객 수 반환 필드
    // ==== End of code from J5 ====

    @Override
    void showInfo() {
        System.out.println("식별 번호: " + getId());
        System.out.println("비행기 타입: " + getType());
        System.out.println("탑승 인원수: " + this.passenger);
    }

    @Override
    void takeOff(){
        System.out.println(this.getType()+ " " + this.getId() + "가 이륙합니다.");
    }

    @Override
    void landing(){
        System.out.println(this.getType()+ " " + this.getId() + "가 착륙합니다.");
    }

    @Override
    void flight() {
        System.out.println(this.getType() + " " + this.getId() + "가 비행합니다.");
    }

    // ==== Code from J5 ====
    Airliner(String id) { super(id, "여객기"); }

    Airliner(String id, int passenger) {
        super(id, "여객기");
        this.passenger = passenger;
    }
    // ==== End of code from J5 ====
}

class Fighter extends Airplane implements Weapons {
    // ==== Code from J5 ====
    boolean hasStealth; // 스텔스 모드 기능 유무 저장 필드

    // 스텔스 모드 OnOff 설정 메서드
    void stealthOn() { this.hasStealth = true; }
    void stealthOff() { this.hasStealth = false; }

    // 스텔스 모드 유무 반환 메서드
    boolean getHasStealth() { return this.hasStealth; }
    // ==== End of code from J5 ====

    @Override
    void showInfo() {
        System.out.println("식별 번호: " + getId());
        System.out.println("비행기 타입: " + getType());
        System.out.println("스텔스 모드: " + this.getHasStealth());
    }

    @Override
    void takeOff(){
        System.out.println(this.getType()+ " " + this.getId() + "가 이륙합니다.");
    }

    @Override
    void landing(){
        System.out.println(this.getType()+ " " + this.getId() + "가 착륙합니다.");
    }

    @Override
    void flight() {
        System.out.println(this.getType() + " " + this.getId() + "가 비행합니다.");
    }

    @Override
    public void loadWeapon() {
        System.out.println(this.getId() + " 무기 장착");
        for(String s : Weapons.weaponsList) {
            System.out.println(s + "가 장착되었습니다.");
        }
        System.out.println();
    }

    @Override
    public void showWeapon() {
        System.out.println(this.getId() + " 무기 목록");
        for (int i = 0; i < Weapons.weaponsList.length; i++){
            System.out.println((i + 1) + ": " + Weapons.weaponsList[i]);
        }
    }

    @Override
    public void selectWeapon() {
        Scanner sc = new Scanner(System.in);
        showWeapon();
        System.out.print("무기를 선택하시오: ");
        int selWpn = sc.nextInt();

        System.out.println(weaponsList[selWpn - 1] + ((selWpn == 2) ? "가" : "이") + " 발사되었습니다.\n");
    }

    // ==== Code from J5 ====
    Fighter(String id) {
        super(id, "전투기");
        this.hasStealth = false;
    }

    Fighter(String id, boolean hasStealth){
        super(id, "전투기");
        this.hasStealth = hasStealth;
    }
    // ==== End of code from J5 ====
}
