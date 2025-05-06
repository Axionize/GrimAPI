package ac.grim.grimac.packet.api.impl.pe;

import ac.grim.grimac.api.packet.component.PacketComponentType;
import ac.grim.grimac.api.packet.manager.PacketComponentManager;
import com.github.retrooper.packetevents.protocol.component.ComponentTypes;

public class PEComponentManager implements PacketComponentManager {
    @Override
    public PacketComponentType<?> getComponentTypeFromString(String string) {
        return ComponentTypes.getByName(string);
    }
}
