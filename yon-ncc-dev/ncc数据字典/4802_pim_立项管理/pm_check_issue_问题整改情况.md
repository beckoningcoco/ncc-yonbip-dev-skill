# |<<

**问题整改情况 (pm_check_issue / nc.vo.ppm.projectcheck.LeaveIssueVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leave_issue | 遗留问题主键 | pk_leave_issue | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 序号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | issue | 问题 | issue | varchar(200) |  | 字符串 (String) |
| 4 | issue_desc | 问题描述 | issue_desc | varchar(200) |  | 字符串 (String) |
| 5 | modi_requ | 整改要求 | modi_requ | varchar(200) |  | 字符串 (String) |
| 6 | modi_fish_date | 要求完成日期 | modi_fish_date | char(19) |  | 日期 (UFDate) |
| 7 | pk_advancer | 提出人 | pk_advancer | varchar(40) |  | 字符串 (String) |
| 8 | resolve_flag | 必须解决 | resolve_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | modi_circs | 整改结果 | modi_circs | varchar(200) |  | 字符串 (String) |
| 10 | pk_prover | 责任人 | pk_prover | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | problem_date | 发生时间 | problem_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 12 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | problem_status | 问题状态 | problem_status | int |  | 问题状态 (ProbelmStatusEnum) | 1 | 1=未解决; |