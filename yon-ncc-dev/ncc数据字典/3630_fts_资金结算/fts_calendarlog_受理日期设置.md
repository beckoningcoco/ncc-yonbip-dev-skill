# |<<

**受理日期设置 (fts_calendarlog / nc.vo.fts.workdate.CalendarlogSuperVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_calendar | 受理日期设置标识 | pk_calendar | char(20) | √ | 主键 (UFID) |
| 2 | closer | 日结人 | closer | varchar(20) |  | 用户 (user) |
| 3 | closetime | 日结时间 | closetime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | downer | 结束受理人 | downer | varchar(20) |  | 用户 (user) |
| 5 | downtime | 结束受理时间 | downtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | starter | 开始受理人 | starter | varchar(20) |  | 用户 (user) |
| 8 | starttime | 开始受理时间 | starttime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | workdate | 工作日 | workdate | char(19) |  | 日期 (UFDate) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 12 | orgworkdate | 组织工作日 | orgworkdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |