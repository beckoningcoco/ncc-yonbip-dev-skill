# |<<

**批量规则 (iufo_batchrule / nc.vo.iufo.batchrule.BatchRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3398.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchrule | 批量规则主键 | pk_batchrule | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | rulecontent | 规则内容 | rulecontent | image |  | BLOB (BLOB) |
| 4 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 5 | pk_batchrulesort | 所在目录 | pk_batchrulesort | varchar(20) |  | 批量规则目录 (batchrulesort) |
| 6 | pk_accscheme | 会计期间方案 | pk_accscheme | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 7 | note | 说明 | note | varchar(128) |  | 字符串 (String) |
| 8 | pk_datasource | 数据源 | pk_datasource | varchar(20) |  | 数据源 (datasource) |
| 9 | pk_org | 报表组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |