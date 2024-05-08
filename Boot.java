import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Boot {
    public static void main(String[] args) {
        Laptop hp_pailion_g6 = new Laptop("hp_pailion_g6", 16, "4k", 
        true, 500, "16", "Windows", "black"); 

        Laptop hp_galaxy_x64 = new Laptop("hp_galaxy_x64", 14, "FullHD", 
        true, 500, "8", "Windows", "white");

        Laptop samsung_a52 = new Laptop("samsung_a52", 18, "FullHD", 
        true, 300, "8", "Windows", "black");

        Laptop samsung_m31s = new Laptop("samsung_m31s", 16, "4k", 
        false, 1000, "16", "Linux", "black");

        Laptop lenovo_gtx76 = new Laptop("lenovo_gtx76", 16, "FullHD", 
        true, 700, "8", "Windows", "white");

        Laptop macbook_14pro = new Laptop("macbook_14pro", 17, "4k", 
        false, 1000, "8", "ios", "white");

        Laptop asus_x515 = new Laptop("asus_x515", 17, "FullHD", 
        true, 300, "4", "Windows", "black");

        Laptop acer_air5 = new Laptop("acer_air5", 19, "FullHD", 
        true, 600, "8", "Windows", "black");

        Laptop acer_air6 = new Laptop("acer_air6" ,18, "4k", 
        false, 500, "16", "Windows", "black");

        Laptop acer_a313 = new Laptop("acer_a313", 16, "FullHD", 
        true, 500, "8", "Windows", "black");

        Set <Laptop> laptop = new HashSet<>(
			Arrays.asList(
				hp_pailion_g6,
				hp_galaxy_x64,
				samsung_a52,
				samsung_m31s,
				lenovo_gtx76,
				macbook_14pro,
				asus_x515,
				acer_air5,
				acer_air6,
				acer_a313
			)
        );

        Laptop FilterLaptop = new Laptop();

        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
