package main.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

//name - nazwa tabeli
@Entity(name = "reservations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 3)
    private int reservedBunk;

    @ManyToOne
    private Passenger passengerReservation;

    @ManyToOne
    private Port portReservation;

    @NonNull
    private BigDecimal cruisePrice;

    @NonNull
    @FutureOrPresent
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate reservationDate;


}
