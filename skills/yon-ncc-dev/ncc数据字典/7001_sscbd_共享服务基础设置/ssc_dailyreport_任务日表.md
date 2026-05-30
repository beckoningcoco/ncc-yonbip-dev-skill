# |<<

**任务日表 (ssc_dailyreport / nc.vo.ssc.task.report.DailyReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5512.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailyreport | 实体标识 | pk_dailyreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_busiactivity | 业务活动 | pk_busiactivity | varchar(20) |  | 业务活动 (busiactivity) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_transactype | 交易类型 | pk_transactype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | taskdate | 日期 | taskdate | char(19) |  | 日期 (UFDate) |
| 8 | pk_post | 岗位 | pk_post | varchar(20) |  | 人力资源管理_岗位 (post) |
| 9 | pk_user | 人员 | pk_user | varchar(20) |  | 用户 (user) |
| 10 | taskcount | 完成任务数 | taskcount | int |  | 整数 (Integer) |
| 11 | usetime | 总用时 | usetime | int |  | 整数 (Integer) |
| 12 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 13 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 14 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 15 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 16 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 17 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 18 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 19 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 20 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 21 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |