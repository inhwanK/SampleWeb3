package egovframework.sample.service;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SampleServiceClient {
	
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");
//		SampleDAO sampleDAO = (SampleDAO) container.getBean("daoJDBC");
		
		SampleService samplesv = (SampleService) container.getBean("sampleServiceImple1");
		
		
		SampleVO vo = new SampleVO();
		vo.setId(1);
		
		vo = samplesv.selectSample(vo);
		System.out.println(vo);
//		SampleVO vo = new SampleVO();
//		vo.setTitle("임시 제목");
//		vo.setRegUser("테스터");
//		vo.setContent("임시내용입니다..");
//		samplesv.insertSample(vo);
//		
//		List<SampleVO> sampleList = samplesv.selectSampleList(vo);
//		System.out.println("[SampleList]");
//		
//		for(SampleVO sample:sampleList) {
//			System.out.println("--->" + sample.toString());
//		}
		
//		sampleDAO.insertSample();
//		sampleDAO.selectSampleList();
//		container.close();
	}
}