package example.com.loginmvp2;

import android.content.Context;
import android.text.TextUtils;

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

        if (TextUtils.isEmpty(email)) {
            this.loginView.showError("Este campo no puede estar vacio");
        } else {
            this.loginView.navigateToHome();
        }
    }

}
