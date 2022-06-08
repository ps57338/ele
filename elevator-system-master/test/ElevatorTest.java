

import org.junit.*;


public class ElevatorTest {
    static ElevatorServer server = new ElevatorServer() ;
    static Elevator elevator = Elevator.getElevator();
    @BeforeClass
    public static void initTest() {
        new Thread(server).start() ;

        // Get the instance of Elevator
        System.out.println(elevator.currentfloor);


    }

//    @After
//    public void cleanUp() throws InterruptedException {
//        ElevatorHandler.goToFloor(elevator,0);
//        Thread.sleep(3000);
//    }


    @Test
    public void testRequestingOneElevator() throws Exception{
        // Move Elevator
        ElevatorHandler.goToFloor(elevator, 2);
        Thread.sleep(2000);
        Assert.assertEquals(elevator.currentfloor,2);
    }

    @Test
    public void testRequestingOneElevator0() throws Exception{
        // Move Elevator
        ElevatorHandler.goToFloor(elevator, 0);
        Thread.sleep(2000);
        Assert.assertEquals(elevator.currentfloor,0);
    }


    @Test
    public void testRequestingOneElevator10() throws Exception{
        // Move Elevator
        ElevatorHandler.goToFloor(elevator, 10);
        Thread.sleep(2000);
        Assert.assertEquals(elevator.currentfloor,10);
    }


}
