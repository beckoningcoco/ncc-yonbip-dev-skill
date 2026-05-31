# |<<

**会计期间方案映射 (bd_periodmapping / nc.vo.bd.periodmapping.PeriodmappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/923.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_peiodmapping | 主键 | pk_peiodmapping | char(20) | √ | 主键 (UFID) |
| 2 | sourceperiod | 来源会计期间方案 | sourceperiod | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 3 | targetperiod | 目标会计期间方案 | targetperiod | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | code | 映射编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | targetperiodyear | 会计年度 | targetperiodyear | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |