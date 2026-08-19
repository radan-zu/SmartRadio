package ru.netology.smartradio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsCount;

    public Radio() {
        this.stationsCount = 10;
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public Radio(int stationsCount) {
        if (stationsCount > 0) {
            this.stationsCount = stationsCount;
        } else {
            this.stationsCount = 10;
        }
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            this.currentVolume = newVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void next() {
        if (currentStation == this.stationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void previous() {
        if (currentStation == 0) {
            currentStation = this.stationsCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation <= this.stationsCount - 1) {
            currentStation = newStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStationsCount() {
        return stationsCount;
    }
}