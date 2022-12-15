package org.campus02.EventKalender;

import java.util.ArrayList;

public class DemoApp {
    public static void main(String[] args) {
        Event event1 = new Event("Spice", "Leibnitz", 12);
        Event event2 = new Event("Ed", "Graz", 10);
        Event event3 = new Event("Ed", "Graz", 30);
        Event event4 = new Event("Shawn", "Berlin", 20);

        ArrayList<Event> events = new ArrayList<>();
        EventKalender eventKalender = new EventKalender(events);
        eventKalender.add(event1);
        eventKalender.add(event2);
        eventKalender.add(event3);
        eventKalender.add(event4);

        eventKalender.getByTitle("Ed");
        System.out.println("Das ist das erste Ergebnis von Ed: ");
        System.out.println(eventKalender.getByTitle("Ed"));

        System.out.println();
        System.out.println("Das sind die Ergebnisse von Graz: ");
        System.out.println(eventKalender.getByOrt("Graz"));

        System.out.println();
        System.out.println("Das sind die Ergebnisse, die zwischen Min und Max liegen: ");
        System.out.println(eventKalender.getByEintrittsPreis(10, 20));

        System.out.println();
        System.out.println("Das ist das teuerste Event: ");
        System.out.println(eventKalender.getMostExpensiveByOrt("Graz"));

        System.out.println();
        System.out.println("Das ist der Durchschnittspreis pro Lokation: ");
        System.out.println(eventKalender.getAvgPreisByOrt("Graz"));



    }
}
