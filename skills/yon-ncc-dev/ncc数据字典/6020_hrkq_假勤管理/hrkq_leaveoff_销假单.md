# |<<

**销假单 (hrkq_leaveoff / nccloud.vo.hrkq.leaveoff.LeaveoffVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2716.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leaveoff | 主键 | pk_leaveoff | char(20) | √ | 主键 (UFID) |
| 2 | mainid | 休假单主表id | mainid | varchar(50) |  | 字符串 (String) |
| 3 | leaveoffbegintime | 销假开始时间 | leaveoffbegintime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | leavebegintime | 请假开始时间 | leavebegintime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | leaveoffendtime | 销假结束时间 | leaveoffendtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | leaveendtime | 请假结束时间 | leaveendtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | leaveoffday | 销假时长 | leaveoffday | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | leaveday | 请假时长 | leaveday | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | pk_psndoc | 人员id | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 10 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 11 | approvetime | 审批时间 | approvetime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (billStateEnum) |  | -1=自由; |