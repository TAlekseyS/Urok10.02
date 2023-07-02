public class Radio {
    private int currentRadioStationNumber;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    /*public void setNextRadioStationNumber() {
        int actualStationNumber = currentRadioStationNumber + 1;
        setCurrentRadioStationNumber(actualStationNumber);
    }*/

    public void setNextRadioStationNumber() {
        int actualStationNumber = currentRadioStationNumber;
        setCurrentRadioStationNumber(actualStationNumber);
        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void setPervRadioStationNumber() {
        int actualStationNumber = currentRadioStationNumber;
        setCurrentRadioStationNumber(actualStationNumber);
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public int currentSoundVolume;

    /* public int getCurrentSoundVolume() {
         return currentSoundVolume;
     }*/
    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void setNextSoundVolume() {
        int actualCurrentSoundVolume = currentSoundVolume;
        setCurrentSoundVolume(actualCurrentSoundVolume);
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        } else {
            currentSoundVolume = 100;
        }

    }

    public void setPervSoundVolume() {
        int actualCurrentSoundVolume = currentSoundVolume;
        setCurrentSoundVolume(actualCurrentSoundVolume);
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        } else {
            currentSoundVolume = 0;
        }

    }


}
