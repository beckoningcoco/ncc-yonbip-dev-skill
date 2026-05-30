# |<<

**自定义档案列表 (bd_defdoclist / nc.vo.bd.defdoc.DefdoclistVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_defdoclist | 自定义档案列表主键 | pk_defdoclist | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | docclass | 档案分类 | docclass | varchar(50) |  | 字符串 (String) |
| 5 | code | 自定义档案编码 | code | varchar(30) | √ | 字符串 (String) |
| 6 | name | 自定义档案名称 | name | varchar(70) | √ | 多语文本 (MultiLangText) |
| 7 | doctype | 档案类型 | doctype | smallint |  | 档案类型 (showtype) |  | 0=档案; |