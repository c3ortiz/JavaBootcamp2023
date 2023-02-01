import java.util.Calendar;
import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿C\u00f3mo est\u00e1s?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Buenas %s, %s. Encantado de verte", dayPeriod, name);
    }

    public String guestGreeting(String name) {
        Calendar calendario = Calendar.getInstance();
        int HH = calendario.get(Calendar.HOUR_OF_DAY);

        if ((HH >= 0) && (HH < 12)) {
            return String.format("Buenas d\u00edas %s. Encantado de verte", name);
        } else if ((HH >= 12) && (HH < 17)) {
            return String.format("Buenas tardes %s. Encantado de verte", name);
        } else if ((HH >= 18) && (HH < 23)) {
            return String.format("Buenas noches %s. Encantado de verte", name);
        } else {
            return "Hora no es válida";
        }
    }

    public String dateAnnouncement() {
        return String.format("Actualmente es %s", new Date());
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
