package java;

import javax.inject.Named;
import java.io.Serializable;

@Named("mathai")
public class Maasai implements Heloo,Serializable {

    @Override
    public String sayHeloo() {
        return null;
    }
}
