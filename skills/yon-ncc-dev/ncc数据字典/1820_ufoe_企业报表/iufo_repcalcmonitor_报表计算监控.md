# |<<

**报表计算监控 (iufo_repcalcmonitor / nc.vo.ufoe.monitor.IUFOCalcMonitorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3491.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repcalcmonitor | pk_repcalcmonitor | pk_repcalcmonitor | char(20) | √ | 主键 (UFID) |
| 2 | pk_distributetask | pk_distributetask | pk_distributetask | char(20) | √ | 字符串 (String) |
| 3 | pk_distributesubtask | pk_distributesubtask | pk_distributesubtask | char(20) | √ | 字符串 (String) |
| 4 | taskname | 任务名称 | taskname | varchar(200) | √ | 字符串 (String) |
| 5 | tasktype | 任务类型 | tasktype | int |  | 任务类型 (runcalcTypeEnum) |  | 1=单表计算; |