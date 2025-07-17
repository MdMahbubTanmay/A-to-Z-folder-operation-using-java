import java.nio.file.*; // for folder operation

public class Test {

  public void main() {

    try {

      if (!Files.exists(Paths.get("F:/DeveloperTools/Java Learning/New"))) {

        System.err.println("Folder Not Found");

      }

      else {
        Files.move(Paths.get("F:/DeveloperTools/Java Learning/New"),Paths.get("F:/DeveloperTools/Java Learning/New2"),StandardCopyOption.REPLACE_EXISTING);

                  //we use same operation for rename or move, if source and target path is same, it will rename, if not same , it will move
      }

    }

    catch (Exception e) {
      e.printStackTrace();
    }

  }

}
