package prototype;

public class Address {
  private String province;
  private String district;
  private String street;
public Address(){};

  public Address(String province, String district, String street) {
    this.province = province;
    this.district = district;
    this.street = street;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }
}
