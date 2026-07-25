package app.conicmc;


import net.minecraftforge.installer.ClientInstall;
import java.io.File;
import com.google.common.base.Predicates;
import net.minecraftforge.installer.ServerInstall;

public class Bootstrap {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: bootstrapper <minecraft-dir>");
            System.exit(1);
        }
        File minecraftDir = new File(args[0]);
        ClientInstall install = new ClientInstall();
        ServerInstall.headless = true;
        boolean result = install.run(
                minecraftDir,
                Predicates.alwaysTrue()
        );

        System.out.println(result);
    }
}