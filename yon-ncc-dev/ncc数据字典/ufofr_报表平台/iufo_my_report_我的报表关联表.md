# |<<

**我的报表关联表 (iufo_my_report / nc.vo.report.subscibe.MyReportVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3483.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_myreport | 我的报表PK | pk_myreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_subscibe_task | 订阅任务PK | pk_subscibe_task | varchar(20) |  | 字符串 (String) |
| 3 | pk_report | 报表对象PK | pk_report | varchar(20) |  | 字符串 (String) |
| 4 | pk_report_node | 报表节点PK | pk_report_node | varchar(20) |  | 字符串 (String) |
| 5 | promulgator | 发布人 | promulgator | varchar(20) |  | 用户 (user) |
| 6 | embracer | 接收人 | embracer | varchar(20) |  | 用户 (user) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |