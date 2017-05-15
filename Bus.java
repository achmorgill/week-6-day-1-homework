public class Bus {
  private String route;
  private Person[] passengers;

  public Bus(String route){
    this.route = route;
    this.passengers = new Person[5];
  }
  public String getRoute(){
    return this.route;
  }

  public int getNoOfPassengers() {
    int count = 0;
    for (Person person : passengers) {
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public void passengerGetsOnBus(Person person) {
    if (isBusFull()) {
      return;
    }
    int passengerCount = getNoOfPassengers();
    passengers[passengerCount] = person;
  }

  public boolean isBusFull() {
   return getNoOfPassengers() == passengers.length;
 }

  public void emptyTheBus() {
      for (int i = 0; i < passengers.length; i++) {
        passengers[i] = null;
      }
    }

}


