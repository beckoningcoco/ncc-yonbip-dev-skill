# |<<

**费用类型 (er_expensetype / nc.vo.er.expensetype.ExpenseTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1896.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expensetype | 费用类型标识 | pk_expensetype | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(20) |  | 字符串 (String) |
| 4 | inuse | 封存 | inuse | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |