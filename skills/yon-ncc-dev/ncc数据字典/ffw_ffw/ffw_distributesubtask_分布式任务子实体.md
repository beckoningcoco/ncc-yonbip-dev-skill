# |<<

**分布式任务子实体 (ffw_distributesubtask / nc.vo.ffw.distributetask.DistributeSubtaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2188.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distributesubtask | 主键 | pk_distributesubtask | char(20) | √ | 主键 (UFID) |
| 2 | variableobj | 参数对象 | variableobj | image |  | BLOB (BLOB) |
| 3 | taskstatus | 任务状态 | taskstatus | int |  | 任务状态 (taskstatus) |  | 1=待执行; |