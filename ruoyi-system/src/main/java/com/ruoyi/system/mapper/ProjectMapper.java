package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Project;

/**
 * projectMapper接口
 * 
 * @author ruoyi
 * @date 2020-11-06
 */
public interface ProjectMapper 
{
    /**
     * 查询project
     * 
     * @param id projectID
     * @return project
     */
    public Project selectProjectById(Long id);

    /**
     * 查询project列表
     * 
     * @param project project
     * @return project集合
     */
    public List<Project> selectProjectList(Project project);

    /**
     * 新增project
     * 
     * @param project project
     * @return 结果
     */
    public int insertProject(Project project);

    /**
     * 修改project
     * 
     * @param project project
     * @return 结果
     */
    public int updateProject(Project project);

    /**
     * 删除project
     * 
     * @param id projectID
     * @return 结果
     */
    public int deleteProjectById(Long id);

    /**
     * 批量删除project
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteProjectByIds(String[] ids);
}
