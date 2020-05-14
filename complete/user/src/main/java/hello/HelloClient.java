package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huisheng.jin
 * @date 2020/5/14.
 */
@FeignClient(name = "say-hello")
public interface HelloClient {
    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public String greet();
}
