# |<<

**稽核报告 (sscqm_check_report / nccloud.vo.sscqm.qualityapi.vo.CheckReportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5599.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | reportid | 报告主键 | reportid | char(20) | √ | 主键 (UFID) |
| 2 | actual_sample_quantity | 实际稽查单据样本数量 | actual_sample_quantity | int |  | 整数 (Integer) |
| 3 | actual_sample_rate | 实际抽样比例 | actual_sample_rate | varchar(50) |  | 字符串 (String) |
| 4 | assess | 质检评价 | assess | varchar(50) |  | 字符串 (String) |
| 5 | instructions | 质检情况 | instructions | varchar(2000) |  | 字符串 (String) |
| 6 | measure | 整改措施 | measure | varchar(2000) |  | 字符串 (String) |
| 7 | sscorgid | 共享服务中心 | sscorgid | varchar(20) |  | 共享服务中心 (sscunit) |
| 8 | problem_quantity | 问题单据数量 | problem_quantity | int |  | 整数 (Integer) |
| 9 | problem_rate | 问题单据比例 | problem_rate | varchar(50) |  | 字符串 (String) |
| 10 | processor | 稽核人 | processor | varchar(1000) |  | 字符串 (String) |
| 11 | report_code | 报告编码 | report_code | varchar(50) |  | 字符串 (String) |
| 12 | report_date | 报告日期 | report_date | char(19) |  | 日期 (UFDate) |
| 13 | sample_quantity | 期望稽查单据样本数量 | sample_quantity | int |  | 整数 (Integer) |
| 14 | sample_rate | 抽样比例 | sample_rate | varchar(50) |  | 字符串 (String) |
| 15 | score | 评分 | score | varchar(50) |  | 字符串 (String) |
| 16 | serious_level | 严重程度 | serious_level | varchar(50) |  | 字符串 (String) |
| 17 | taskid | 稽核任务 | taskid | varchar(20) |  | 稽核任务 (sscqm_check_task) |
| 18 | total_target | 稽查单据目标总量 | total_target | int |  | 整数 (Integer) |
| 19 | checked_quantity | 已稽查单据数量 | checked_quantity | int |  | 整数 (Integer) |
| 20 | report_status | 审批状态 | report_status | varchar(50) |  | 字符串 (String) |
| 21 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 22 | approve_time | 审批时间 | approve_time | char(19) |  | 日期时间 (UFDateTime) |
| 23 | more_serious_problem_quantity | 非常严重问题数量 | more_serious_problem_quantity | int |  | 整数 (Integer) |
| 24 | serious_problem_quantity | 严重问题数量 | serious_problem_quantity | int |  | 整数 (Integer) |
| 25 | general_problem_quantity | 一般问题数量 | general_problem_quantity | int |  | 整数 (Integer) |
| 26 | slight_problem_quantity | 轻微问题数量 | slight_problem_quantity | int |  | 整数 (Integer) |
| 27 | more_slight_problem_quantity | 非常轻微问题数量 | more_slight_problem_quantity | int |  | 整数 (Integer) |
| 28 | reporter | 报告人 | reporter | varchar(20) |  | 用户 (user) |
| 29 | task_property | 任务属性 | task_property | varchar(50) |  | 字符串 (String) |
| 30 | un_sample_quantity | 未抽样单据数量 | un_sample_quantity | int |  | 整数 (Integer) |
| 31 | task_name | 任务名称 | task_name | varchar(50) |  | 字符串 (String) |
| 32 | autocheckrate | 自动审核比例 | autocheckrate | varchar(50) |  | 字符串 (String) |
| 33 | autochecknumber | 自动审核单据数量 | autochecknumber | varchar(50) |  | 字符串 (String) |
| 34 | autocheckproblembillnumber | 自动审核问题单据数量 | autocheckproblembillnumber | varchar(50) |  | 字符串 (String) |