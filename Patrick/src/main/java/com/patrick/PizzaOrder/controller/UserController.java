package com.patrick.PizzaOrder.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {/*
    @GetMapping("/users/{id}")
    @ApiOperation(value = "get user information", notes = "")
    @ApiImplicitParams({@ApiImplicitParam(name = "userId", value = "Id of user", required = true, dataType = "int"),})
    public Staff getUser(@PathVariable int id, final HttpServletResponse response) {
        String headerValue = CacheControl.maxAge(10, TimeUnit.SECONDS).getHeaderValue();
        response.addHeader("Cache-Control", headerValue);
        return new Staff(id, "user@test.com", "testPassword", 30);
    }

    @GetMapping(value = "/users")
    public Staff getByEmail(@RequestParam("email") String email) {
        return new Staff(123, email, "testPassword", 20);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public Staff create(@Valid @RequestBody Staff staff, BindingResult result) {
        System.out.println("staff:" + staff);
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
            }
        }
        return new Staff(12344, staff.getEmail(), staff.getPassword(), staff.getAge());
    }*/
}