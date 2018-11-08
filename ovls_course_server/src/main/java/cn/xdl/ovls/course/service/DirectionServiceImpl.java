package cn.xdl.ovls.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xdl.ovls.course.dao.DirectionMapper;
import cn.xdl.ovls.course.entity.Direction;
import cn.xdl.ovls.course.entity.ResponseResult;

@Service
public class DirectionServiceImpl implements DirectionService {

	@Autowired
	private DirectionMapper directionMapper;
	
	@Override
	public ResponseResult loadAll() {
		List<Direction> list = directionMapper.selectAll();
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
