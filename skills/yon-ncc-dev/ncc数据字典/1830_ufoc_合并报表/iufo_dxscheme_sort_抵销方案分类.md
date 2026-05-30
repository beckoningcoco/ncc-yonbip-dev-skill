# |<<

**抵销方案分类 (iufo_dxscheme_sort / nc.vo.hbbb.dxscheme.DXSchemeSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxschemesort | 抵销方案分类主键 | pk_dxschemesort | char(20) | √ | 主键 (UFID) |
| 2 | name | 抵消方案分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 4 | parent_id | 上级分类 | parent_id | varchar(20) |  | 抵销方案分类 (dxssort) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 8 | seq | 序号 | seq | varchar(50) |  | 字符串 (String) |
| 9 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 10 | sealflag | 封存标记 | sealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | usedflag | 启用标记 | usedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |