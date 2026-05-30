# |<<

**票据池指令状态主表 (obm_ebankpayorderstatus_h / nc.vo.obm.ebankpayorderstatus.EbankpayorderstatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3922.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | srcgroup | 所属集团 | srcgroup | varchar(50) |  | 字符串 (String) |
| 5 | srcorg | 所属财务组织 | srcorg | varchar(50) |  | 字符串 (String) |
| 6 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 7 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | ctrantypeid | 单据类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | vtrantypecode | 单据类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 11 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 12 | fstatusflag | 单据状态 | fstatusflag | varchar(50) |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |