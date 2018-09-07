package janken;

import javafx.application.Application;
import javafx.stage.Stage;

public class JankenView extends Application {

  @Override
 public void start(Stage stage) throws Exception {
   stage.setTitle("じゃんけんゲーム");
   stage.setWidth(450);
   stage.setHeight(300);

   stage.show();
 }

 public static void main(String[] args) {
  launch();
 }

}
//git status
//git add .
//git commit -m "first commit"
//git log
//git remote add origin [githubリモートリポジトリのURL]
//git push -u origin master