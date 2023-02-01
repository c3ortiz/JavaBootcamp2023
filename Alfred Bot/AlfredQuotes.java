import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AlfredQuotes {

    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿C\u00f3mo est\u00e1s?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Buenas %1$s, %2$s. Encantado de verte", dayPeriod, name);
    }

    // public String guestGreeting() {
    // return String.format("Buenas %1$s, %2$s. Encantado de verte", dayPeriod,
    // name);
    // }

    public String dateAnnouncement() {
        String dateTime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());
        return String.format("Actualmente es %s", dateTime);
    }

    public String respondBeforeAlexis(String conversation) {
        int findAlexis = conversation.indexOf("Alexis");
        int findAlfred = conversation.indexOf("Alfred");

        if (findAlexis < 0 && findAlfred < 0) {
            return "Bien. Y con eso, me retirar\u00e9";
        } else {
            if (findAlexis > 0)
                return "De inmediato, se\u00f1or. Ciertamente no es lo suficientemente sofisticada para eso";
            else
                return "A su servicio. Como desee, naturalmente";
        }
    }

    public String alfredIsAngry(String sentence) {
        return sentence.toUpperCase();
    }

}
