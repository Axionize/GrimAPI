package ac.grim.grimac.api.platform.init;

import ac.grim.grimac.api.platform.init.Initable;

public interface StoppableInitable extends Initable {
    void stop();
}
