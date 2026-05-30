# |<<

**业务功能项 (uap_busifuncitem / nc.vo.uap.rbac.BusiFuncItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busifunc | 业务功能项PK | pk_busifunc | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | busi_pk | 业务编码 | busi_pk | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | parentid | 上级PK | parentid | varchar(50) |  | 字符串 (String) |
| 6 | type | 对应职责类型 | type | int |  | 职责类型 (ResponsibilityType) |  | 0=业务类型; |