package cn.xdl.ovls.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.xdl.ovls.entity.QuestionWithBLOBs;

public class QuestionSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public String insertSelective(QuestionWithBLOBs record) {
        BEGIN();
        INSERT_INTO("question");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getAuthor() != null) {
            VALUES("author", "#{author,jdbcType=INTEGER}");
        }
        
        if (record.getAddDate() != null) {
            VALUES("add_date", "#{addDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDegree() != null) {
            VALUES("degree", "#{degree,jdbcType=INTEGER}");
        }
        
        if (record.getAnswer() != null) {
            VALUES("answer", "#{answer,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeId() != null) {
            VALUES("type_id", "#{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getKnowledgeId() != null) {
            VALUES("knowledge_id", "#{knowledgeId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            VALUES("subject_id", "#{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getChapterId() != null) {
            VALUES("chapter_id", "#{chapterId,jdbcType=INTEGER}");
        }
        
        if (record.getBody() != null) {
            VALUES("body", "#{body,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getAnalysis() != null) {
            VALUES("analysis", "#{analysis,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public String updateByPrimaryKeySelective(QuestionWithBLOBs record) {
        BEGIN();
        UPDATE("question");
        
        if (record.getAuthor() != null) {
            SET("author = #{author,jdbcType=INTEGER}");
        }
        
        if (record.getAddDate() != null) {
            SET("add_date = #{addDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDegree() != null) {
            SET("degree = #{degree,jdbcType=INTEGER}");
        }
        
        if (record.getAnswer() != null) {
            SET("answer = #{answer,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeId() != null) {
            SET("type_id = #{typeId,jdbcType=INTEGER}");
        }
        
        if (record.getKnowledgeId() != null) {
            SET("knowledge_id = #{knowledgeId,jdbcType=INTEGER}");
        }
        
        if (record.getSubjectId() != null) {
            SET("subject_id = #{subjectId,jdbcType=INTEGER}");
        }
        
        if (record.getChapterId() != null) {
            SET("chapter_id = #{chapterId,jdbcType=INTEGER}");
        }
        
        if (record.getBody() != null) {
            SET("body = #{body,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getAnalysis() != null) {
            SET("analysis = #{analysis,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}