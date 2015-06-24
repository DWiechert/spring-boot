package demo;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

/**
 * Custom banner to print out when the application starts.
 * 
 * @author Dan Wiechert
 */
public class KTBanner implements Banner {
	@Override
	public void printBanner(Environment arg0, Class<?> arg1, PrintStream arg2) {
		// @formatter:off
		arg2.append("   __ ________   ____  ________  _______ \r\n" + 
				"   / //_/_  __/  / __ \\/ ____/  |/  / __ \\\r\n" + 
				"  / ,<   / /    / / / / __/ / /|_/ / / / /\r\n" + 
				" / /| | / /    / /_/ / /___/ /  / / /_/ / \r\n" + 
				"/_/ |_|/_/    /_____/_____/_/  /_/\\____/  \r\n" + 
				"Spring Boot - Dan Wiechert -  06/26/2015 \n\n");
		// @formatter:on
	}
}
