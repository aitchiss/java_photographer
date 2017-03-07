import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  Camera camera1;
  Camera camera2;

  @Before
  public void before(){
    photographer = new Photographer();
    camera1 = new DigitalCamera("Canon", "X22");
    camera2 = new AnalogueCamera("Panasonic", "HY-324");
  }

  @Test
  public void photographerStartsWithNoCameras(){
    assertEquals(0, photographer.countCameras());
  }

  @Test
  public void cameraAddAddsCamera(){
    photographer.addCamera(camera1);
    assertEquals(1, photographer.countCameras());
  }

  @Test
  public void removeCameraDeletesACamera(){
    photographer.addCamera(camera1);
    photographer.removeCamera();
    assertEquals(0, photographer.countCameras());
  }

  @Test
  public void DigitalCameraPrintsDetails(){
    assertEquals("Canon: X22", camera1.printDetails());
  }

  @Test
  public void AnalogueCameraPrintsDetails(){
    assertEquals("Panasonic: HY-324", camera2.printDetails());
  }
}