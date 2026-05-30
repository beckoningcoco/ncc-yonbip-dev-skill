# |<<

**报表数据权限 (iufo_repdataauth / nc.vo.iufo.repdataauth.RepDataAuthRecordVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3494.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repdataauth | 主键 | pk_repdataauth | char(20) | √ | 主键 (UFID) |
| 2 | pk_role | 角色 | pk_role | varchar(20) |  | 角色 (Role) |
| 3 | auth_type | 权限类型 | auth_type | int |  | 报表数据权限类型 (报表数据权限类型) |  | 0=无; |