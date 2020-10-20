package com.chhtf.cmp.bam_basemanagement.service;


import java.util.List;

import com.chhtf.cmp.bam_basemanagement.vo.VideoInfoExtends;
import com.chhtf.cmp.pojo.VideoInfo;

public interface VideoInfoService {
	List<VideoInfo> list();
	void add(VideoInfo record);
	void update(VideoInfo record);
	void delete(int id);
	VideoInfo get(int id);
	
	List<VideoInfo> findListByCondition(VideoInfo condition);
	
	VideoInfoExtends packExtendsFrom(VideoInfo record);
	List<VideoInfoExtends> packExtendsListFrom(List<VideoInfo> list);
}
