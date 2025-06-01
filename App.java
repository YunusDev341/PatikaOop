import java.util.List;
import java.util.Random;

public class Building {
    private List<Floor> floors;
    private List<Elevator> elevators;

    public Building() {
    
    }
}

// Kat
public class Floor {
    private int floorNumber;
    private List<Door> doors; 
    private List<CallButton> callButtons; 
    private List<ArrivalBell> arrivalBells; 

    public Floor(int number) {
        this.floorNumber = number;
        
    }
}


public abstract class Elevator {
    protected Door door;
    protected IndicatorLight floorIndicator;
    protected ControlPanel controlPanel;
    protected int capacity = 6;
    protected int currentFloor;
    protected Direction direction;
    protected List<Passenger> passengers;

    public abstract void move();

    public void openDoor() {  }
    public void closeDoor() {  }
}


enum Direction {
    UP, DOWN, IDLE
}


public class NormalElevator extends Elevator {
    @Override
    public void move() {
       
    }
}

// Kapı
public class Door {
    private IndicatorLight signalLight;

    public void open() {  }
    public void close() { }
}


public class IndicatorLight {
    private boolean isOn;
    private Direction direction;

    public void turnOn(Direction direction) {
        this.isOn = true;
        this.direction = direction;
    }

    public void turnOff() {
        this.isOn = false;
    }
}


public class ControlPanel {
    private List<CallButton> targetButtons;
    private CallButton doorOpenButton;
    private CallButton doorCloseButton;
    private CallButton emergencyButton;

    
}

public class CallButton {
    private Direction direction;
    private boolean pressed;

    public void press() {
        pressed = true;
    }
    public void reset() {
        pressed = false;
    }
}


public class ArrivalBell {
    public void ring() {
       
    }
}


public class Passenger {
    private int startFloor;
    private int destinationFloor;

    public Passenger(int start, int dest) {
        this.startFloor = start;
        this.destinationFloor = dest;
    }

    public void callElevator(Building building, Direction direction) {
        
    }

    public void pressTargetButton(Elevator elevator) {
        
    }
}

public class Simulator {
    private Clock clock;
    private Building building;
    private Random random;

    public Simulator() {
        this.building = new Building();
        this.clock = new Clock();
        this.random = new Random();
    }

    public void runSimulation() {

    }
}


public class Clock {
    private long currentTime;

    public void tick() {
        currentTime++;
    }

    public long getTime() {
        return currentTime;
    }
}
