package String;

import java.util.Locale;

public class ProcessedCountryEnable {
    public boolean isProcess(String domain){
        String isEnableCountry = "CA,PL,CZ";
        return isEnableCountry.contains(domain.toUpperCase());
    }
    public Boolean isProcessCountry(String domain){
        String isEnableCountry = "FR";
        String [] countryList = isEnableCountry.split(",");
        System.out.println("country enable:- "+countryList);
        for (String processCountry : countryList ){
            if (processCountry.equals(domain.toUpperCase(Locale.ROOT))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ProcessedCountryEnable processedCountryEnable = new ProcessedCountryEnable();
        boolean value = processedCountryEnable.isProcessCountry("FR");
        System.out.println(value);

//        boolean value1 = processedCountryEnable.isProcess("CZ");
//        System.out.println(value1);
    }
}
