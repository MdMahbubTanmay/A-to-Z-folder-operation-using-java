import java.nio.file.*; // for folder operation
import java.nio.file.Paths;

public class Test {

  public void main() {

    try {

      if (!Files.exists(Paths.get("F:/DeveloperTools/Java Learning/New"))) {

        System.err.println("Folder Not Found");

      }

      else {
        Files.delete(Paths.get("F:/DeveloperTools/Java Learning/New"));
      }

    }

    catch (Exception e) {
      e.printStackTrace();
    }

  }

}
