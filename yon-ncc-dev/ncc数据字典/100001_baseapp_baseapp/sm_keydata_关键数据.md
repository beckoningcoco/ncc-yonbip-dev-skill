# |<<

**关键数据 (sm_keydata / nc.vo.uap.rbac.keyfuncdata.KeyDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5310.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_keydata | 关键数据ID | pk_keydata | char(20) | √ | 主键 (UFID) |
| 2 | pk_res | 资源实体 | pk_res | varchar(20) | √ | 权限资源 (PermissionResource) |
| 3 | pk_operation | 操作 | pk_operation | varchar(50) | √ | 字符串 (String) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_rule | 规则 | pk_rule | varchar(20) |  | 权限规则 (PermissionRule) |
| 6 | authentype | 认证方式 | authentype | int | √ | 认证类型 (authentype_enum) |  | 0=同用户登录认证; |