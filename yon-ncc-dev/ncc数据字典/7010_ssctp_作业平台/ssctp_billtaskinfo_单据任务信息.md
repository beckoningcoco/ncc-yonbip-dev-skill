# |<<

**单据任务信息 (ssctp_billtaskinfo / nc.vo.ssctp.ssccheck.report.BillTaskInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtaskinfo | 主键 | pk_billtaskinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | billno | 单据编码 | billno | varchar(50) |  | 字符串 (String) |
| 4 | billid | 单据主键 | billid | varchar(50) |  | 字符串 (String) |
| 5 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 交易类型 (transtype) |
| 6 | billdate | 单据日期 | billdate | varchar(50) |  | 字符串 (String) |
| 7 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | billmaker | 报账人 | billmaker | varchar(20) |  | 用户 (user) |
| 9 | ssc_start_time | 共享入池时间 | ssc_start_time | char(19) |  | 日期时间 (UFDateTime) |
| 10 | ssc_end_time | 共享完成时间 | ssc_end_time | char(19) |  | 日期时间 (UFDateTime) |
| 11 | shr | 共享审核人 | shr | varchar(20) |  | 用户 (user) |
| 12 | fhr | 共享复核人 | fhr | varchar(20) |  | 用户 (user) |
| 13 | autoapprove | 自动审核 | autoapprove | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_bill | 报账单主键 | pk_bill | varchar(50) |  | 字符串 (String) |
| 15 | pk_currenttask | 任务主键 | pk_currenttask | varchar(50) |  | 字符串 (String) |
| 16 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 17 | tradetypecode | 交易类型编码 | tradetypecode | varchar(50) |  | 字符串 (String) |
| 18 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |