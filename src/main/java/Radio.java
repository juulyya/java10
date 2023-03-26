public class Radio {
    public int currentRadioStation;
    public int volume = 10;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (getCurrentRadioStation() == 9) {
            setCurrentRadioStation(0);
            return;
        }
        currentRadioStation = currentRadioStation + 1;
    }

    public void prevRadioStation() {
        if (getCurrentRadioStation() == 0) {
            setCurrentRadioStation(9);
            return;
        }
        currentRadioStation = currentRadioStation - 1;
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
