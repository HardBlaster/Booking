package booking.db.repository;

import booking.db.entity.HotelBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelBookingRepository extends JpaRepository<HotelBooking, Long> {

    List<HotelBooking> findByPricePerNightLessThan(double price);
}
