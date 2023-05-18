package rentalcarsystem;

import controller.LoginController;
import model.UserModel;
import view.LoginView;


public class RentalCarSystem{

    public static void main(String[] args) {
        UserModel UserModel = new UserModel(0, "", "", "", "", "", "", "");
        LoginView loginView = new LoginView();
        
        LoginController loginController = new LoginController(UserModel, loginView);
    }
}
