# |<<

**请假单 (hrkq_leave / nccloud.vo.hrkq.leave.LeaveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leave | 主键 | pk_leave | char(20) | √ | 主键 (UFID) |
| 2 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 3 | pk_psndoc | 申请人 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 5 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_leave_type | 请假类别 | pk_leave_type | varchar(36) |  | 请假类型 (ts_leavetype) |
| 8 | begintime | 开始时间 | begintime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | endtime | 结束时间 | endtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | leaveday | 请假时长 | leaveday | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | minunit | 请假时长单位 | minunit | int |  | 请假时长单位 (leaveminunit) |  | 1=小时; |