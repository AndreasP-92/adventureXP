package adventurexp.demo.controller;


import adventurexp.demo.model.TicketSystem;
import adventurexp.demo.repository.TicketSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TicketSystemController {

    @Autowired
   TicketSystemRepository ticketSystemRepository;

    public TicketSystemController(TicketSystemRepository ticketSystemRepository) {
        this.ticketSystemRepository = ticketSystemRepository;
    }

    @RequestMapping("/ticketlist")
    public String getTickets(Model model) {
        List<TicketSystem> ticketlist = ticketSystemRepository.findAll();
        ticketlist.forEach(System.out::println);
        model.addAttribute("tickets", ticketlist);
        System.out.println("Done Tickets");
        return "tickets/list";
    }

    @RequestMapping("/tickets")
    public String getTicketss(Model model){
        model.addAttribute("tickets", ticketSystemRepository.findAll());
        return "tickets/list";
    }
}
