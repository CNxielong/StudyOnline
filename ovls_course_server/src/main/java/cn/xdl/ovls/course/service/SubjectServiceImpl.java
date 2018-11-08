package cn.xdl.ovls.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.ovls.course.dao.SubjectMapper;
import cn.xdl.ovls.course.entity.ResponseResult;
import cn.xdl.ovls.course.entity.Subject;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;
	
	@Override
	public ResponseResult loadAll() {
		List<Subject> list = subjectMapper.selectAll();
		ResponseResult result = new ResponseResult();
		if(list.isEmpty()){
			result.setStatus(2);
			result.setMsg("未找到数据");
		}else{
			result.setStatus(1);
			result.setMsg("查询成功");
			result.setData(list);
		}
		return result;
	}

	@Override
	public ResponseResult selectByDirectionId(Integer directionId) {
		List<Subject> list = subjectMapper.selectByDirectionId(directionId);
		ResponseResult result = new ResponseResult();
		if(list.isEmpty()){
			result.setStatus(2);
			result.setMsg("未找到数据");
		}else{
			result.setStatus(1);
			result.setMsg("查询成功");
			result.setData(list);
		}
		return result;
	}

}
