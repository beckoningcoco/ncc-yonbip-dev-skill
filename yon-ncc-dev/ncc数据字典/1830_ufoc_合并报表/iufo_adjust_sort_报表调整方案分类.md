# |<<

**报表调整方案分类 (iufo_adjust_sort / nc.vo.hbbb.adjustscheme.AdjustSchemeSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3388.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjust_sort | 分类主键 | pk_adjust_sort | char(20) | √ | 主键 (UFID) |
| 2 | name | 分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 4 | parent_id | 上级分类 | parent_id | varchar(20) |  | 报表调整方案分类 (adjschemesort) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 8 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |