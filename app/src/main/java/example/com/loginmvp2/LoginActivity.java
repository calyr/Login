package example.com.loginmvp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements LoginView{

    private EditText mEmail;
    ILoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.mEmail = (EditText) findViewById(R.id.login_form_email);
        this.loginPresenter =  new LoginPresenter(getApplicationContext(), this);
    }

    @Override
    public void showError(String error) {
        this.mEmail.setError(error);
    }


    public void enviarDatos(View view) {
        this.loginPresenter.validarEmail(this.mEmail.getText().toString());
    }
}
