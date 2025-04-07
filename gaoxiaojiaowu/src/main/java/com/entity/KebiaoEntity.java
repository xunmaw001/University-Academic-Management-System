package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 课表
 *
 * @author 
 * @email
 */
@TableName("kebiao")
public class KebiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KebiaoEntity() {

	}

	public KebiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "kebiao_name")

    private String kebiaoName;


    /**
     * 班级
     */
    @TableField(value = "banji_types")

    private Integer banjiTypes;


    /**
     * 课表上传
     */
    @TableField(value = "kebiao_photo")

    private String kebiaoPhoto;


    /**
     * 课程详情
     */
    @TableField(value = "kebiao_content")

    private String kebiaoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getKebiaoName() {
        return kebiaoName;
    }


    /**
	 * 获取：标题
	 */

    public void setKebiaoName(String kebiaoName) {
        this.kebiaoName = kebiaoName;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：课表上传
	 */
    public String getKebiaoPhoto() {
        return kebiaoPhoto;
    }


    /**
	 * 获取：课表上传
	 */

    public void setKebiaoPhoto(String kebiaoPhoto) {
        this.kebiaoPhoto = kebiaoPhoto;
    }
    /**
	 * 设置：课程详情
	 */
    public String getKebiaoContent() {
        return kebiaoContent;
    }


    /**
	 * 获取：课程详情
	 */

    public void setKebiaoContent(String kebiaoContent) {
        this.kebiaoContent = kebiaoContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kebiao{" +
            "id=" + id +
            ", kebiaoName=" + kebiaoName +
            ", banjiTypes=" + banjiTypes +
            ", kebiaoPhoto=" + kebiaoPhoto +
            ", kebiaoContent=" + kebiaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
