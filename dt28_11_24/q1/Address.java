package nareshit.lab.dt28_11_24.q1;

public class Address {
    private String cityName;
    private String districtName;
    private String stateName;

    public Address(String cityName, String districtName, String stateName) {
        this.cityName = cityName;
        this.districtName = districtName;
        this.stateName = stateName;
    }

    @Override
    public String toString() {
        return "[ cityName='" + cityName + '\'' +
                ", districtName='" + districtName + '\'' +
                ", stateName='" + stateName + '\''+']' ;

    }
}
