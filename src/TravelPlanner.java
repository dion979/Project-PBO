abstract class TravelPlanner {
    private String tripType;
    private int duration;

    public TravelPlanner(String tripType, int duration) {
        this.tripType = tripType;
        this.duration = duration;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public abstract void planTrip();
}