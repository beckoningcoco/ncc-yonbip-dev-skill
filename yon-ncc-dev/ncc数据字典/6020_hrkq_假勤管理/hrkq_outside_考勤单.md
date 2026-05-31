# |<<

**考勤单 (hrkq_outside / nccloud.vo.hrkq.outside.OutSideVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outside | 主键 | pk_outside | char(20) | √ | 主键 (UFID) |
| 2 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 3 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | lng | 经度 | lng | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | lat | 纬度 | lat | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | sign_time | 签到时间 | sign_time | char(19) |  | 日期时间 (UFDateTime) |
| 10 | signdate | 考勤日期 | signdate | char(19) |  | 日期 (UFDate) |
| 11 | outside_type | 外勤类型 | outside_type | varchar(20) |  | 外勤类型 (ts_outsidetype) |
| 12 | outsideplace | 外勤地址 | outsideplace | varchar(128) |  | 字符串 (String) |
| 13 | remark | 外勤说明 | remark | varchar(50) |  | 字符串 (String) |
| 14 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 15 | approvetime | 审批时间 | approvetime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |