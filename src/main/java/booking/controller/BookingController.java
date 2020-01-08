package booking.controller;

import booking.db.entity.HotelBooking;
import booking.db.repository.HotelBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    private HotelBookingRepository hotelBookingRepository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll() {
        return hotelBookingRepository.findAll();
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price) {
        return hotelBookingRepository.findByPricePerNightLessThan(price);
    }

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    public List<HotelBooking> putBooking(@RequestBody HotelBooking hotelBooking) {
        hotelBookingRepository.save(hotelBooking);

        return hotelBookingRepository.findAll();
    }
}
