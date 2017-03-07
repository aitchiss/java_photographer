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

  public void removeCamera(){
    cameras.remove(countCameras() - 1);
  }

  public String printCollectionDetails(){
    String collectionDetails = "";
    int count = 0;
    for (Camera camera : cameras){
      collectionDetails = collectionDetails + camera.printDetails();
      count++;
      if (count < countCameras()){
        collectionDetails = collectionDetails + ", ";
      }
    }
    return collectionDetails;
  }
}