# |<<

**提案审批 (ipm_am_motion / nc.vo.ipmam.motion.MotionApproveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3162.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_motion | 提案审批主键 | pk_motion | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 申请部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 申请部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 申请人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 提案编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 议案主题 | vbillname | varchar(400) |  | 字符串 (String) |
| 10 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 11 | pk_enterprise | 投资企业 | pk_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 12 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 13 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 14 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 15 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |