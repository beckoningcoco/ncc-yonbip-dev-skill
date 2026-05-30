# |<<

**工作延期 (ewm_perm_delay / nc.vo.ewm.permit.PermitDelayBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1937.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm_delay | 工作延期主键 | pk_perm_delay | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 3 | delay_time | 延期至 | delay_time | char(19) |  | 日期时间 (UFDateTime) |
| 4 | linestatus | 行状态 | linestatus | int |  | 行状态 (LineStatusEnum) |  | 0=已确认; |