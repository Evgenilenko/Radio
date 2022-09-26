public class Radio {
    public int currentStation;
    public int currentVolume;

    public void next() {
        if (currentStation < 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
    public void increaseVolume() {
        if (currentVolume <= 10) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void turnDownVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume--;
        } else currentVolume = 0;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0){
            return;}
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0){
            return;
        } if (currentVolume > 10){
            return;}
        this.currentVolume = currentVolume;
    }
}
