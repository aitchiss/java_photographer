import java.util.*;

public class Photographer{
  private ArrayList<Camera> cameras;
  private HashMap<String, Integer> journal;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
    this.journal = new HashMap<String, Integer>();
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

  public void addToJournal(String date, Integer numberOfPhotos){
    this.journal.put(date, numberOfPhotos);
  }

  public Integer getNumberOfPhotos(String date){
    Integer journalEntry = this.journal.get(date);
    return journalEntry;
  }
}