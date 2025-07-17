import java.nio.file.*; // for folder operation
import java.nio.file.StandardCopyOption;
public class Test {

  public void main() {

    try {

      if (!Files.exists(Paths.get("F:/DeveloperTools/Java Learning/Old"))) {

        System.err.println("Folder Not Found");

      }

      else {
        Files.copy(Paths.get("F:/DeveloperTools/Java Learning/Old"),Paths.get("F:/DeveloperTools/Hello/Old"),StandardCopyOption.REPLACE_EXISTING);

        //we use same operation for rename or move, if source and target path is same, it will rename, if not same , it will move
      }

    }

    catch (Exception e) {
      e.printStackTrace();
    }

  }

}