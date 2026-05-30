# |<<

**票据类型 (bd_notetype / nc.vo.bd.notetype.NotetypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/917.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notetype | 票据类型主键 | pk_notetype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 票据类型编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 票据类型名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | noteclass | 票据大类 | noteclass | smallint | √ | 票据大类 (noteclass) | 8 | 1=支票; |