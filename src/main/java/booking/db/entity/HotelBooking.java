package booking.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String hotelName;
    private double pricePerNight;
    private int nights;

    public HotelBooking(String hotelName, double pricePerNight, int nights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nights = nights;
    }

    public double getTotal() {
        return nights * pricePerNight;
    }
}
