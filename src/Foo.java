

import org.swixml.SwingEngine;

public class Foo {

    public Foo() throws Exception{
        new SwingEngine().render("gui.xml").setVisible(true);
    }
}
