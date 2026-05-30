# |<<

**查询条件 (pub_query_condition / nc.vo.pub.query.md.MDQueryConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4766.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 查询模板ID | id | char(20) | √ | 主键 (UFID) |
| 2 | value | 取值 | value | varchar(50) |  | 字符串 (String) |
| 3 | userdefflag | 自定义项标志 | userdefflag | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | resid | 资源ID | resid | varchar(30) |  | 字符串 (String) |
| 5 | iscondition | 是否查询条件 | iscondition | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | instrumentsql | 自定义查询语句 | instrumentsql | varchar(4000) |  | 字符串 (String) |
| 7 | prerestrict | 预置限制条件 | prerestrict | varchar(1024) |  | 字符串 (String) |
| 8 | guideline | 指标条件 | guideline | varchar(1024) |  | 字符串 (String) |
| 9 | ext1 | 自定义扩展1 | ext1 | varchar(50) |  | 字符串 (String) |
| 10 | ext2 | 自定义扩展2 | ext2 | varchar(50) |  | 字符串 (String) |
| 11 | ext3 | 自定义扩展3 | ext3 | varchar(50) |  | 字符串 (String) |
| 12 | ext4 | 自定义扩展4 | ext4 | varchar(50) |  | 字符串 (String) |
| 13 | ext5 | 自定义扩展5 | ext5 | varchar(50) |  | 字符串 (String) |