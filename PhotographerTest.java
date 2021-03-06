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
  public void digitalCameraPrintsDetails(){
    assertEquals("Canon: X22", camera1.printDetails());
  }

  @Test
  public void analogueCameraPrintsDetails(){
    assertEquals("Panasonic: HY-324", camera2.printDetails());
  }

  @Test
  public void photographerPrintsCollectionDetails(){
    photographer.addCamera(camera1);
    photographer.addCamera(camera2);
    assertEquals("Canon: X22, Panasonic: HY-324", photographer.printCollectionDetails());
  }

  @Test
  public void photographerHasJournal(){
    photographer.addToJournal("12/02/17", 2);
    assertEquals((Integer)2, photographer.getNumberOfPhotos("12/02/17"));
  }
}