# |<<

**辅助核算顺序 (bd_AuditAss / nc.vo.bd.audit.AuditassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/337.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_auditass | 辅助核算顺序主键 | pk_auditass | char(20) | √ | 主键 (UFID) |
| 2 | pk_bdinfo | 辅助核算项目 | pk_bdinfo | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 3 | pk_glorgbook | 账簿 | pk_glorgbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 4 | seq | 顺序 | seq | int |  | 整数 (Integer) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | creator | 用户 | creator | varchar(20) |  | 用户 (user) |