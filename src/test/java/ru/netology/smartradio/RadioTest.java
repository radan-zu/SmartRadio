package ru.netology.smartradio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    // --- ТЕСТЫ ДЛЯ ГРОМКОСТИ ---

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50); // Устанавливаем исходное значение

        radio.increaseVolume();

        assertEquals(51, radio.getCurrentVolume()); // Проверяем, что увеличилось
    }

    @Test
    public void shouldNotIncreaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100); // Граничное условие: уже максимум

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume()); // Проверяем, что не изменилось
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.TurnDownVolume();

        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotTurnDownVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0); // Граничное условие: уже минимум

        radio.TurnDownVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    // --- ТЕСТЫ ДЛЯ СТАНЦИЙ ---
    // ВАШЕ ЗАДАНИЕ: Допишите тесты ниже по аналогии!

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
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.previous();
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationFromMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.previous();
        assertEquals(9,radio.getCurrentStation());
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
        radio.setCurrentStation(15); // Недопустимое значение
        assertEquals(0, radio.getCurrentStation()); // Должно остаться 0 (из конструктора)
    }
}