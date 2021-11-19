package hrms.hrms.core.utilities.adapters.concretes;

import hrms.hrms.core.utilities.adapters.abstracts.JobSeekerCheckService;
import hrms.hrms.entities.concretes.JobSeekerUser;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements JobSeekerCheckService {

	public boolean result;

	@Override
	public boolean checkIfRealPerson(JobSeekerUser jobSeekerUser) throws Exception {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(jobSeekerUser.getNationaltyId()),
			        jobSeekerUser.getFirstName(),
			        jobSeekerUser.getLastName(),
			        jobSeekerUser.getYear());
		
        return result;
	}
	
	

}
