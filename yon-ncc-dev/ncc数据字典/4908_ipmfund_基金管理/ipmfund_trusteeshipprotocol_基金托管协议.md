# |<<

**基金托管协议 (ipmfund_trusteeshipprotocol / nc.vo.ipmfund.trusteeshipprotocol.TrusteeshipProtocolVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3346.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trusteeprotocol | 信托关系主键 | pk_trusteeprotocol | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 协议编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | vprotocolname | 协议名称 | vprotocolname | varchar(50) |  | 字符串 (String) |
| 7 | signdate | 签订日期 | signdate | char(19) |  | 日期 (UFDate) |
| 8 | effectivedate | 生效日期 | effectivedate | char(19) |  | 日期 (UFDate) |
| 9 | vsignaddress | 签订地点 | vsignaddress | varchar(500) |  | 字符串 (String) |
| 10 | vcontentsummary | 协议内容概述 | vcontentsummary | varchar(2048) |  | 备注 (Memo) |
| 11 | pk_dept | 编制部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_dept_v | 编制部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | pk_psndoc | 编制人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | dbilldate | 编制日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 15 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |