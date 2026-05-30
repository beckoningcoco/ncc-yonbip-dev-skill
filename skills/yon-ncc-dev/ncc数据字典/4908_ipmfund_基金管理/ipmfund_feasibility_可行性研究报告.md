# |<<

**可行性研究报告 (ipmfund_feasibility / nc.vo.ipmfund.feasibility.FeasibilityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feasibility | 可行性研究报告主键 | pk_feasibility | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vfundnumber | 基金编号 | vfundnumber | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 6 | vfundname | 基金名称 | vfundname | varchar(50) |  | 字符串 (String) |
| 7 | vfundtype | 基金类型 | vfundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 8 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | pk_dept | 编制部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_dept_v | 编制部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | pk_psndoc | 编制人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | vbillname | 单据名称 | vbillname | varchar(400) |  | 字符串 (String) |
| 13 | dbilldate | 编制日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 14 | pk_busitype | 业务流程 | pk_busitype | varchar(20) |  | 业务流程 (BusitypeVO) |
| 15 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 16 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |