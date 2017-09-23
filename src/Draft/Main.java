package Draft;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Stack;


public class Main extends Application {

    Team userteam;
    String[] TeamNames = {"49ers",
            "Browns",
            "Jaguars",
            "Titans",
            "Colts",
            "Jets",
            "Buccaneers",
            "Bears",
            "Packers",
            "Broncos",
            "Vikings",
            "Cowboys",
            "Chargers",
            "Bengals",
            "Raiders",
            "Lions",
            "Cardinals",
            "Eagles",
            "Panthers",
            "Texans",
            "Bills",
            "Steelers",
            "Redskins",
            "Patriots",
            "Giants",
            "Seahawks",
            "Ravens",
            "Saints",
            "Chiefs",
            "Falcons",
            "Dolphins",
            "Rams"
    };

    Team[] League = new Team[32];

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("GM Football Simulator");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void assignTeamNames(){
        Stack<String> = new Stack();
        for(int i = 0; i< TeamNames.length; i++){
            if(TeamNames[i].compareTo(userteam.getName())==1)
                continue;
            Stack.push(TeamNames[i]);
        }

        for(int i = 1; i< TeamNames.length; i++){

        }
    }
}
