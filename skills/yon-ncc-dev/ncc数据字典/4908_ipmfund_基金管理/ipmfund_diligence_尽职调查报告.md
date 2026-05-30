# |<<

**尽职调查报告 (ipmfund_diligence / nc.vo.ipmfund.duediligence.DueDiligenceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3293.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_due_diligence | 尽职调查主键 | pk_due_diligence | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 尽调编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | fundlid_name | 基金名称 | fundlid_name | varchar(500) |  | 字符串 (String) |
| 8 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 9 | dstartdate | 调查开始日期 | dstartdate | char(19) |  | 日期 (UFDate) |
| 10 | denddate | 调查完成日期 | denddate | char(19) |  | 日期 (UFDate) |
| 11 | pk_dept | 编制部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_dept_v | 编制部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | pk_psndoc | 编制人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | dbilldate | 编制日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 15 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |