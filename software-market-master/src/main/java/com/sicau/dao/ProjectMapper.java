package com.sicau.dao;

import com.sicau.entity.dto.Project;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface ProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    int deleteByPrimaryKey(String projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    int insert(Project record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    Project selectByPrimaryKey(String projectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    List<Project> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Fri Feb 01 16:05:07 CST 2019
     */
    int updateByPrimaryKey(Project record);

    /**
     * 根据项目id去project表获取项目
     */
    Project selectProjectById(@Param("projectId") String projectId);

    boolean updateStateById(@Param("projectId") String projectId,@Param("state") String state,@Param("data") String data);

    /**
     * @Description:项目根据状态分类
     * @param state 支持可变长参数state查询
     * @return com.sicau.entity.pojo.vo.ResultVO 列表
     **/
    List<Project> projectsClassifyByState(@Param("state") String... state);

    String selectProjectByUserId(@Param("teamId") String teamId);
}