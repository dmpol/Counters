import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Receipts {

    private static double fixWaterPrise;
    private static double fixGasPrise;
    private static double fixElectricityNightPrise;
    private static double fixElectricityDayPrise;

    private static double totalWaterCount;
    private static double totalGasCount;
    private static double totalElectricNightCount;
    private static double totalElectricDayCount;

    private static final String directory = "C:\\receipts\\files";
    private static final String waterFix = "C:\\receipts\\files\\fixWaterPrise.txt";
    private static final String gasFix = "C:\\receipts\\files\\fixGasPrise.txt";
    private static final String elNFix = "C:\\receipts\\files\\fixElectricityNightPrise.txt";
    private static final String elDFix = "C:\\receipts\\files\\fixElectricityDayPrise.txt";
    private static final String waterT = "C:\\receipts\\files\\totalWaterCount.txt";
    private static final String gasT = "C:\\receipts\\files\\totalGasCount.txt";
    private static final String elNT = "C:\\receipts\\files\\totalElectricNightCount.txt";
    private static final String elDT = "C:\\receipts\\files\\totalElectricDayCount.txt";


    public static double getFixWaterPrise(){
        try {
            String data = Files.readString(Path.of(waterFix));
            fixWaterPrise = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fixWaterPrise;
    }

    public static void setFixWaterPrise(double newFixWaterPrise){
        if(newFixWaterPrise >=0){
            fixWaterPrise = newFixWaterPrise;
            try {
                Files.writeString(Path.of(waterFix),String.valueOf(newFixWaterPrise));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Фиксированная цена для Воды не может быть меньше 0");
        }
    }

    public static double getFixGasPrise() {
        try {
            String data = Files.readString(Path.of(gasFix));
            fixGasPrise = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fixGasPrise;
    }

    public static void setFixGasPrise(double newFixGasPrise) {
        if(newFixGasPrise >= 0){
            fixGasPrise = newFixGasPrise;
            try {
                Files.writeString(Path.of(gasFix),String.valueOf(newFixGasPrise));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Фиксированная цена для Газа не может быть меньше 0");
        }
    }

    public static double getFixElectricityNightPrise() {
        try {
            String data = Files.readString(Path.of(elNFix));
            fixElectricityNightPrise = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fixElectricityNightPrise;
    }

    public static void setFixElectricityNightPrise(double newFixElectricityNightPrise) {
        if(newFixElectricityNightPrise >=0){
            fixElectricityNightPrise = newFixElectricityNightPrise;
            try {
                Files.writeString(Path.of(elNFix),String.valueOf(newFixElectricityNightPrise));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Фиксированная цена для Электричества \"Ночь\" не может быть меньше 0");
        }
    }

    public static double getFixElectricityDayPrise() {
        try {
            String data = Files.readString(Path.of(elDFix));
            fixElectricityDayPrise = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fixElectricityDayPrise;
    }

    public static void setFixElectricityDayPrise(double newFixElectricityDayPrise) {
        if(newFixElectricityDayPrise>=0){
            fixElectricityDayPrise = newFixElectricityDayPrise;
            try {
                Files.writeString(Path.of(elDFix),String.valueOf(newFixElectricityDayPrise));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Фиксированная цена для Электричества \"День\" не может быть меньше 0");
        }
    }

    public static double getTotalWaterCount(){
        try {
            String data = Files.readString(Path.of(waterT));
            totalWaterCount = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalWaterCount;
    }

    public static void setTotalWaterCount(double newTotalWaterCount){
        if(newTotalWaterCount>=0) {
            totalWaterCount = newTotalWaterCount;
            try {
                Files.writeString(Path.of(waterT),String.valueOf(newTotalWaterCount));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Общие показания счетчика Воды не могут быть меньше 0");
        }
    }

    public static double getTotalGasCount(){
        try {
            String data = Files.readString(Path.of(gasT));
            totalGasCount = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalGasCount;
    }

    public static void setTotalGasCount(double newTotalGasCount){
        if(newTotalGasCount>=0) {
            totalGasCount = newTotalGasCount;
            try {
                Files.writeString(Path.of(gasT),String.valueOf(newTotalGasCount));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Общие показания счетчика Газа не могут быть меньше 0");
        }
    }

    public static double getTotalElectricNightCount(){
        try {
            String data = Files.readString(Path.of(elNT));
            totalElectricNightCount = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalElectricNightCount;
    }

    public static void setTotalElectricNightCount(double newTotalElectricNightCount) {
        if(newTotalElectricNightCount>=0) {
            totalElectricNightCount = newTotalElectricNightCount;
            try {
                Files.writeString(Path.of(elNT),String.valueOf(newTotalElectricNightCount));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Общие показания счетчика Электричества \"Ночь\" не могут быть меньше 0");
        }
    }

    public static double getTotalElectricDayCount() {
        try {
            String data = Files.readString(Path.of(elDT));
            totalElectricDayCount = Double.parseDouble(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalElectricDayCount;
    }

    public static void setTotalElectricDayCount(double newTotalElectricDayCount) {
        if(newTotalElectricDayCount>=0) {
            totalElectricDayCount = newTotalElectricDayCount;
            try {
                Files.writeString(Path.of(elDT),String.valueOf(newTotalElectricDayCount));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Общие показания счетчика Электричества \"День\" не могут быть меньше 0");
        }
    }

    public static boolean checkingDirectory(){
        return Files.isDirectory(Path.of(directory));
    }

    public static void creatingFiles(){
        String a = "0";
        try {
            Files.createDirectories(Path.of(directory));
            Files.createFile(Path.of(waterFix));
            Files.writeString(Path.of(waterFix),a);
            Files.createFile(Path.of(gasFix));
            Files.writeString(Path.of(gasFix),a);
            Files.createFile(Path.of(elNFix));
            Files.writeString(Path.of(elNFix),a);
            Files.createFile(Path.of(elDFix));
            Files.writeString(Path.of(elDFix),a);
            Files.createFile(Path.of(waterT));
            Files.writeString(Path.of(waterT),a);
            Files.createFile(Path.of(gasT));
            Files.writeString(Path.of(gasT),a);
            Files.createFile(Path.of(elNT));
            Files.writeString(Path.of(elNT),a);
            Files.createFile(Path.of(elDT));
            Files.writeString(Path.of(elDT),a);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
