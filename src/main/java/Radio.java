public class Radio {
    public static int currentStation;
    public int currentVolume;

    public int getCurrentStation() {

        return currentStation;
    }


    //  public void next() {
    //    if (currentStation < 9) {
    //       currentStation++;
    //         return;
    //    }
    //      currentStation = 0;

    //  }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        Radio.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
