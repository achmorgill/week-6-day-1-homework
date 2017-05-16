import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;
  BusStop busStop;

  @Before 
  public void before() {
    bus = new Bus("No 12");
    person = new Person();
    busStop = new BusStop("Haymarket");
  }

  @Test
  public void getRoute(){
    assertEquals("No 12", bus.getRoute()); 
  }

  @Test
  public void noPassengersOnBus() {
    assertEquals(0, bus.getNoOfPassengers());
  }

  @Test
  public void passengerGetsOnBus() {
  busStop.movePassengerFromQueueToBus();
    assertEquals(0,bus.getNoOfPassengers());
  }

  @Test
  public void busIsFullNoMorePassengers() {
    for (int i =0; i<10; i++) {
      bus.passengerGetsOnBus(person);
    }
    assertEquals(5,bus.getNoOfPassengers());
  }

  @Test
  public void emptyTheBus() {
    bus.emptyTheBus();
    assertEquals(0,bus.getNoOfPassengers());
  }
  @Test
  public void getLocation() {
    assertEquals("Haymarket", busStop.getLocation());
  }

  @Test
  public void noPassengersInQueue() {
    assertEquals(0,busStop.getNoPassengersInQueue());
  }
  @Test
  public void addPassengerToQueue() {
    busStop.addPassengerToQueue(person);
    assertEquals(1,busStop.getNoPassengersInQueue());
  }
  @Test
  public void movePassengerFromQueueToBus() {
    busStop.movePassengerFromQueueToBus(person);
    assertEquals(0,busStop.getNoPassengersInQueue());
  }

  
  
}
