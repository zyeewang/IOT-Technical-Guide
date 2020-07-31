package iot.technology.custom.protocol.request;

import iot.technology.custom.protocol.Packet;

import static iot.technology.custom.protocol.command.Command.LOGOUT_REQUEST;

/**
 * @author james mu
 * @date 2020/7/31 15:30
 */
public class LogoutRequestPacket extends Packet {

    @Override
    public byte getCommand() {
        return LOGOUT_REQUEST;
    }
}
