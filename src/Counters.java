import javax.swing.*;
import java.util.Scanner;

public class Counters extends Receipts {
    private static double waterMeter;
    private static double gasMeter;
    private static double electricityNightMeter;
    private static double electricityDayMeter;


    public static double getWaterMeter(){
        return waterMeter;
    }
    public static void setWaterMeter(double newWaterMeter){
        waterMeter = newWaterMeter;
    }
    public static double getGasMeter(){
        return gasMeter;
    }
    public static void setGasMeter(double newGasMeter){
        gasMeter = newGasMeter;
    }
    public static double getElectricityNightMeter(){
        return electricityNightMeter;
    }
    public static void setElectricityNightMeter(double newElectricityNightMeter) {
        electricityNightMeter = newElectricityNightMeter;
    }
    public static double getElectricityDayMeter(){
        return electricityDayMeter;
    }
    public static void setElectricityDayMeter(double newElectricityDayMeter){
        electricityDayMeter = newElectricityDayMeter;
    }

    public static double amount(){
        double amountOfWater = (waterMeter - getTotalWaterCount())*getFixWaterPrise();
        double amountOfGas = (gasMeter-getTotalGasCount())*getFixGasPrise();
        double amountOfElectricNight = (electricityNightMeter-getTotalElectricNightCount())*getFixElectricityNightPrise();
        double amountOfElectricDay = (electricityDayMeter-getTotalElectricDayCount())*getFixElectricityDayPrise();
        return amountOfWater+amountOfGas+amountOfElectricNight+amountOfElectricDay;
    }

    public static String startMenu(){
        String a = JOptionPane.showInputDialog(null, "Выберите номер: \n " +
                "1 - Расчёт суммы\n " +
                "2 - Установить значение счётчиков\n " +
                "3 - Установить фиксированную стоимость\n" +
                "4 - Выход");
        if(a!=null && !a.equals("")){
            if(a.equals("1"))
                return a;
            else if(a.equals("2"))
                return a;
            else if(a.equals("3"))
                return a;
            else if(a.equals("4"))
                return  a;
            else{
                JOptionPane.showMessageDialog(null, "Вы не выбрали необходимое значение!");
                startMenu();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Вы не ввели значение!");
        }
        return "4";
    }

    public static void exit(){
        System.exit(0);
    }

    public static void menu1(){
        String menu1Water = JOptionPane.showInputDialog(null,"Введите текущее значение счетчика Воды:\n" +
                "(Ранее вы указывали: "+ getTotalWaterCount()+")");
        String menu1Gas = JOptionPane.showInputDialog(null,"Введите текущее значение счетчика Газа:\n" +
                "(Ранее вы указывали: "+ getTotalGasCount()+")");
        String menu1ElectricNigth = JOptionPane.showInputDialog(null,"Введите текущее значение\n счетчика Электричества \"Ночь\":\n" +
                "(Ранее вы указывали: "+ getTotalElectricNightCount()+")");
        String menu1ElectricDay = JOptionPane.showInputDialog(null,"Введите текущее значение\n счетчика Электричества \"День\":\n" +
                "(Ранее вы указывали: "+ getTotalElectricDayCount()+")");
        String menu1Confirmation = JOptionPane.showInputDialog(null,"Подтвердить и сохранить введеные значения?\n" +
                "1 - Да\n" +
                "2 - Выход в меню\n"+
                "3 - Выход из программы");
        if(menu1Confirmation!=null && !menu1Confirmation.equals("")) {
            if (menu1Confirmation.equals("1")) {
                setWaterMeter(Double.parseDouble(menu1Water));
                setGasMeter(Double.parseDouble(menu1Gas));
                setElectricityNightMeter(Double.parseDouble(menu1ElectricNigth));
                setElectricityDayMeter(Double.parseDouble(menu1ElectricDay));
                double summ = amount();
                JOptionPane.showMessageDialog(null, summ+" руб.");
                setTotalWaterCount(getWaterMeter());
                setTotalGasCount(getGasMeter());
                setTotalElectricNightCount(getElectricityNightMeter());
                setTotalElectricDayCount(getElectricityDayMeter());
                menuManagmant();
            } else if (menu1Confirmation.equals("2")) {
                menuManagmant();
            } else if (menu1Confirmation.equals("3")) {
                exit();
            }else{
                JOptionPane.showMessageDialog(null, "Вы не выбрали необходимое значение!");
                menuManagmant();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Вы не ввели значение!");
            menuManagmant();
        }
    }

    public static void menu2(){
        String menu2Water = JOptionPane.showInputDialog(null,"Введите значение счетчика Воды:\n"+
                "(Ранее вы указывали: "+ getTotalWaterCount()+")");
        String menu2Gas = JOptionPane.showInputDialog(null,"Введите значение счетчика Газа:\n"+
                "(Ранее вы указывали: "+ getTotalGasCount()+")");
        String menu2ElectricNigth = JOptionPane.showInputDialog(null,"Введите значение\n счетчика Электричества \"Ночь\":\n"+
                "(Ранее вы указывали: "+ getTotalElectricNightCount()+")");
        String menu2ElectricDay = JOptionPane.showInputDialog(null,"Введите значение\n счетчика Электричества \"День\":\n"+
                "(Ранее вы указывали: "+ getTotalElectricDayCount()+")");
        String menu2Confirmation = JOptionPane.showInputDialog(null,"Сохранить введенные значения?\n" +
                "1 - Да\n" +
                "2 - Выход в меню\n"+
                "3 - Выход из программы");
        if(menu2Confirmation!=null && !menu2Confirmation.equals("")){
            if(menu2Confirmation.equals("1")){
                setTotalWaterCount(Double.parseDouble(menu2Water));
                setTotalGasCount(Double.parseDouble(menu2Gas));
                setTotalElectricNightCount(Double.parseDouble(menu2ElectricNigth));
                setTotalElectricDayCount(Double.parseDouble(menu2ElectricDay));
                menuManagmant();
            }
            else if(menu2Confirmation.equals("2")){
                menuManagmant();
            }
            else if(menu2Confirmation.equals("3")){
                exit();
            }
            else{
                JOptionPane.showMessageDialog(null, "Вы не выбрали необходимое значение!");
                menuManagmant();
            }
        } else
            JOptionPane.showMessageDialog(null, "Вы не ввели значение!");
            menuManagmant();
    }

    public static void menu3(){
        String menu3Water = JOptionPane.showInputDialog(null,"Введите фиксированную цену для Воды:\n"+
                "(Ранее вы указывали: "+ getFixWaterPrise()+")");
        String menu3Gas = JOptionPane.showInputDialog(null,"Введите фиксированную цену для Газа:\n"+
                "(Ранее вы указывали: "+ getFixGasPrise()+")");
        String menu3ElectricNigth = JOptionPane.showInputDialog(null,"Введите фиксированную цену\n для Электричества \"Ночь\":\n"+
                "(Ранее вы указывали: "+ getFixElectricityNightPrise()+")");
        String menu3ElectricDay = JOptionPane.showInputDialog(null,"Введите фиксированную цену\n для Электричества \"День\":\n"+
                "(Ранее вы указывали: "+ getFixElectricityDayPrise()+")");
        String menu3Confirmation = JOptionPane.showInputDialog(null,"Сохранить введенные значения?\n" +
                "1 - Да\n" +
                "2 - Выход в меню\n"+
                "3 - Выход из программы");
        if(menu3Confirmation!=null && !menu3Confirmation.equals("")){
            if(menu3Confirmation.equals("1")){
                setFixWaterPrise(Double.parseDouble(menu3Water));
                setFixGasPrise(Double.parseDouble(menu3Gas));
                setFixElectricityNightPrise(Double.parseDouble(menu3ElectricNigth));
                setFixElectricityDayPrise(Double.parseDouble(menu3ElectricDay));
                menuManagmant();
            }
            else if(menu3Confirmation.equals("2")){
                menuManagmant();
            }
            else if(menu3Confirmation.equals("3")){
                exit();
            }
            else{
                JOptionPane.showMessageDialog(null, "Вы не выбрали необходимое значение!");
                menuManagmant();
            }
        } else
            JOptionPane.showMessageDialog(null, "Вы не ввели значение!");
            menuManagmant();
    }

    public static void menu4(){
        String menu4Exit = JOptionPane.showInputDialog(null,"Вы действительно хотите выйти?\n" +
                "1 - Да\n" +
                "2 - Нет");
        if(menu4Exit!=null && !menu4Exit.equals("")){
            if(menu4Exit.equals("1")){
                exit();
            }
            else if(menu4Exit.equals("2")){
                menuManagmant();
            }
            else{
                JOptionPane.showMessageDialog(null, "Вы не выбрали необходимое значение!");
                menuManagmant();
            }
        } else
            JOptionPane.showMessageDialog(null, "Вы не ввели значение!");
            menuManagmant();
    }
    public static void menuManagmant(){
        while (!false) {
            String a = startMenu();
            if (a.equals("1")) {
                menu1();
            } else if (a.equals("2")) {
                menu2();
            } else if (a.equals("3")) {
                menu3();
            } else if (a.equals("4")) {
                menu4();
            }

        }
    }

    public static void manual(){
        JOptionPane.showMessageDialog(null, "Добро пожаловать в программу расчёта домашних счётчиков!\n"+
                "Для корректной работы программы, при первом запуске\n"+
                "обязательно выполните следующие действия:\n"+
                "- установите значение фиксированной цены\n"+
                "- установите значения счётчиков\n"+
                "При использовании программы, все показатели\n"+
                "будут сохранены. При следующем использовании выбрать\n"+
                "меню \"Расчёт стоимости\" и вводить текущие показатели.");
    }
    public static void manual2(){
        JOptionPane.showMessageDialog(null, "Расчёт суммы - просто введите текущие показатели,\n" +
                "программа самостоятельно расчитает общую сумму\n" +
                "на основании ранее введенных показателей");
    }


    public static void start(){
        boolean check = checkingDirectory();
        if(check == true) {
            manual2();
            menuManagmant();
        }
        else{
            creatingFiles();
            manual();
            menuManagmant();
        }
    }

    public static void main(String[] arg){
        start();
    }
}
