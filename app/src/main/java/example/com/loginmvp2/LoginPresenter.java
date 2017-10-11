package example.com.loginmvp2;

import android.content.Context;

/**
 * Created by robertocarloscallisaya on 10/11/17.
 */

public class LoginPresenter implements ILoginPresenter {

    Context context;
    LoginView loginView;

    public LoginPresenter(Context context, LoginView loginView) {
        this.context = context;
        this.loginView = loginView;
    }

    @Override
    public void validarEmail(String email) {
        this.loginView.showError("Este campo es invalido");
    }

    @Override
    public void showErrorEmail() {

    }
}
