package ac.grim.grimac.api.packet.registry;

public interface PacketKeyTranslator {
    PacketKey translate(Object rawPacketOrEvent);
}