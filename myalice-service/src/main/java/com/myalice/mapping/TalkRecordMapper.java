package com.myalice.mapping;

import com.myalice.domain.TalkRecord;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TalkRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_record
     *
     * @mbg.generated
     */
    @Delete({
        "delete from talk_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_record
     *
     * @mbg.generated
     */
    @Insert({
        "insert into talk_record (id, content, ",
        "user_id, user_type, create_time, ",
        "connection_id, reply,replyType)",
        "values (#{id,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=VARCHAR}, #{userType,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{connectionId,jdbcType=VARCHAR}, #{reply,jdbcType=VARCHAR},#{replyType,jdbcType=INTEGER})"
    })
    int insert(TalkRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_record
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, content, user_id, user_type, create_time, connection_id, reply",
        "from talk_record",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="connection_id", property="connectionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="reply", property="reply", jdbcType=JdbcType.VARCHAR)
    })
    TalkRecord selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_record
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, content, user_id, user_type, create_time, connection_id, reply",
        "from talk_record"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.CHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="connection_id", property="connectionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="reply", property="reply", jdbcType=JdbcType.VARCHAR)
    })
    List<TalkRecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table talk_record
     *
     * @mbg.generated
     */
    @Update({
        "update talk_record",
        "set content = #{content,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=VARCHAR},",
          "user_type = #{userType,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "connection_id = #{connectionId,jdbcType=VARCHAR},",
          "reply = #{reply,jdbcType=VARCHAR},", 
          "replyType = #{replyType,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TalkRecord record);
}