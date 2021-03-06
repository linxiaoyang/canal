package com.alibaba.otter.canal.parse.index;

import com.alibaba.otter.canal.common.CanalLifeCycle;
import com.alibaba.otter.canal.parse.exception.CanalParseException;
import com.alibaba.otter.canal.protocol.position.LogPosition;

/**
 * Created by yinxiu on 17/3/17. Email: marklin.hz@gmail.com
 *
 * 日志的位置管理器。提供了读取和存储当前日志位置的接口
 */
public interface CanalLogPositionManager extends CanalLifeCycle {

    LogPosition getLatestIndexBy(String destination);

    void persistLogPosition(String destination, LogPosition logPosition) throws CanalParseException;

}
