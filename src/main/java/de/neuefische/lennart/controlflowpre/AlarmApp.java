package de.neuefische.lennart.controlflowpre;

public class AlarmApp {

    public static void main(String[] args) {
        int headCount = 77;
        String evaluateHeadCount = expressAmountPeople(headCount);
        System.out.println(evaluateHeadCount);
    }

    public static String expressAmountPeople(int value) {
        if (value > 30) {
            return "Zu viele Personen.";
        } else if (value < 30) {
            return "Maximale Personenzahl nicht überschritten.";
        } else {
            return "Jetzt wird's aber eng...";
        }
    }
}
