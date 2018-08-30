package java;

import javax.inject.Named;
import java.io.Serializable;

@Named("kuyu")
public class Kikuyu implements java.Heloo,Serializable {
    @Override
    public String sayHeloo() {

        String greeting = "chamegei";
        return greeting;
    }
}
