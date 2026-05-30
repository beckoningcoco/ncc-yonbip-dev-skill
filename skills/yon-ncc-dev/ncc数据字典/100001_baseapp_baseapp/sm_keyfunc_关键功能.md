# |<<

**关键功能 (sm_keyfunc / nc.vo.uap.rbac.keyfuncdata.KeyFuncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5311.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_keyfunc | 关键功能ID | pk_keyfunc | char(20) | √ | 主键 (UFID) |
| 2 | node | 节点 | node | varchar(20) | √ | 功能实体 (functionEntity) |
| 3 | button | 按钮 | button | varchar(20) | √ | 按钮注册实体 (butnreginfo) |
| 4 | authentype | 认证方式 | authentype | int | √ | 认证类型 (authentype_enum) |  | 0=同用户登录认证; |