package hrms.hrms.core.utilities.adapters.concretes;

import hrms.hrms.core.utilities.adapters.abstracts.JobSeekerCheckService;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.entities.concretes.JobSeekerUser;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements JobSeekerCheckService {

	@Override
	public Result checkIfRealPerson(JobSeekerUser jobSeekerUser) throws Exception {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(jobSeekerUser.getNationaltyId()),
			        jobSeekerUser.getFirstName(),
			        jobSeekerUser.getLastName(),
			        jobSeekerUser.getYear());
		
			if(!result) {
				return new ErrorResult("mernis başarısız");
			}
				return new SuccessResult("başarılı mernis ");
			}
	
}
