# |<<

**流程实例 (pub_wf_instance / nc.vo.pf.flowinstance.FlowInstanceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4787.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_instance | 流程实例主键 | pk_wf_instance | char(20) | √ | 主键 (UFID) |
| 2 | billmaker | 提交人 | billmaker | varchar(20) |  | 用户 (user) |
| 3 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 4 | startts | 开始时间 | startts | char(19) |  | 日期时间 (UFDateTime) |
| 5 | endts | 结束时间 | endts | char(19) |  | 日期时间 (UFDateTime) |
| 6 | duration | 历时 | duration | varchar(50) |  | 字符串 (String) |
| 7 | overdue | 逾期 | overdue | varchar(50) |  | 字符串 (String) |
| 8 | billtype | 单据类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | billno | 单据号 | billno | varchar(256) |  | 字符串 (String) |
| 10 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | procstatus | 流程状态 | procstatus | varchar(50) |  | 字符串 (String) |
| 12 | procresult | 流程结果 | procresult | varchar(50) |  | 字符串 (String) |
| 13 | workflow_type | 流程类型 | workflow_type | varchar(50) |  | 字符串 (String) |
| 14 | procstatus_value | 流程状态value | procstatus_value | int |  | 整数 (Integer) |
| 15 | procresult_value | 流程结果value | procresult_value | varchar(50) |  | 字符串 (String) |
| 16 | workflow_type_value | 流程类型value | workflow_type_value | int |  | 整数 (Integer) |