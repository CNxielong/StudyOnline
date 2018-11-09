package cn.xdl.ovls.paper.dao.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.xdl.ovls.paper.PaperServiceBootApplication;
import cn.xdl.ovls.paper.dao.PaperMapper;
import cn.xdl.ovls.paper.entity.Paper;

@RunWith(value=SpringRunner.class)
@SpringBootTest(classes={PaperServiceBootApplication.class})
public class PaperMapperTest {

	@Autowired
	private PaperMapper paperMapper;

	@Test
	public void test1() throws Exception {
		Paper paper = paperMapper.selectByPrimaryKey(1);
		System.out.println(paper.getName());
	}
}
