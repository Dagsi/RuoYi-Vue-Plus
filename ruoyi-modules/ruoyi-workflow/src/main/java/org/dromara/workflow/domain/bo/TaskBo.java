package org.dromara.workflow.domain.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dromara.workflow.common.PageEntity;

import java.io.Serial;
import java.io.Serializable;

/**
 * 任务请求对象
 *
 * @author may
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TaskBo extends PageEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 任务名称
     */
    private String name;
}