package hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.hrms.business.abstracts.JobSeekerUserService;
import hrms.hrms.core.utilities.adapters.abstracts.JobSeekerCheckService;
import hrms.hrms.core.utilities.results.DataResult;
import hrms.hrms.core.utilities.results.ErrorResult;
import hrms.hrms.core.utilities.results.Result;
import hrms.hrms.core.utilities.results.SuccessDataResult;
import hrms.hrms.core.utilities.results.SuccessResult;
import hrms.hrms.dataAccess.abstracts.JobSeekerUserDao;
import hrms.hrms.entities.concretes.JobSeekerUser;

@Service
public class JobSeekerUserManager implements JobSeekerUserService {

	private JobSeekerUserDao jobSeekerUserDao;
	private JobSeekerCheckService jobSeekerCheckService;

	@Autowired
	public JobSeekerUserManager(JobSeekerUserDao jobSeekerUserDao, JobSeekerCheckService jobSeekerCheckService) {
		super();
		this.jobSeekerUserDao = jobSeekerUserDao;
		this.jobSeekerCheckService = jobSeekerCheckService;
	}

	@Override
	public DataResult<List<JobSeekerUser>> getAll() {
		return new SuccessDataResult<List<JobSeekerUser>>(this.jobSeekerUserDao.findAll(), "İş arayanlar listelendi");
	}

	@Override
	public Result add(JobSeekerUser jobSeekerUser) throws Exception {
					
		if(jobSeekerUser.getNationaltyId() == null || jobSeekerUser.getNationaltyId() == "") {
			return new ErrorResult("Kimlik numarası gereklidir");
		}else if(jobSeekerUser.getFirstName() == null || jobSeekerUser.getFirstName() == "") {
			return new ErrorResult("Adınız gereklidir");
		}else if(jobSeekerUser.getLastName() == null || jobSeekerUser.getLastName() == "") {
			return new ErrorResult("Soyadınız gereklidir");
		}else if(jobSeekerUser.getEmail() == null || jobSeekerUser.getEmail() == "") {
			return new ErrorResult("E-posta girmeniz gereklidir");
		}else if(jobSeekerUser.getPassword() == null || jobSeekerUser.getPassword() == "") {
			return new ErrorResult("Şifre girmeniz gereklidir");
		}else if(jobSeekerUser.getRePassword() == null || jobSeekerUser.getRePassword() == "") {
			return new ErrorResult("Şifreyi tekrar girmeniz gereklidir");
		}else if(jobSeekerUser.getPassword() != jobSeekerUser.getRePassword()) {
			return new ErrorResult("Girdiğiniz şifreler aynı değil");
		}else if(!jobSeekerCheckService.checkIfRealPerson(jobSeekerUser).isSuccess()) {
			return new ErrorResult("Mernis başarısız");
		}else {
			jobSeekerUser.setStatus(true);
			this.jobSeekerUserDao.save(jobSeekerUser);
			return new SuccessResult("İş arayan kullanıcı eklendi");
		}
		
	}

	

}
