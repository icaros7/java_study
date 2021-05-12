/*
    이름 : 이호민
    학번 : 201735030
    문제 : J5

*/

class Airplane {
    private String id; // 모델 식별 번호
    private String type; // 기체 타입

    // 필드 값 설정 메서드
    void setId(String id) { this.id = id; }
    void setType(String type) { this.type = type; }

    // 필드 값 리턴 메서드
    String getId() { return this.id; } //
    String getType() { return this.type; }

    // 식별번호와 비행기 타입 출력
    void showInfo(){
        System.out.println("식별 번호: " + getId());
        System.out.println("비행기 타입: " + getType());
    }

    Airplane(String id, String type){
        this.id = id;
        this.type = type;
    }
}

class Airliner extends Airplane{
    private int passenger; //승객 수 저장 필드

    void setPassenger(int passenger){ this.passenger = passenger; } //승객 수 설정 필드

    int getPassenger() { return this.passenger; } //승객 수 반환 필드

    // 비행기 showInfo 오버라이드. 탑승 인원수 추가
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("탑승 인원수: " + this.passenger);
    }

    Airliner(String id) { super(id, "여객기"); }

    Airliner(String id, int passenger) {
        super(id, "여객기");
        this.passenger = passenger;
    }
}

class Fighter extends Airplane{
    boolean hasStealth; // 스텔스 모드 기능 유무 저장 필드

    // 스텔스 모드 OnOff 설정 메서드
    void stealthOn() { this.hasStealth = true; }
    void stealthOff() { this.hasStealth = false; }

    // 스텔스 모드 유무 반환 메서드
    boolean getHasStealth() { return this.hasStealth; }

    // 비행기 showInfo 오버라이드 스텔스 모드 유무 추가
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("스텔스 모드: " + getHasStealth());
    }

    Fighter(String id) {
        super(id, "전투기");
        this.hasStealth = false;
    }

    Fighter(String id, boolean hasStealth){
        super(id, "전투기");
        this.hasStealth = hasStealth;
    }
}