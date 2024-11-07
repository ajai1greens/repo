package com.omrbranch.payload.address;

import com.omrbranch.address.pojo.CityPOjo;
import com.omrbranch.address.pojo.DeleteAddress;
import com.omrbranch.address.pojo.PojoAddress;
import com.omrbranch.address.pojo.UpdateAddress;

public class AddressPayload {

	public CityPOjo addCityPayload(int stateId) {
		CityPOjo cityPOjo = new CityPOjo(stateId);
		return cityPOjo;

	}

	public PojoAddress addAddressPayloadd(String firstname, String lastname, String mobile, String appartment,
			int state, int city, int country, String zipcode, String Address, String Addresstype) {
		PojoAddress addaddress = new PojoAddress(firstname, lastname, mobile, appartment, state, city, country, zipcode,
				Address, Addresstype);
		return addaddress;

	}

	public UpdateAddress updateAddressPayLoad(String address_id, String firstname, String lastname, String mobile,
			String appartment, int state, int city, int country, String zipcode, String Address, String Addresstype) {
		UpdateAddress updateaddress = new UpdateAddress(address_id, firstname, lastname, mobile, appartment, state,
				city, country, zipcode, Address, Addresstype);
		return updateaddress;

	}

	public DeleteAddress deleteAddress(String address_id) {
		DeleteAddress address = new DeleteAddress(address_id);
		return address;
	}

}
