package testRunner;
import com.intuit.karate.junit5.*;
public class runner
{
  String my_project_path = System.getProperty("user.dir").toString();
  // Validate Website get urls
  @Karate.Test
  Karate Test_sample_html()
  {
      return Karate.run(projectPath+"/src/test/Feature_files/Karate_Assignment.feature");
  }
}
