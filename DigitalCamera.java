class DigitalCamera implements Camera{
  private String brand;
  private String model;

  public DigitalCamera(String brand, String model){
    this.brand = brand;
    this.model = model;
  }

  public String printDetails(){
    return this.brand + ": " + this.model;
  }
}