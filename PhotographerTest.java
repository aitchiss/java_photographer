import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;

  @Before
  public void before(){
    photographer = new Photographer();
  }

  @Test
  public void photographerStartsWithNoCameras(){
    assertEquals(0, photographer.countCameras());
  }
}