package egovframework.sample.service.imple;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;
import egovframework.sample.service.SampleVO;

@Service("sampleServiceImple1")
public class SampleServiceImple implements SampleService {
	
	@Resource(name="daoJDBC")
	private SampleDAO sampleDAO;
	private String version;
	
	public SampleServiceImple() throws Exception{
		System.out.println("===> SampleServiceImple 생성자1");
		//sampleDAO = new SampleDAOJDBC();
	}
	
	@Override
	public void insertSample(SampleVO vo) throws Exception {
		sampleDAO.insertSample(vo);
		
	}

	@Override
	public void updateSample(SampleVO vo) throws Exception {
		sampleDAO.updateSample(vo);
		
	}

	@Override
	public void deleteSample(SampleVO vo) throws Exception {
		sampleDAO.deleteSample(vo);
		
	}

	@Override
	public SampleVO selectSample(SampleVO vo) throws Exception {
		return sampleDAO.selectSample(vo);
	}

	@Override
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		
		return sampleDAO.selectSampleList(vo);
	}
	
	
}
