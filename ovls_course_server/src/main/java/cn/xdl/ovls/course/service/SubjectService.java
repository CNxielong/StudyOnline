package cn.xdl.ovls.course.service;

import cn.xdl.ovls.course.entity.ResponseResult;

public interface SubjectService {
	ResponseResult loadAll();
	ResponseResult selectByDirectionId(Integer directionId);
}
