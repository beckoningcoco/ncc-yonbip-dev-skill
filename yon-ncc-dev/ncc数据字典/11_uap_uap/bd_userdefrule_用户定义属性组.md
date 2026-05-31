# |<<

**用户定义属性组 (bd_userdefrule / nc.vo.bd.userdefrule.UserdefruleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1152.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userdefrule | 主键 | pk_userdefrule | char(20) | √ | 主键 (UFID) |
| 2 | code | 组编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 组名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | itemcount | 用户定义属性数量 | itemcount | int | √ | 整数 (Integer) |
| 5 | parent_id | 上级 | parent_id | varchar(20) |  | 用户定义属性组 (userdefrule) |
| 6 | showorder | 显示顺序 | showorder | int |  | 整数 (Integer) |
| 7 | ruletype | 组类型 | ruletype | int |  | 规则类型 (userdefruletype) |  | 0=规则; |