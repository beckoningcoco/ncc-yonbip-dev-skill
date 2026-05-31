# |<<

**最近使用 (report_recuse / nc.vo.report.recentuse.ReportRecUse)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4877.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recentuse | 主键 | pk_recentuse | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 报表对象 | pk_report | varchar(20) |  | 报表对象 (ReportObject) |
| 3 | usetime | 最近使用时间 | usetime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | userid | 用户主键 | userid | varchar(20) |  | 用户 (user) |