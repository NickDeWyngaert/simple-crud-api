package simplecrudapi.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping
    @ResponseBody
    public List<String> getAllAvailableApis(){
        List<String> availableApis = new ArrayList<>();
        availableApis.add("/api/movies");
        return availableApis;
    }

}
