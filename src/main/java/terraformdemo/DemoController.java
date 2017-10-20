/**
 * Author: John Williams
 * Site: https://github.com/40aujohnwilliams/terraform-demo-app
 */

package terraformdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DemoController {
    private static final String SHRUG = "¯\\_(ツ)_/¯";

    @RequestMapping("/")
    public String index() {
        String ipaddr;
        try {
            ipaddr = InetAddress.getLocalHost().getHostAddress();
        }
        catch (UnknownHostException e) {
            ipaddr = SHRUG;
        }

        return "My IP Address: " + ipaddr;
    }

}
