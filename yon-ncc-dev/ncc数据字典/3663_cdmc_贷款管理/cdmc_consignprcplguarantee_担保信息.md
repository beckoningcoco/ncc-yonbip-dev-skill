# |<<

**担保信息 (cdmc_consignprcplguarantee / nc.vo.cdmc.ccm.consigncreditrepayprcpl.ConsignCreditPrcplGuaranteeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_grt | 主键 | pk_repprcpl_grt | char(20) | √ | 主键 (UFID) |
| 2 | releasegrtmny | 释放担保金额 | releasegrtmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 3 | olcreleasegrtmny | 释放担保本币金额 | olcreleasegrtmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 4 | glcreleasegrtmny | 集团释放担保本币金额 | glcreleasegrtmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | gllcreleasegrtmny | 全局释放担保本币金额 | gllcreleasegrtmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | pk_grtcontract | 担保合同 | pk_grtcontract | varchar(20) |  | 担保合同 (GuaContractVO) |
| 7 | guaranteetype | 担保方式 | guaranteetype | varchar(50) |  | 担保方式 (GuaranteeTypeEnum) |  | CREDIT=信用; |