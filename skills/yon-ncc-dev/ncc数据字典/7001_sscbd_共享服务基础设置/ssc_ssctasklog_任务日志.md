# |<<

**任务日志 (ssc_ssctasklog / nc.vo.ssc.task.task.SSCTaskLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5525.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ssctasklog | 实体标识 | pk_ssctasklog | char(20) | √ | 主键 (UFID) |
| 2 | pk_ssctask | 主表标识 | pk_ssctask | varchar(20) |  | 任务 (ssctask) |
| 3 | pk_busiact | 业务活动 | pk_busiact | varchar(20) |  | 业务活动 (busiactivity) |
| 4 | pk_post | 岗位 | pk_post | varchar(20) |  | 人力资源管理_岗位 (post) |
| 5 | pk_operator | 处理人 | pk_operator | varchar(20) |  | 用户 (user) |
| 6 | appointtime | 派工时间 | appointtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_busiop | 业务操作 | pk_busiop | varchar(20) |  | 业务操作 (busioperation) |
| 8 | beginstate | 开始态 | beginstate | varchar(20) |  | 任务状态 (taskstate) |
| 9 | endstate | 完成态 | endstate | varchar(20) |  | 任务状态 (taskstate) |
| 10 | begintime | 开始时间 | begintime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | endtime | 完成时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | lasttime | 持续时间（ms） | lasttime | int |  | 整数 (Integer) |
| 13 | message | 备注消息 | message | varchar(400) |  | 字符串 (String) |
| 14 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |