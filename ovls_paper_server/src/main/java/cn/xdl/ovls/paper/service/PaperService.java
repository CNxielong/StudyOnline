package cn.xdl.ovls.paper.service;

import cn.xdl.ovls.paper.util.ResponseResult;

public interface PaperService {
	ResponseResult selectPaperBySubjectId(Integer subjectId);
}
