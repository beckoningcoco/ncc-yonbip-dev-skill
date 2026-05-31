# |<<

**委托贷款放款担保信息版本 (cdmc_consignfinguarantee_v / nc.vo.cdmc.ccm.consigncreditfinancepay.version.ConsignCreditFinGuaranteeVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1347.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_consignguarantee_b | 子表主键 | pk_consignguarantee_b | char(20) |  | 主键 (UFID) |
| 3 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 4 | pk_guarantee | 担保合同 | pk_guarantee | varchar(20) |  | 担保合同 (GuaContractVO) |
| 5 | guaranteetype | 担保方式 | guaranteetype | varchar(50) |  | 担保方式 (GuaranteeTypeEnum) |  | CREDIT=信用; |