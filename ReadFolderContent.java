import java.nio.file.*; // for folder operation

public class Test {

  public void main() {


    Path[] name = null;

    try {

      if (!Files.exists(Paths.get("F:/DeveloperTools/Java Learning/Old"))) {

        System.err.println("Folder Not Found");

      }

      else {
         name = Files.list(Paths.get("F:/DeveloperTools/Java Learning/Old")).toArray(Path[]::new);  // we use Path[] name  and .toArray(Path[]::new) to get file name as array
      }

    }

    catch (Exception e) {
      e.printStackTrace();
    }


    for(Path i : name){
      System.out.println(i.getFileName()); //here i will be file name with path, we used  i.getFileName()   to get just the file name
    }

  }

}
