# |<<

**审计表 (BD_AuditTable / nc.vo.bd.audit.AuditTableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/342.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_audittable | pk_audittable | pk_audittable | char(20) | √ | 主键 (UFID) |
| 2 | desttablecode | 目标审计表编码 | desttablecode | varchar(50) |  | 字符串 (String) |
| 3 | desttablename | 目标审计表名称 | desttablename | varchar(50) |  | 字符串 (String) |
| 4 | implclassname | 获取数据接口实现类 | implclassname | varchar(50) |  | 字符串 (String) |
| 5 | sourcevofullname | 来源VO全名 | sourcevofullname | varchar(50) |  | 字符串 (String) |