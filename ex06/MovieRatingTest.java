package ex06;

public class MovieRatingTest {
	public static void main(String[] args) {
		SmartHomeHub hub = new SmartHomeHub();

		hub.addLight(new SmartLight());
		hub.addLight(new SmartLight());
		hub.addThermostat(new SmartThermostat());
		hub.addCamera(new SmartCamera());

		hub.turnOnAllLights();
		hub.setAllTemperatures(22.5);
		hub.activateAllSecurity();
	}
}
