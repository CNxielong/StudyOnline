package cn.xdl.ovls.paper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.ovls.paper.dao.PaperMapper;
import cn.xdl.ovls.paper.entity.Paper;
import cn.xdl.ovls.paper.util.ResponseResult;

@Service
public class PaperServiceImpl implements PaperService{

	@Autowired
	private PaperMapper paperMapper;
	
	@Override
	public ResponseResult selectPaperBySubjectId(Integer subjectId) {
		List<Paper> list = paperMapper.selectPaperBySubjectId(subjectId);
		ResponseResult result = new ResponseResult();
		if(list.isEmpty()){//如果没取到数据
			result.setStatus(2);//数据不存在
			result.setMsg("未找到记录");
		}else{
			result.setStatus(1);//数据存在
			result.setMsg("查找成功");
			result.setData(list);
		}
		return result;
	}

}
