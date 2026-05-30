# |<<

**职责 (sm_responsibility / nc.vo.uap.rbac.ResponsibilityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5338.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_responsibility | 主键 | pk_responsibility | char(20) | √ | 主键 (UFID) |
| 2 | name | 职责名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 职责编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | type | 职责类型 | type | int |  | 职责类型 (ResponsibilityType) |  | 0=业务类型; |