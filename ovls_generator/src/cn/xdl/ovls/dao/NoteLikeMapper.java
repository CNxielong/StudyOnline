package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.NoteLike;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface NoteLikeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_like
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Delete({
        "delete from note_like",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_like
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Insert({
        "insert into note_like (Id, user_id, ",
        "note_id, like_time)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{noteId,jdbcType=INTEGER}, #{likeTime,jdbcType=TIMESTAMP})"
    })
    int insert(NoteLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_like
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @InsertProvider(type=NoteLikeSqlProvider.class, method="insertSelective")
    int insertSelective(NoteLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_like
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Select({
        "select",
        "Id, user_id, note_id, like_time",
        "from note_like",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="note_id", property="noteId", jdbcType=JdbcType.INTEGER),
        @Result(column="like_time", property="likeTime", jdbcType=JdbcType.TIMESTAMP)
    })
    NoteLike selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_like
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @UpdateProvider(type=NoteLikeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(NoteLike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_like
     *
     * @mbggenerated Sat Nov 03 01:12:24 CST 2018
     */
    @Update({
        "update note_like",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "note_id = #{noteId,jdbcType=INTEGER},",
          "like_time = #{likeTime,jdbcType=TIMESTAMP}",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(NoteLike record);
}