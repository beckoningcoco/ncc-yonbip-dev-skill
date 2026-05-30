# |<<

**客户销售分类 (bd_custsaleclass / nc.vo.bd.cust.custsaleclass.CustSaleClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custsaleclass | 客户销售分类主键 | pk_custsaleclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 销售分类编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 销售分类名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | ename | 客户销售分类英文名称 | ename | varchar(200) |  | 字符串 (String) |
| 7 | pk_father | 上级销售分类 | pk_father | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | innercode | 内部码 | innercode | varchar(60) |  | 字符串 (String) |
| 10 | seq | seq | seq | varchar(20) |  | 字符串 (String) |
| 11 | dataoriginflag | 分布式字段 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |