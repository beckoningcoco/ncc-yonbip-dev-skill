# |<<

**人员卡片取数条件 (hr_rpt_filter / nc.vo.hi.repdef.RptFilterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2696.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_filter | 主键 | pk_rpt_filter | char(20) | √ | 主键 (UFID) |
| 2 | filtercode | 编码 | filtercode | varchar(20) | √ | 字符串 (String) |
| 3 | filtername | 名称 | filtername | varchar(50) | √ | 字符串 (String) |
| 4 | pk_infoset | 对应子集 | pk_infoset | varchar(20) | √ | 信息集 (InfoSet) |
| 5 | meta_data_id | 元数据ID | meta_data_id | varchar(128) |  | 字符串 (String) |
| 6 | filter_str | 过滤条件 | filter_str | varchar(4000) | √ | 备注 (Memo) |
| 7 | filter_sql | 过滤条件sql | filter_sql | varchar(4000) |  | 字符串 (String) |
| 8 | pk_rpt_def | 模板主键 | pk_rpt_def | varchar(50) |  | 字符串 (String) |
| 9 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |