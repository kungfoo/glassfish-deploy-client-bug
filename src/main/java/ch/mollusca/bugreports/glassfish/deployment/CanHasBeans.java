package ch.mollusca.bugreports.glassfish.deployment;

import javax.ejb.Stateless;

@Stateless
public class CanHasBeans {

    public String canHasMethod() {
        return "Hello Beans";
    }
}
