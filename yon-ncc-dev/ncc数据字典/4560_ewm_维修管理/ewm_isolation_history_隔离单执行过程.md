# |<<

**隔离单执行过程 (ewm_isolation_history / nc.vo.ewm.isolation.IsolationHisBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1927.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_iso_history | 隔离单执行过程主键 | pk_iso_history | char(20) | √ | 主键 (UFID) |
| 2 | operate_time | 执行时间 | operate_time | char(19) |  | 日期时间 (UFDateTime) |
| 3 | operator | 执行人 | operator | varchar(20) |  | 用户 (user) |
| 4 | operate_status | 执行状态 | operate_status | int |  | 执行状态 (enum) |  | 0=自由态; |