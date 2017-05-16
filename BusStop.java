public class BusStop {
    private String location;
    private Person[] passengersInQueue;

    public BusStop(String location){
      this.location = location;
      this.passengersInQueue = new Person[5];
    }

    public String getLocation() {
      return this.location;
    }

    public int getNoPassengersInQueue() {
      int count = 0;
      for (Person person : passengersInQueue) {
          if (person != null) {
            count++;
          }
        }
        return count;
      }

    public void addPassengerToQueue(Person person) {
      int passengersInQueueCount = getNoPassengersInQueue();
      passengersInQueue[passengersInQueueCount] = person;
    }

    public void movePassengerFromQueueToBus() {
      for (int i=0; i < passengersInQueue.length; i++) {
       bus.passengerGetsOnBus(passengersInQueue[i]);
        passengersInQueue[i] = null;
      }
    }
}

