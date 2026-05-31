# |<<

**经营性合同变更单 (aol_cont_alter / nc.vo.aol.contract.alter.ContractAlterHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/108.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contalter | 合同变更单主键 | pk_contalter | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_out | 出租组织最新版本 | pk_org_out | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_out_v | 出租组织 | pk_org_out_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 5 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | transitype_src | 来源交易类型 | transitype_src | varchar(30) |  | 字符串 (String) |
| 7 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 8 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | is_pre | 期初 | is_pre | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | effect_date | 生效日期 | effect_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 12 | terminate_date | 结束日期 | terminate_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 13 | sign_date | 合同签订日期 | sign_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 14 | bill_code | 变更单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 15 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |