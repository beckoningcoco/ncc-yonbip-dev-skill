# |<<

**审计模块 (BD_auditModule / nc.vo.bd.audit.AuditModuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_auditmodule | pk_auditmodule | pk_auditmodule | char(20) | √ | 主键 (UFID) |
| 2 | modulecode | 模块编码 | modulecode | varchar(50) |  | 字符串 (String) |
| 3 | modulename | 模块名称 | modulename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | dlgclassname | 过滤展现实现类 | dlgclassname | varchar(50) |  | 字符串 (String) |
| 5 | isdisplay | 是否展现 | isdisplay | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | module | 所属模块 | module | varchar(50) |  | 字符串 (String) |