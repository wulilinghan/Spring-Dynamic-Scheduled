package top.b0x0.scheduled.enity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author ManJiis
 * @since 2021-07-23
 * @since JDK1.8
 */
@Data
@NoArgsConstructor
public class ToolJobReq {

    /**
     * cron表达式
     */
    private String cron;

    /**
     * job名称
     */
    private String jobName;
    private String jobBeanName;
    private String jobClassName;
    private String jobMethodName;
    private String jobMethodParams;

    /**
     * 状态（1正常 0暂停）
     */
    private Integer jobStatus;
    /**
     * 任务执行状态（ 0已停止 1执行中 ）
     */
    private Integer jobExecStatus;

    /**
     * 备注
     */
    private String remark;


    private String createBy;
    private String updateBy;


}