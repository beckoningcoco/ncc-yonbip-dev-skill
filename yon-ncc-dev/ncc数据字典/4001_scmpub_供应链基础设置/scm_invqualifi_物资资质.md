# |<<

**物资资质 (scm_invqualifi / nc.vo.scmpub.materialquali.InvqualifiHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5219.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invqualifi | 主键 | pk_invqualifi | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 6 | pk_supplier | 供应商编码 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | name_supplier | 供应商名称 | name_supplier | varchar(50) |  | 字符串 (String) |
| 8 | pk_ctfctype | 证件类型 | pk_ctfctype | varchar(20) |  | 证件类型定义 (CertificateVO) |
| 9 | ctfc_number | 证件号码 | ctfc_number | varchar(50) |  | 字符串 (String) |
| 10 | ctfc_name | 证件名称 | ctfc_name | varchar(50) |  | 字符串 (String) |
| 11 | deffectdate | 生效日期 | deffectdate | char(19) |  | 日期 (UFDate) |
| 12 | duneffectdate | 失效日期 | duneffectdate | char(19) |  | 日期 (UFDate) |
| 13 | heavyquantity | 业务单据控制 | heavyquantity | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | warncontrol | 预警控制 | warncontrol | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 16 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 17 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 18 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 19 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 20 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |