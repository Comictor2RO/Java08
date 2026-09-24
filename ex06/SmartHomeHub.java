package ex06;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    private List<SecurityControl> cameras = new ArrayList<>();
    private List<LightControl> lights = new ArrayList<>();
    private List<TemperatureControl> thermostats = new ArrayList<>();

    public void addLight(LightControl light){
        lights.add(light);
    }

    public void addCamera(SecurityControl camera){
        cameras.add(camera);
    }

    public void addThermostat(TemperatureControl thermostat){
        thermostats.add(thermostat);
    }

    public void turnOnAllLights() {
        for (LightControl light : lights) {
            light.turnOn();
        }
    }

    public void setAllTemperatures(double temperature) {
        for (TemperatureControl thermostat : thermostats) {
            thermostat.setTemperature(temperature);
        }
    }

    public void activateAllSecurity() {
        for (SecurityControl camera : cameras) {
            camera.activateSecurity();
        }
    }
}
