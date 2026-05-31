# |<<

**统计条件分类 (iufo_hr_scsort / nc.vo.iufo.hr.hrstatcond.HRStatCondSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sort | 主键 | pk_sort | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | note | 描述 | note | varchar(200) |  | 备注 (Memo) |
| 4 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 统计条件分类 (hrstatcondsort) |
| 5 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 6 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |