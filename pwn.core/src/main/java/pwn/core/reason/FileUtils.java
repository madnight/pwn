package pwn.core.reason;

import java.net.URL;

public class FileUtils {

  public static String getResourcePath(String name) {
    final URL resource = FileUtils.class.getResource(name);
    return resource.toExternalForm();
  }
  
}
