# |<<

**稽核任务分层规则 (sscqm_check_task_condition_sub / nccloud.vo.sscqm.qualityapi.vo.BillSubConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5603.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | subid | 分层规则主键 | subid | char(20) | √ | 主键 (UFID) |
| 2 | bill_type | 单据类型 | bill_type | varchar(3000) |  | 单据类型 (BilltypeVO) |
| 3 | bill_type_code | 单据类型编码 | bill_type_code | varchar(3000) |  | 字符串 (String) |
| 4 | conditionid | 抽取范围主键 | conditionid | varchar(50) |  | 字符串 (String) |
| 5 | end_amount | 最大金额 | end_amount | varchar(50) |  | 字符串 (String) |
| 6 | end_bill_date | 结束日期 | end_bill_date | char(19) |  | 日期 (UFDate) |
| 7 | orgs | 财务组织 | orgs | varchar(3000) |  | 组织 (org) |
| 8 | orgs_name | 财务组织名称 | orgs_name | varchar(50) |  | 字符串 (String) |
| 9 | start_amount | 最小金额 | start_amount | varchar(50) |  | 字符串 (String) |
| 10 | start_bill_date | 开始日期 | start_bill_date | char(19) |  | 日期 (UFDate) |
| 11 | total_rate | 分层比例 | total_rate | varchar(50) |  | 字符串 (String) |
| 12 | workinggroup | 工作组 | workinggroup | varchar(3000) |  | 字符串 (String) |
| 13 | trade_type | 交易类型 | trade_type | varchar(3000) |  | 交易类型 (transtype) |
| 14 | trade_type_code | 交易类型编码 | trade_type_code | varchar(3000) |  | 字符串 (String) |
| 15 | order_number | 序号 | order_number | int |  | 整数 (Integer) |
| 16 | autocheckrate | 自动审核比例 | autocheckrate | decimal(28, 8) |  | 数值 (UFDouble) |