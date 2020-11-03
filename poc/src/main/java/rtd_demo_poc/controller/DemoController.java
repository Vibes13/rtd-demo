package rtd_demo_poc.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import rtd_demo_poc.request.UserRequest;
import rtd_demo_poc.response.UserResponse;

@RestController
@RequestMapping("/demo")
@Api(value = "Demo Service")
public class DemoController {

    @PostMapping("/register")
    @ApiOperation(value = "Registration of User", response = String.class)
    public String registerUser(@Validated @RequestBody @ApiParam(name = "user request", required = true) UserRequest userDto)
            throws Exception {

        return "User created with id = 1";
    }

    @GetMapping("/{user_id}")
    @ApiOperation(value = "Fetch User Details By User Id")
    public UserResponse getUsersDetailsByUserId(
            @RequestHeader("X_API_KEY") @ApiParam(example = "Internal-12345", required = true) String xApiKey,
            @PathVariable(value = "user_id") @ApiParam(example = "12", required = true) long userId) throws Exception {

        return new UserResponse(1, "fname", "lname", "9876543210");

    }

}
