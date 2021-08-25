package space.springbok.flightdemo.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class ScheduleFlightCommand {

    @TargetAggregateIdentifier
    private final String id;
    // other state
}
