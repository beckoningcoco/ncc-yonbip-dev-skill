# |<<

**职责功能 (sm_resp_func / nc.vo.uap.rbac.RespFuncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5337.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resp_func | 主键 | pk_resp_func | char(20) | √ | 主键 (UFID) |
| 2 | pk_responsibility | 职责 | pk_responsibility | varchar(20) |  | 职责 (Responsibility) |
| 3 | busi_pk | 业务标识 | busi_pk | varchar(50) |  | 字符串 (String) |
| 4 | type | 业务功能类型 | type | int |  | 功能类型 (respfuncenum) |  | 0=功能节点; |