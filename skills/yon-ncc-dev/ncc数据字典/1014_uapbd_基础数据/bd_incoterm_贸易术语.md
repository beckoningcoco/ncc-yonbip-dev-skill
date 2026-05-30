# |<<

**贸易术语 (bd_incoterm / nc.vo.bd.incoterm.IncotermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/864.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incoterm | 贸易术语主键 | pk_incoterm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | code | 代码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 贸易术语 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | factoryship | 工厂发货类标记 | factoryship | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |