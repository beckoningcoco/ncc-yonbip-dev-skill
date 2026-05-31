# |<<

**任务月表 (ssc_monthreport / nc.vo.ssc.task.report.MonthReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5521.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_monthreport | 实体标识 | pk_monthreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_busiactivity | 业务活动 | pk_busiactivity | varchar(20) |  | 业务活动 (busiactivity) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_transactype | 交易类型 | pk_transactype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | taskmonth | 月份 | taskmonth | varchar(50) |  | 字符串 (String) |
| 8 | pk_post | 岗位 | pk_post | varchar(20) |  | 人力资源管理_岗位 (post) |
| 9 | pk_user | 人员 | pk_user | varchar(20) |  | 用户 (user) |
| 10 | taskcount | 完成任务数 | taskcount | int |  | 整数 (Integer) |
| 11 | usetime | 总用时 | usetime | int |  | 整数 (Integer) |