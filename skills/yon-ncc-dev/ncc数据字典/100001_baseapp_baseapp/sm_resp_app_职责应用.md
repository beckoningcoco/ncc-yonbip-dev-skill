# |<<

**职责应用 (sm_resp_app / nc.vo.uap.rbac.RespAppVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5336.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resp_app | 主键 | pk_resp_app | char(20) | √ | 主键 (UFID) |
| 2 | pk_app | 小应用/小组件 | pk_app | varchar(50) |  | 字符串 (String) |
| 3 | pk_responsibility | 职责 | pk_responsibility | varchar(50) |  | 字符串 (String) |
| 4 | type | 业务功能类型 | type | int |  | 功能类型 (respappenum) |  | 0=应用; |