# |<<

**常用摘要 (fipub_summary / nc.vo.fipub.summary.SummaryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_summary | 常用摘要主键 | pk_summary | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 常用摘要编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | summaryname | 常用摘要 | summaryname | varchar(250) |  | 字符串 (String) |
| 6 | ispublic | 是否公用 | ispublic | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_corp | 创建单位 | pk_corp | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |