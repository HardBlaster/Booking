package booking.db;

import booking.db.entity.HotelBooking;
import booking.db.repository.HotelBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    @Override
    public void run(String... args) throws Exception {
        List<HotelBooking> bookings = new ArrayList<>();

        bookings.add(new HotelBooking("Hotel Lycium", 33388, 2));
        bookings.add((new HotelBooking("Platan Hotel", 26721, 10)));
        bookings.add((new HotelBooking("Hotel Obester", 23841, 4)));
        bookings.add((new HotelBooking("Hotel Divinus", 41607, 6)));
        bookings.add((new HotelBooking("Civis Grand Aranybika", 18542, 5)));
        bookings.add((new HotelBooking("Aquaticum Termál És Wellness Hotel", 54813, 8)));
        bookings.add((new HotelBooking("Boutique Kristály", 25461, 2)));
        bookings.add((new HotelBooking("Centrum Hotel", 25166, 6)));
        bookings.add((new HotelBooking("Sport Hotel", 14240, 3)));
        bookings.add((new HotelBooking("Villa Debrecen", 20729, 5)));

        hotelBookingRepository.saveAll(bookings);
    }
}
