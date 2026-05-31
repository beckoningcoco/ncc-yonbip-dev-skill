# |<<

**工作人员变更 (ewm_perm_workeralter / nc.vo.ewm.permit.PermitWorkerAlterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1942.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm_workeralter | 工作人员变更主键 | pk_perm_workeralter | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 3 | old_worker | 原工作人员 | old_worker | varchar(200) |  | 字符串 (String) |
| 4 | new_worker | 变更工作人员 | new_worker | varchar(200) |  | 字符串 (String) |
| 5 | alter_time | 变动时间 | alter_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | linestatus | 行状态 | linestatus | int |  | 行状态 (LineStatusEnum) |  | 0=已确认; |