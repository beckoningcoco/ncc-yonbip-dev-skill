# |<<

**任务执行方列表 (adp_taskexeclist / nc.vo.uap.distribution.schedtranstask.TaskExecutorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/31.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | executorid | 编号 | executorid | char(20) | √ | 主键 (UFID) |
| 2 | execsysid | 执行系统 | execsysid | varchar(20) |  | 分布系统目录 (syscatalog) |
| 3 | sendstatus | 下发状态 | sendstatus | int |  | 下发状态 (TaskSendStatus) |  | 1=未下发; |