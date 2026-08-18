package ru.netology.smartradio;

public class Radio {
    private int currentStation; // Номер станции (должен быть от 0 до 9)
    private int currentVolume;  // Громкость (должна быть от 0 до 100)

    public Radio() {
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            currentVolume = newVolume;
        }
    }
    // Увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    // Переключение на следующую станцию
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    // Уменьшение громкости
    public void TurnDownVolume() {
        if (currentVolume >0) {
            currentVolume = currentVolume - 1;
        }
    }

    // Переключение на предыдущую станцию
    public void previous() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation <= 9) {
            currentStation = newStation;
        }
    }

    // Геттеры (чтобы тесты могли проверить текущее состояние)
    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}