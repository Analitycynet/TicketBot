package dev.westernpine.ticketbot.supports.types;

import dev.westernpine.common.emoji.Emoji;
import dev.westernpine.ticketbot.TicketBot;
import dev.westernpine.ticketbot.supports.ISupportType;
import dev.westernpine.ticketbot.supports.SupportType;

public class Bug implements ISupportType {

    @Override
    public String getConfigPath() {
        return "Uruchom zgłoszenia wobec bugów";
    }

    @Override
    public String getHelpMessage() {
        return TicketBot.getInstance().getPrefix() + SupportType.BUG.getString();
    }

    @Override
    public String getCategoryName() {
        return Emoji.Bug.getValue() + " Bugi";
    }

    @Override
    public String getTicketCreatedMessage() {
        return "Proszę opisz bug który odkryłeś/aś oraz jak został odkryty.";
    }

}
