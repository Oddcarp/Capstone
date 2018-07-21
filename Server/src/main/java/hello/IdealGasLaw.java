package hello;


public class IdealGasLaw {
    // private double pressure;
    // private double volume;
    // private double moles;
    // private double temperatue;
    //private String equationChoice;
    private final double GAS_CONSTANT = 0.082057;
    private String result;
    private double solution;
    private String finalSolution;
    private String solveFor;



    public IdealGasLaw(long id, String pressure, String volume, String moles, String temperature) {
        if (pressure == "") {
            double volumeDouble = Double.parseDouble(volume);
            double molesDouble = Double.parseDouble(moles);
            double temperatureDouble = Double.parseDouble(temperature);
            solveFor = "Pressure";
            finalSolution = solveForPressure(volumeDouble, molesDouble, temperatureDouble);
        } else if (volume == "") {
            double pressureDouble = Double.parseDouble(pressure);
            double molesDouble = Double.parseDouble(moles);
            double temperatureDouble = Double.parseDouble(temperature);
            solveFor = "Volume";
            finalSolution = solveForVolume(pressureDouble, molesDouble, temperatureDouble);
        } else if (moles == "") {
            double pressureDouble = Double.parseDouble(pressure);
            double volumeDouble = Double.parseDouble(volume);
            double temperatureDouble = Double.parseDouble(temperature);
            solveFor = "Moles";
            finalSolution = solveForMoles(pressureDouble, volumeDouble, temperatureDouble);
        } else if (temperature == "") {
            double pressureDouble = Double.parseDouble(pressure);
            double volumeDouble = Double.parseDouble(volume);
            double molesDouble = Double.parseDouble(moles);
            solveFor = "Temperature";
            finalSolution = solveForTemperature(pressureDouble, volumeDouble, molesDouble);
        }
    }

    public String getSolutionType() {
        return solveFor;
    }
    public String getSolution() {
        return finalSolution;
    }

    public String solveForPressure(double volume, double moles, double
            temperature){
        solution = (moles * GAS_CONSTANT * temperature)/volume;
        result = Double.toString(solution);
        return result;
    }
    public String solveForVolume(double pressure, double moles, double
            temperature){
        solution = (moles * GAS_CONSTANT * temperature)/pressure;
        result = Double.toString(solution);
        return result;
    }
    public String solveForMoles(double pressure, double volume, double
            temperatue){
        solution = (pressure * volume)/(GAS_CONSTANT * temperatue);
        result = Double.toString(solution);
        return result;
    }
    public String solveForTemperature(double pressure, double volume,
                                      double moles){
        solution = (pressure * volume)/(moles * GAS_CONSTANT);
        result = Double.toString(solution);
        return result;
    }


}
