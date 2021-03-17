package backend.demo.controller;

import backend.demo.model.Booking;
import backend.demo.repository.BookingRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookingController {

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @GetMapping("/select/bookings")
    public List<Booking> findAllBookings(){
        List<Booking> bookings = bookingRepository.findAll();
        return bookings;
    }

//    @PostMapping(value="/newauthor", consumes = "application/json")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Author postAuthor(@RequestBody Author author) {
//        System.out.println(author);
//        return authorRepository.save(author);
//    }

    @PostMapping(value="/persons", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Booking postPerson(@RequestBody Booking pers){
        System.out.println(pers);
        return bookingRepository.save(pers);
    }

    @PostMapping(value="/insert/booking", consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Booking insertBooking(@RequestBody Booking booking){
        System.out.println(booking);

        return bookingRepository.save(booking);


    }
}
