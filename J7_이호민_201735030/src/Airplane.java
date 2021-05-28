/*
    이름 : 이호민
    학번 : 201735030
    문제 : J7

*/

public class Airplane {
    private String manufacturer; // 제조 회사
    private String type; // 타입 정보
    private String identify; // 식별 정보

    String getType() { return this.type; }
    String getManufacturer() { return this.manufacturer; }
    String getIdentify() { return this.identify; }

    Airplane(String _manufacturer, String _type, String _identify) {
        this.manufacturer = _manufacturer;
        this.type = _type;
        this.identify = _identify;
    }
}
