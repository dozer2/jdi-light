package com.jdiai;

import com.jdiai.interfaces.HasCore;

public class CoreElement implements HasCore {
    private JS core = new JS(JDI::driver);
    public JS core() { return core; }
    public void setCore(JS core) { this.core = core; }

}
