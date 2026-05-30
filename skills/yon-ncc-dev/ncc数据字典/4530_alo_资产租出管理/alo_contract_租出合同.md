# |<<

**租出合同 (alo_contract / nc.vo.alo.contract.leasecont.ContractOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/82.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract | 租出合同主键 | pk_contract | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_out | 出租组织最新版本 | pk_org_out | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_contract_oid | 合同最新版本 | pk_contract_oid | varchar(20) |  | 租出合同 (ContractOutHeadVO) |
| 4 | pk_org_out_v | 出租组织 | pk_org_out_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 6 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(30) |  | 字符串 (String) |
| 8 | affirm_date | 确认时间 | affirm_date | char(19) |  | 日期时间 (UFDateTime) |
| 9 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 10 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 11 | bill_status | 合同状态 | bill_status | varchar(50) |  | 租出合同状态 (COBillStatusConst) |  | 0=自由态; |