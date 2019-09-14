package main.service;

import main.model.CreatePassengerRequest;
import main.model.Passenger;
import main.repository.PassengerRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.List;

//spring creates beans from this
@Service
public class PassengerManager implements InitializingBean {

    private PassengerRepository passengerRepository;

    public PassengerManager(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getPassengers(){
        return passengerRepository.findAll();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        savePassenger();
    }

    private void savePassenger() {
        Passenger passenger1 = new Passenger(
                "kokojumbo",
                "Ajaje1",
                "Andrzej",
                "Kowalski");
        Passenger passenger2 = new Passenger(
                "nowykolo",
                "ciasteczko",
                "Marian",
                "Marianski");
        Passenger passenger3 = new Passenger(
                "Krystiano",
                "Pablo",
                "Eskobar",
                "Pablojeden");
        Passenger passenger4 = new Passenger(
                "Joleczka",
                "goodstuff",
                "Janusz",
                "Januszowski");

        passengerRepository.save(passenger1);
        passengerRepository.save(passenger2);
        passengerRepository.save(passenger3);
        passengerRepository.save(passenger4);

    }

    public void savePassenger(CreatePassengerRequest passengerRequest) {
        var enitity = PassengerMapper.map(passengerRequest);
        passengerRepository.save(enitity);

    }

}
