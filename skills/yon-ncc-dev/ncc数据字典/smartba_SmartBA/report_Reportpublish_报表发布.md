# |<<

**报表发布 (report_Reportpublish / nc.vo.report.reportpublish.ReportPublishVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4882.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportpublish | 主键 | pk_reportpublish | char(20) | √ | 主键 (UFID) |
| 2 | userid | 发布者 | userid | varchar(20) | √ | 用户 (user) |
| 3 | pk_org | 发布者组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_report | 待发布的账表 | pk_report | varchar(20) | √ | 报表对象 (ReportObject) |
| 5 | pk_destrole | 发布到角色 | pk_destrole | varchar(20) | √ | 角色 (Role) |
| 6 | pk_destorg | 发布到组织 | pk_destorg | varchar(20) | √ | 组织 (org) |
| 7 | publishtime | 发布时间 | publishtime | char(19) | √ | 日期时间 (UFDateTime) |
| 8 | markstatus | 收藏状态 | markstatus | varchar(50) | √ | 收藏状态 (MarkStatus) |  | 1=未收藏; |