# |<<

**项目出资拨付 (ipmfund_capitalallocat / nc.vo.ipmfund.capitalallocat.CapitalallocatVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_capitalallocat | 主表主键 | pk_capitalallocat | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 6 | pk_dept | 申请部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 7 | pk_dept_v | 申请部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 8 | pk_psndoc | 申请人 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 10 | vbillname | 单据名称 | vbillname | varchar(800) |  | 字符串 (String) |
| 11 | cbilltypecode | 单据类型 | cbilltypecode | varchar(20) |  | 字符串 (String) |
| 12 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 13 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |