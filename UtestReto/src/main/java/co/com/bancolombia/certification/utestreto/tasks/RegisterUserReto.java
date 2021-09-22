package co.com.bancolombia.certification.utestreto.tasks;

import co.com.bancolombia.certification.utestreto.model.DataDri;
import co.com.bancolombia.certification.utestreto.userinterfaces.*;
import cucumber.api.java.hu.De;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserReto implements Task {

    private String strfirstName;

    public RegisterUserReto(String strfirtsName) {
        this.strfirstName = strfirstName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(Home.REGISTER),
                SendKeys.of("ivan").into(Personal.FIRSTNAME),
                Enter.theValue(strfirstName).into(String.valueOf(DataDri.class)),
                SendKeys.of("Lafaurie").into(Personal.LASTNAME),
                SendKeys.of("ilafaurie98@gmail.com").into(Personal.EMAIL),
                SendKeys.of("December").into(Personal.MONTH),
                SendKeys.of("31").into(Personal.DAY),
                SendKeys.of("1998").into(Personal.YEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAJE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BOTTONLASTFINAL),
                SendKeys.of("Ivanlafarhg98*").into(Complete.PASSWORD),
                SendKeys.of("Ivanlafarhg98*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)



        );
    }
    public static RegisterUserReto makeinformation(){
        return instrumented(RegisterUserReto.class);


    }


}
