package core.externals;

import core.adapters.abstracts.MernisAdapterService;
import entities.concretes.Customer;

public class MernisService implements MernisAdapterService{
	public boolean  checkIfRealPerson(Customer customer) {
		return true;
	}

}
