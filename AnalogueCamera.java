class AnalogueCamera implements Camera{
  private String brand;
  private String model;

  public AnalogueCamera(String brand, String model){
    this.brand = brand;
    this.model = model;
  }

  public String printDetails(){
    return this.brand + ": " + this.model;
  }
}