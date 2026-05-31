# |<<

**稽核单据表 (sscqm_check_bill / nccloud.vo.sscqm.qualityapi.vo.CheckBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5595.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | pk | id | char(20) | √ | 主键 (UFID) |
| 2 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 3 | amount | 金额 | amount | varchar(50) |  | 字符串 (String) |
| 4 | ssc_start_time | 共享审核开始时间 | ssc_start_time | char(19) |  | 日期 (UFDate) |
| 5 | ssc_end_time | 共享审核结束时间 | ssc_end_time | char(19) |  | 日期 (UFDate) |
| 6 | bill_date | 单据日期 | bill_date | char(19) |  | 日期 (UFDate) |
| 7 | bill_maker | 制单人 | bill_maker | varchar(20) |  | 用户 (user) |
| 8 | bill_type_code | 单据类型编码 | bill_type_code | varchar(50) |  | 字符串 (String) |
| 9 | bill_type_id | 单机类型参照 | bill_type_id | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | trade_type_code | 交易类型编码 | trade_type_code | varchar(50) |  | 字符串 (String) |
| 11 | trade_type_id | 交易类型参照 | trade_type_id | varchar(20) |  | 交易类型 (transtype) |
| 12 | pk_org | 业务单元id | pk_org | varchar(20) |  | 组织 (org) |
| 13 | pk_sscgroup | 共享中心作业组 | pk_sscgroup | varchar(20) |  | 共享作业组 (ssctp_workinggroup) |
| 14 | processor | 稽核人 | processor | varchar(20) |  | 用户 (user) |
| 15 | sampler | 抽取人 | sampler | varchar(20) |  | 用户 (user) |
| 16 | taskid | 任务id | taskid | varchar(50) |  | 字符串 (String) |
| 17 | taskname | 稽核任务 | taskname | varchar(200) |  | 字符串 (String) |
| 18 | check_status | 稽查状态 | check_status | varchar(50) |  | 字符串 (String) |
| 19 | rectify_status | 整改状态 | rectify_status | varchar(50) |  | 字符串 (String) |
| 20 | improve_desc | 整改说明 | improve_desc | varchar(500) |  | 字符串 (String) |
| 21 | problem_desc | 问题说明 | problem_desc | varchar(500) |  | 字符串 (String) |
| 22 | check_result | 稽查结果 | check_result | varchar(50) |  | 字符串 (String) |
| 23 | check_time | 稽查时间 | check_time | char(19) |  | 日期 (UFDate) |
| 24 | checkno | 稽核编号 | checkno | varchar(50) |  | 字符串 (String) |
| 25 | severity | 严重性 | severity | varchar(50) |  | 字符串 (String) |
| 26 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 字符串 (String) |
| 27 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 28 | pk_sscgroup2 | 复核所属作业组 | pk_sscgroup2 | varchar(20) |  | 共享作业组 (ssctp_workinggroup) |
| 29 | isautocheck | 是否自动审核 | isautocheck | char(1) |  | 布尔类型 (UFBoolean) |
| 30 | remarks | 备注 | remarks | varchar(100) |  | 字符串 (String) |
| 31 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |