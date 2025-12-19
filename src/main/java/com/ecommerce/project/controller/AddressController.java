package com.ecommerce.project.controller;

import com.ecommerce.project.model.User;
import com.ecommerce.project.payload.AddressDTO;
import com.ecommerce.project.service.AddressService;
import com.ecommerce.project.util.AuthUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController {

    private final AddressService addressService;
    private final AuthUtil authUtil;

    public AddressController(AddressService addressService, AuthUtil authUtil) {
        this.addressService = addressService;
        this.authUtil = authUtil;
    }

    @PostMapping("/addresses")
    public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO){
        User user = authUtil.loggedInUser();
        AddressDTO savedAddressDto = addressService.createAddress(addressDTO, user);

        return new ResponseEntity<>(savedAddressDto, HttpStatus.CREATED);
    }

    @GetMapping("/addresses")
    public ResponseEntity<List<AddressDTO>> getAllAddresses(){
        List<AddressDTO> listOfAddresses = addressService.getAllAddresses();

        return new ResponseEntity<>(listOfAddresses, HttpStatus.CREATED);
    }

    @GetMapping("/addresses/{addressId}")
    public ResponseEntity<AddressDTO> getAddressesByID(@PathVariable Long addressId){
        AddressDTO addressDTO = addressService.getAllAddressesById(addressId);

        return new ResponseEntity<>(addressDTO, HttpStatus.CREATED);
    }

    @GetMapping("/users/addresses")
    public ResponseEntity<List<AddressDTO>> getUserAddresses(){
        User user = authUtil.loggedInUser();
        List<AddressDTO> addressDTOList = addressService.getUserAddresses(user);

        return new ResponseEntity<>(addressDTOList, HttpStatus.CREATED);
    }

    @PutMapping("/addresses/{addressId}")
    public ResponseEntity<AddressDTO> updatedAddressesByID(@PathVariable Long addressId, @RequestBody AddressDTO addressDTO){
        AddressDTO updatedAddressDTO = addressService.updateAddressesById(addressId, addressDTO);

        return new ResponseEntity<>(updatedAddressDTO, HttpStatus.CREATED);
    }

    @DeleteMapping("/addresses/{addressId}")
    public ResponseEntity<String> deleteAddresses(@PathVariable Long addressId){
        String status = addressService.deleteAddresses(addressId);

        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
}
