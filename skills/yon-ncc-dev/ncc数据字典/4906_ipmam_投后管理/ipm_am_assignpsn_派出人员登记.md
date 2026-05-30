# |<<

**派出人员登记 (ipm_am_assignpsn / nc.vo.ipmam.assignpsn.AssignPsnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3150.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assignpsn | 派出人员登记主键 | pk_assignpsn | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 经办部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 经办部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | vbillname | 单据名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 10 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 11 | pk_projectlib | 项目编码 | pk_projectlib | varchar(20) |  | 投资项目档案 (ProjectLibVO) |
| 12 | projectname | 项目名称 | projectname | varchar(800) |  | 字符串 (String) |
| 13 | pk_fundlib | 基金名称 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 14 | pk_enterprise | 派驻企业 | pk_enterprise | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 15 | version | 版本号 | version | decimal(28, 0) |  | 数值 (UFDouble) |
| 16 | bislastver | 是否最新版本 | bislastver | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | pk_origassignpsn | 起始版本主键 | pk_origassignpsn | varchar(20) |  | 字符串 (String) |
| 18 | vmemo | 备注 | vmemo | varchar(2048) |  | 备注 (Memo) |
| 19 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 20 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |