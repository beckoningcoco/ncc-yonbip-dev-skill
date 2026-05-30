# |<<

**用户定义属性组引用 (bd_userdefruleref / nc.vo.bd.userdefrule.UserdefrulerefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1153.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userdefruleref | 主键 | pk_userdefruleref | char(20) | √ | 主键 (UFID) |
| 2 | pk_userdefrule | 用户定义属性组 | pk_userdefrule | varchar(20) |  | 用户定义属性组 (userdefrule) |
| 3 | refclass | 引用用户定义属性组的实体 | refclass | varchar(36) |  | 实体 (entity) |
| 4 | checkclass | 用户定义属性组变更校验类名 | checkclass | varchar(200) |  | 字符串 (String) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |