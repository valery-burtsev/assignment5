package ac.za.cput.service;

import ac.za.cput.domain.UserAddress;

import java.util.Set;

public interface UserAddressService extends ServiceInterface<UserAddress, String> {
    Set<UserAddress> getAll();
}
