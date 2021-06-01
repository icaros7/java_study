/*
    이름 : 이호민
    학번 : 201735030
    문제 : J8
*/

public class Airplane {
    private String manufacturer; // 제조 회사
    private int maxPeople; // 인원 정보
    private String identify; // 식별 정보

    int getmaxPeople() { return this.maxPeople; }
    String getManufacturer() { return this.manufacturer; }
    String getIdentify() { return this.identify; }

    // toString 시 정해진 포맷으로 return 하도록 Override
    @Override
    public String toString(){
        return getIdentify() + " " + getManufacturer() + " " + getmaxPeople();
    }

    Airplane(String _identify, String _manufacturer, int _maxPeople) {
        this.manufacturer = _manufacturer;
        this.identify = _identify;
        this.maxPeople = _maxPeople;
    }
}
