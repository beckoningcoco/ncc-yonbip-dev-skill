# |<<

**委托贷款合同版本 (cdmc_consigncontract_v / nc.vo.cdmc.ccm.consigncreditcontract.version.ConsignCreditContractVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 主键 | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_contract | 委托贷款合同 | pk_contract | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 合同编号 | vbillno | varchar(100) |  | 字符串 (String) |
| 7 | busitype | 业务类型 | busitype | varchar(50) |  | 业务类型 (BusiTypeEnum) |  | DEBIT=委借; |