package cn.xdl.ovls.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import cn.xdl.ovls.entity.Note;

public class NoteSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public String insertSelective(Note record) {
        BEGIN();
        INSERT_INTO("note");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPublishTime() != null) {
            VALUES("publish_time", "#{publishTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLikeCount() != null) {
            VALUES("like_count", "#{likeCount,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getVideoId() != null) {
            VALUES("video_id", "#{videoId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            VALUES("context", "#{context,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    public String updateByPrimaryKeySelective(Note record) {
        BEGIN();
        UPDATE("note");
        
        if (record.getPublishTime() != null) {
            SET("publish_time = #{publishTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getLikeCount() != null) {
            SET("like_count = #{likeCount,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getVideoId() != null) {
            SET("video_id = #{videoId,jdbcType=INTEGER}");
        }
        
        if (record.getTitle() != null) {
            SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContext() != null) {
            SET("context = #{context,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}