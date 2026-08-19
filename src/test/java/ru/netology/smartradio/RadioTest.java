package ru.netology.smartradio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.previous();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationFromMin() {
        Radio radio = new Radio();
        radio.previous();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStationValid() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetCurrentStationInvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCreateRadioWithDefaultStationsCount() {
        Radio radio = new Radio();
        assertEquals(10, radio.getStationsCount());
    }

    @Test
    public void shouldCreateRadioWithCustomStationsCount() {
        Radio radio = new Radio(5);
        assertEquals(5, radio.getStationsCount());
    }

    @Test
    public void shouldCreateRadioWithInvalidStationsCount() {
        Radio radio = new Radio(0);
        assertEquals(10, radio.getStationsCount());
    }

    @Test
    public void shouldNextStationWrapAroundWithCustomCount() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(4);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationWrapAroundWithCustomCount() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(0);
        radio.previous();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBeyondCustomMax() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
}