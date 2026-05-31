# |<<

**统计条件 (iufo_hr_statcond / nc.vo.iufo.hr.hrstatcond.HRStatCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3461.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_statcond | 统计条件主键 | pk_statcond | char(20) | √ | 主键 (UFID) |
| 2 | pk_sort | 所属分类 | pk_sort | varchar(20) |  | 统计条件分类 (hrstatcondsort) |
| 3 | pk_report | 报表级统计条件所属报表 | pk_report | varchar(50) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | expression | 表达式 | expression | varchar(100) |  | 字符串 (String) |
| 7 | note | 统计详情 | note | image |  | BLOB (BLOB) |
| 8 | condtype | 条件类型 | condtype | varchar(1) |  | 字符串 (String) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |