package com.hujiang.project.zhgd.hjFileSize.service;

import com.hujiang.project.zhgd.hjFileSize.domain.HjFileSize;
import java.util.List;

/**
 * 项目存储空间大小 服务层
 * 
 * @author hujiang
 * @date 2019-06-28
 */
public interface IHjFileSizeService 
{
	/**
     * 查询项目存储空间大小信息
     * 
     * @param projectId 项目存储空间大小ID
     * @return 项目存储空间大小信息
     */
	public HjFileSize selectHjFileSizeById(Integer projectId);
	
	/**
     * 查询项目存储空间大小列表
     * 
     * @param hjFileSize 项目存储空间大小信息
     * @return 项目存储空间大小集合
     */
	public List<HjFileSize> selectHjFileSizeList(HjFileSize hjFileSize);
	
	/**
     * 新增项目存储空间大小
     * 
     * @param hjFileSize 项目存储空间大小信息
     * @return 结果
     */
	public int insertHjFileSize(HjFileSize hjFileSize);
	
	/**
     * 修改项目存储空间大小
     * 
     * @param hjFileSize 项目存储空间大小信息
     * @return 结果
     */
	public int updateHjFileSize(HjFileSize hjFileSize);
		
	/**
     * 删除项目存储空间大小信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteHjFileSizeByIds(String ids);
	
}
