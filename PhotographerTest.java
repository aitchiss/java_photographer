import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  Camera camera;

  @Before
  public void before(){
    photographer = new Photographer();
    camera = new Camera();
  }

  @Test
  public void photographerStartsWithNoCameras(){
    assertEquals(0, photographer.countCameras());
  }

  @Test
  public void cameraAddAddsCamera(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.countCameras());
  }
}