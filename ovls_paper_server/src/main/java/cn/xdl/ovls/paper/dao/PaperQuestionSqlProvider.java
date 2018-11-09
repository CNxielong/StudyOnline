package cn.xdl.ovls.paper.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.xdl.ovls.paper.entity.PaperQuestion;

public class PaperQuestionSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public String insertSelective(PaperQuestion record) {
        BEGIN();
        INSERT_INTO("paper_question");
        
        if (record.getPaperId() != null) {
            VALUES("paper_id", "#{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionId() != null) {
            VALUES("question_id", "#{questionId,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionScore() != null) {
            VALUES("question_score", "#{questionScore,jdbcType=INTEGER}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public String updateByPrimaryKeySelective(PaperQuestion record) {
        BEGIN();
        UPDATE("paper_question");
        
        if (record.getQuestionId() != null) {
            SET("question_id = #{questionId,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionScore() != null) {
            SET("question_score = #{questionScore,jdbcType=INTEGER}");
        }
        
        WHERE("paper_id = #{paperId,jdbcType=INTEGER}");
        
        return SQL();
    }
}