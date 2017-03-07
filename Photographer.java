import java.util.*;

public class Photographer{
  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public int countCameras(){
    return cameras.size();
  }

  public void addCamera(Camera camera){
    cameras.add(camera);
  }
}