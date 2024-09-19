package Lerningjernal.example.ProjektLJ;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    // Methode, um die Startseite zu rendern
    @GetMapping("/")
    public String home() {
        return "Home";  // Gibt die home.html Seite zurück
    }

    // Methode, um die Login-Seite zu rendern
    @GetMapping("/login")
    public String login() {
        return "login";  // Gibt die login.html Seite zurück
    }
}
