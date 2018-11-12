package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.PaperExamRecord;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface PaperExamRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_record
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Delete({
        "delete from paper_exam_record",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_record
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Insert({
        "insert into paper_exam_record (record_id, user_id, ",
        "paper_id, question_id, ",
        "answer, create_time)",
        "values (#{recordId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{paperId,jdbcType=INTEGER}, #{questionId,jdbcType=INTEGER}, ",
        "#{answer,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(PaperExamRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_record
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @InsertProvider(type=PaperExamRecordSqlProvider.class, method="insertSelective")
    int insertSelective(PaperExamRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_record
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Select({
        "select",
        "record_id, user_id, paper_id, question_id, answer, create_time",
        "from paper_exam_record",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="record_id", property="recordId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="paper_id", property="paperId", jdbcType=JdbcType.INTEGER),
        @Result(column="question_id", property="questionId", jdbcType=JdbcType.INTEGER),
        @Result(column="answer", property="answer", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PaperExamRecord selectByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_record
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @UpdateProvider(type=PaperExamRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PaperExamRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_exam_record
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Update({
        "update paper_exam_record",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "paper_id = #{paperId,jdbcType=INTEGER},",
          "question_id = #{questionId,jdbcType=INTEGER},",
          "answer = #{answer,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where record_id = #{recordId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PaperExamRecord record);
}