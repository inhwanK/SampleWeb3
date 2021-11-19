package egovframework.sample.service.imple;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleVO;

@Repository
public class SampleDAOIBatis implements SampleDAO{

	@Override
	public void insertSample(SampleVO vo) throws Exception {
		System.out.println("===> IBatis로 insertSample() 기능처리");
		
	}

	@Override
	public void updateSample(SampleVO vo) throws Exception {
		System.out.println("===> IBatis로 updateSample() 기능처리");
		
	}

	@Override
	public void deleteSample(SampleVO vo) throws Exception {
		System.out.println("===> IBatis로 deleteSample() 기능처리");
		
	}

	@Override
	public SampleVO selectSample(SampleVO vo) throws Exception {
		System.out.println("===> IBatis로 selectSample() 기능처리");
		return null;
	}

	@Override
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		System.out.println("===> IBatis로 selectSampleList() 기능처리");
		return null;
	}
}
