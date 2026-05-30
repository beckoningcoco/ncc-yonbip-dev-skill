# |<<

**许可历史 (ewm_perm_history / nc.vo.ewm.permit.PermitHistoryBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1939.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm_history | 许可历史主键 | pk_perm_history | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 3 | pk_permitstatus_old | 原许可状态 | pk_permitstatus_old | varchar(20) |  | 许可状态 (permitstatus) |
| 4 | pk_permitstatus_new | 许可状态 | pk_permitstatus_new | varchar(20) |  | 许可状态 (permitstatus) |
| 5 | alter_time | 变更时间 | alter_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | pk_operator | 操作人 | pk_operator | varchar(20) |  | 用户 (user) |
| 7 | operation | 操作 | operation | int |  | 操作类型 (PermOperationEnum) |  | 0=制单; |