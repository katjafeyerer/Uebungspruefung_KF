package org.campus02.EventKalender;

import java.util.Objects;

public class Event {
    private String title;
    private String ort;
    private double eintrittspreis;

    public Event(String title, String ort, double eintrittspreis) {
        this.title = title;
        this.ort = ort;
        this.eintrittspreis = eintrittspreis;
    }

    public String getTitle() {
        return title;
    }

    public String getOrt() {
        return ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", eintrittspreis=" + eintrittspreis +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Double.compare(event.eintrittspreis, eintrittspreis) == 0 && Objects.equals(title, event.title) && Objects.equals(ort, event.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, ort, eintrittspreis);
    }
}
