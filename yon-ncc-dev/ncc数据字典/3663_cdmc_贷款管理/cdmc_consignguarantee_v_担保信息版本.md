# |<<

**担保信息版本 (cdmc_consignguarantee_v / nc.vo.cdmc.ccm.consigncreditcontract.version.ConsignCreditGuaranteeVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1355.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_b | 主键 | pk_version_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_guarantee_b | 担保信息主键 | pk_guarantee_b | char(20) |  | 主键 (UFID) |
| 3 | guaratype | 担保方式 | guaratype | varchar(50) |  | 担保方式 (GuaranteeTypeEnum) |  | CREDIT=信用; |