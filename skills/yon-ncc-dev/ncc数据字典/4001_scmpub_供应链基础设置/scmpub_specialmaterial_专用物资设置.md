# |<<

**专用物资设置 (scmpub_specialmaterial / nc.vo.scmpub.specialmaterial.SpecialMaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5244.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_specialmaterial | 主表主键 | pk_specialmaterial | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | code | code | code | varchar(50) |  | 字符串 (String) |
| 8 | name | name | name | varchar(50) |  | 字符串 (String) |
| 9 | maketime | 制单时间 | maketime | char(19) | √ | 日期时间 (UFDateTime) |
| 10 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 12 | billid | 单据ID | billid | varchar(50) |  | 字符串 (String) |
| 13 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 14 | pkorg | 所属组织 | pkorg | varchar(50) |  | 字符串 (String) |
| 15 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 16 | billmaker | 制单人 | billmaker | varchar(50) |  | 字符串 (String) |
| 17 | approver | 审批人 | approver | varchar(50) |  | 字符串 (String) |
| 18 | approvestatus | 审批状态 | approvestatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |