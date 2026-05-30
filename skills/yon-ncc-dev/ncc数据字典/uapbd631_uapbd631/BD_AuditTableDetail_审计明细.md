# |<<

**审计明细 (BD_AuditTableDetail / nc.vo.bd.audit.AuditTableDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/343.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_audittabledetail | pk_AuditTableDetail | pk_audittabledetail | char(20) | √ | 主键 (UFID) |
| 2 | outputcolcode | 目标审计输出字段编码 | outputcolcode | varchar(50) |  | 字符串 (String) |
| 3 | outputcolname | 目标审计输出字段名称 | outputcolname | varchar(50) |  | 字符串 (String) |
| 4 | sourcecolname | 来源字段名 | sourcecolname | varchar(50) |  | 字符串 (String) |
| 5 | path | 元数据路径 | path | varchar(50) |  | 字符串 (String) |