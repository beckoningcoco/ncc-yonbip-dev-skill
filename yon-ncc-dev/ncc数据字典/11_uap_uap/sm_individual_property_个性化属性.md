# |<<

**个性化属性 (sm_individual_property / nc.individuation.vo.IndividualPropertyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5307.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_property | 主键 | pk_property | char(20) | √ | 主键 (UFID) |
| 2 | propertyname | 属性名称 | propertyname | varchar(100) |  | 字符串 (String) |
| 3 | value | 属性值 | value | varchar(2000) |  | 字符串 (String) |
| 4 | type | 属性值类型 | type | varchar(50) |  | 字符串 (String) |
| 5 | pageid | 个性化页面标识 | pageid | varchar(100) |  | 字符串 (String) |
| 6 | pk_group | 登录集体 | pk_group | varchar(20) |  | 主键 (UFID) |
| 7 | pk_user | 用户 | pk_user | varchar(20) |  | 主键 (UFID) |
| 8 | seq | 数组序号 | seq | varchar(20) |  | 字符串 (String) |