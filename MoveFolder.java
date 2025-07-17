import java.nio.file.*; // for folder operation

public class Test {

  public void main() {

    try {

      if (!Files.exists(Paths.get("F:/DeveloperTools/Java Learning/New"))) {

        System.err.println("Folder Not Found");

      }

      else {
        Files.move(Paths.get("F:/DeveloperTools/Java Learning/Hello"),Paths.get("F:/DeveloperTools/Java Learning/New/1"),StandardCopyOption.REPLACE_EXISTING);

        //we use same operation for rename or move, if source and target path is same, it will rename, if not same , it will move
      }

    }

    catch (Exception e) {
      e.printStackTrace();
    }

  }

}