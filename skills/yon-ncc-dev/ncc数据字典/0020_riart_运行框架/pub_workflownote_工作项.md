# |<<

**工作项 (pub_workflownote / nc.vo.pf.worknote.WorkNoteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4795.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkflow | 工作项主键 | pk_checkflow | char(20) | √ | 主键 (UFID) |
| 2 | senderman | 发送人 | senderman | varchar(20) |  | 用户 (user) |
| 3 | senddate | 发送时间 | senddate | char(19) |  | 日期时间 (UFDateTime) |
| 4 | dealdate | 处理时间 | dealdate | char(19) |  | 日期时间 (UFDateTime) |
| 5 | duration | 历时 | duration | varchar(50) |  | 字符串 (String) |
| 6 | overdue | 逾期 | overdue | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | billno | 单据编号 | billno | varchar(256) |  | 字符串 (String) |
| 9 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | checkman | 审批人 | checkman | varchar(20) |  | 用户 (user) |
| 11 | approveresult | 处理意见 | approveresult | varchar(50) |  | 字符串 (String) |
| 12 | checknote | 批语 | checknote | varchar(1024) |  | 字符串 (String) |
| 13 | approvestatus | 处理情况 | approvestatus | varchar(50) |  | 字符串 (String) |
| 14 | approveresult_value | 处理意见value | approveresult_value | varchar(50) |  | 字符串 (String) |
| 15 | approvestatus_value | 处理情况value | approvestatus_value | int |  | 整数 (Integer) |
| 16 | workflow_type_value | 流程类型value | workflow_type_value | int |  | 整数 (Integer) |