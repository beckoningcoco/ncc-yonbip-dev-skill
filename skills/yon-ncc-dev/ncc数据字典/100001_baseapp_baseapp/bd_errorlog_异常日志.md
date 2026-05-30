# |<<

**异常日志 (bd_errorlog / nc.vo.bd.errorlog.ErrorLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/833.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_errorlog | 异常日志主键 | pk_errorlog | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | mdclassid | 元数据 | mdclassid | varchar(36) |  | 实体 (entity) |
| 4 | operator | 操作员 | operator | varchar(20) |  | 用户 (user) |
| 5 | operationtime | 操作时间 | operationtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | operationtype | 操作类型 | operationtype | varchar(50) |  | 字符串 (String) |