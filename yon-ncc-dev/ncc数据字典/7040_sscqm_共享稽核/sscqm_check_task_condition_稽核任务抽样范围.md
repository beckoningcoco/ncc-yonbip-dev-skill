# |<<

**稽核任务抽样范围 (sscqm_check_task_condition / nccloud.vo.sscqm.qualityapi.vo.BillConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5602.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | conditionid | 主键 | conditionid | char(20) | √ | 主键 (UFID) |
| 2 | taskid | 任务ID | taskid | varchar(50) |  | 字符串 (String) |
| 3 | total | 单据总量 | total | int |  | 整数 (Integer) |
| 4 | sample_rate | 抽样比例 | sample_rate | varchar(50) |  | 字符串 (String) |
| 5 | start_bill_date | 单据起始日期 | start_bill_date | char(19) |  | 日期 (UFDate) |
| 6 | end_bill_date | 单据结束日期 | end_bill_date | char(19) |  | 日期 (UFDate) |
| 7 | start_amount | 最小金额 | start_amount | varchar(50) |  | 字符串 (String) |
| 8 | end_amount | 最大金额 | end_amount | varchar(50) |  | 字符串 (String) |
| 9 | workinggroup | 工作组 | workinggroup | varchar(3000) |  | 共享作业组 (ssctp_workinggroup) |
| 10 | orgs | 财务组织 | orgs | varchar(3000) |  | 组织 (org) |
| 11 | orgs_name | 财务组织名称 | orgs_name | varchar(50) |  | 字符串 (String) |
| 12 | bill_type | 单据类型 | bill_type | varchar(3000) |  | 单据类型 (BilltypeVO) |
| 13 | bill_type_code | 单据类型编码 | bill_type_code | varchar(3000) |  | 字符串 (String) |
| 14 | trade_type | 交易类型 | trade_type | varchar(3000) |  | 交易类型 (transtype) |
| 15 | trade_type_code | 交易类型编码 | trade_type_code | varchar(3000) |  | 字符串 (String) |
| 16 | autocheckrate | 自动审核比例 | autocheckrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | tasktype | 共享任务类型 | tasktype | varchar(20) |  | 任务类型 (tasktype) |