# |<<

**基本档案变动注册表 (sm_bdchange_reg / nc.vo.uap.rbac.bdchange.BDChangeRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdchange | 主键 | pk_bdchange | char(20) | √ | 主键 (UFID) |
| 2 | mdid | 元数据ID | mdid | varchar(36) |  | 实体 (entity) |
| 3 | resourcecode | 资源编码 | resourcecode | varchar(50) |  | 字符串 (String) |
| 4 | dataid | 档案ID | dataid | char(20) | √ | 字符串 (String) |
| 5 | changetype | 变动类型 | changetype | int |  | 基本档案变动类型 (enum) |  | 0=增加; |