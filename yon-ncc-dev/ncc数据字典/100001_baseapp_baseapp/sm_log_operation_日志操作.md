# |<<

**日志操作 (sm_log_operation / nc.bs.sm.logoperation.vo.LogOperationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5317.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operation | 操作主键 | pk_operation | char(20) | √ | 主键 (UFID) |
| 2 | pk_metadata | 元数据主键 | pk_metadata | varchar(36) |  | 实体 (entity) |
| 3 | code | 操作编码 | code | varchar(10) |  | 字符串 (String) |
| 4 | operationname | 操作名称 | operationname | varchar(50) |  | 字符串 (String) |