package example.com.loginmvp2;

import android.view.View;

/**
 * Created by robertocarloscallisaya on 10/11/17.
 */

public interface LoginView {

    void showError(String error);
    void enviarDatos(View view);
}
