package com.cb.springdata.sample.rest;

import static org.springframework.hateoas.MediaTypes.HAL_JSON_VALUE;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cb.springdata.sample.entities.Building;
import com.cb.springdata.sample.service.BuildingService;



@RestController
@RequestMapping("/building")
public class BuildingRestController {
  @Autowired
  private BuildingService service; 
  @RequestMapping(method = RequestMethod.POST,produces = HAL_JSON_VALUE)
  public ResponseEntity<Building> createProductCopyOrder(
          @RequestBody @Valid final Building building) {
     
      return new ResponseEntity<Building>(service.save(building),
              HttpStatus.CREATED);
  }
  @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = HAL_JSON_VALUE)
  public ResponseEntity<Building> getProductCopyOrderById(@PathVariable("id") String Id) {
      return new ResponseEntity<Building>(service.findById(Id),
              HttpStatus.OK);
  }
}
