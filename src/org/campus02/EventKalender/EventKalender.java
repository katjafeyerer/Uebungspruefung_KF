package org.campus02.EventKalender;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EventKalender {

    private ArrayList<Event> eventKalender = new ArrayList<>();

    public EventKalender(ArrayList<Event> eventKalender) {
        this.eventKalender = eventKalender;
    }

    public ArrayList<Event> getEventKalender() {
        return eventKalender;
    }

    public void setEventKalender(ArrayList<Event> eventKalender) {
        this.eventKalender = eventKalender;
    }

    public void add(Event e){
        eventKalender.add(e);
    }
    public Event getByTitle(String title){
        for (Event e: eventKalender) {
            if(e.getTitle().equals(title)){
                return e;
            }
        }
        return null;
    }
    public ArrayList<Event> getByOrt(String ort){
        ArrayList<Event> found = new ArrayList<>();
        for (Event e:eventKalender) {
            if(e.getOrt().equals(ort)){
                found.add(e);
            }
        }
        return found;
    }
    public ArrayList<Event> getByEintrittsPreis(double min, double max){
        ArrayList<Event> found = new ArrayList<>();
        for(Event e: eventKalender){
           if(e.getEintrittspreis()<= max && e.getEintrittspreis()>=min){
               found.add(e);
           }
        }

        return found;
    }
    public Event getMostExpensiveByOrt(String ort){
        double maxPreis = 0;
        Event mostExpensive = null;

        for (Event e:eventKalender) {
            if(e.getEintrittspreis()> maxPreis){
                maxPreis = e.getEintrittspreis();
                mostExpensive = e;
            }
        }
        return mostExpensive;
    }
    public double getAvgPreisByOrt(String ort){
        double sum = 0;
        int counter = 0;
        Event averageEvent = null;

        for (Event e:eventKalender) {
            if(e.getOrt().equals(ort)){
                sum += e.getEintrittspreis();               //gesamtes Geld alle zusammengerechnet
                counter++;
            }
            if(counter >0){
                return sum / counter;
            }
        }
        return 0.0;
    }
}
