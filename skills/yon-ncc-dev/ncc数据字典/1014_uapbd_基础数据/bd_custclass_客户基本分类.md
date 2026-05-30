# |<<

**客户基本分类 (bd_custclass / nc.vo.bd.cust.custclass.CustClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/437.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custclass | 客户基本分类主键 | pk_custclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 客户基本分类编码 | code | varchar(40) |  | 字符串 (String) |
| 5 | name | 客户基本分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | parent_id | 上级客户基本分类 | parent_id | varchar(20) |  | 客户基本分类 (custclass) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) | 2 | 1=未启用; |