# |<<

**报表收藏 (report_collection / nc.vo.smartba.reportcollection.ReportCollectionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4872.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_collection | 主键ID | pk_collection | char(20) | √ | 主键 (UFID) |
| 2 | userid | 收藏用户 | userid | varchar(20) |  | 用户 (user) |
| 3 | collectiontime | 收藏时间 | collectiontime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | pk_report | 报表对象 | pk_report | varchar(50) |  | 字符串 (String) |