package main.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePassengerRequest {

    private String passengerName;

    private String password;

    private String firstName;

    private String lastName;

}
