# |<<

**分布式历史任务子实体 (ffw_distributesubtaskhist / nc.vo.ffw.history.DistributeSubtaskHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2190.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributesubtaskhist | 主键 | pk_distributesubtaskhist | char(20) | √ | 主键 (UFID) |
| 2 | variableobj | 参数对象 | variableobj | image |  | BLOB (BLOB) |
| 3 | taskstatus | 任务状态 | taskstatus | int |  | 任务状态 (taskstatus) |  | 1=待执行; |