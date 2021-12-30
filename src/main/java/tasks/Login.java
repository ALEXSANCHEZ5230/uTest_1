package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.uTestLoginPage;

public class Login implements Task {


    private static String strUser;
    private static String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }
    public static Login onThePage() {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(uTestLoginPage.INPUT_USER),
                Enter.theValue(strPassword).into(uTestLoginPage.INPUT_PASSWORD),
                Click.on(uTestLoginPage.ENTER_BUTTON)
        );
    }
}
