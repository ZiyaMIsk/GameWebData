package core.adapters.concretes;

import java.rmi.RemoteException;

import core.adapters.abstracts.MernisAdapterService;
import core.externals.MernisService;
import entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterManager implements MernisAdapterService{

	MernisService mernisService = new MernisService();

	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy proxy =new KPSPublicSoapProxy();
		
		
		
		try {
			return proxy.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()).longValue(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth());
		} 
		
		catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
			
			return false;
		}
	}
}