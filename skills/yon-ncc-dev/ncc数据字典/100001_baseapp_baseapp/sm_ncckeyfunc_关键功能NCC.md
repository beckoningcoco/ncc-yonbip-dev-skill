# |<<

**关键功能NCC (sm_ncckeyfunc / nc.vo.uap.rbac.keyfuncdata.NCCKeyFuncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5325.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ncckeyfunc | 关键功能ID | pk_ncckeyfunc | char(20) | √ | 主键 (UFID) |
| 2 | appcode | 应用 | appcode | varchar(20) | √ | 应用注册 (appregister) |
| 3 | appbutton | 按钮 | appbutton | varchar(20) | √ | 页面按钮注册实体 (appbutton) |
| 4 | authentype | 认证方式 | authentype | int | √ | 认证类型 (authentype_enum) |  | 0=同用户登录认证; |