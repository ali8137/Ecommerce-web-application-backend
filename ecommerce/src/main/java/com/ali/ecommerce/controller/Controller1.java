//package com.ali.ecommerce.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//
//// - Using @CrossOrigin annotation on Controller level:
//    // @CrossOrigin
//    // @CrossOrigin(origins = "http://localhost:5173")
//@RestController
//@RequestMapping("/api")
//@RequiredArgsConstructor
//public class Controller1 {
//
//
////    private final ServiceClass1 serviceObj1;
//
////    @Autowired
////    public Controller1(ServiceClass1 serviceObj1) {
////        this.serviceObj1 = serviceObj1;
////    }
//
//
////  - Method level CORS configuration:
////    @CrossOrigin(origins = "http://localhost:5173")
////    public void method1() {}
//
//
//
//    //    @CrossOrigin
//    @ResponseStatus(
//            HttpStatus.NO_CONTENT
//            //   HttpStatus.OK
//            //   HttpStatus.CREATED
//    )
//    @GetMapping("/{id}")
//    public void /*or ResponseEntity<String>*/  getMethod1(
//            @RequestParam("paramName1") ClassName1 obj1,
//            @PathVariable("id") ClassName2 obj2
//    ) {
//
//    }
//
//
//    //    @CrossOrigin
//    @ResponseStatus(
//            HttpStatus.NO_CONTENT
//            //    HttpStatus.OK
//            //    HttpStatus.CREATED
//    )
//    @PostMapping()
//    public void /*or ResponseEntity<String>*/  postMethod1(@RequestBody ClassName1 obj1) {
//
//    }
//
//
//    //    @CrossOrigin
//    @ResponseStatus(
//            HttpStatus.NO_CONTENT
//            //    HttpStatus.OK
//            //    HttpStatus.CREATED
//    )
//    @PutMapping("/{id}")
//    public void /*or ResponseEntity<String>*/ putMethod1(
//            @RequestBody ClassName1 obj1,
//            @PathVariable("id") ClassName2 obj2
//    ) {
//
//    }
//
//
//
//    //    @CrossOrigin
//    @ResponseStatus(
//            HttpStatus.NO_CONTENT
//            //    HttpStatus.OK
//            //    HttpStatus.CREATED
//    )
//    @DeleteMapping("/{id}")
//    public void /*or ResponseEntity<String>*/ putMethod1(
//            @PathVariable("id") ClassName1 obj1
//    ) {
//
//    }
//
//}
