# |<<

**担保信息 (cdmc_conguarantee / nc.vo.cdmc.cdm.contract.ConGuaranteeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1325.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conguarantee_b | 主键 | pk_conguarantee_b | char(20) | √ | 主键 (UFID) |
| 2 | guaranteecontract | 担保合同 | guaranteecontract | varchar(20) |  | 担保合同 (GuaContractVO) |
| 3 | guaranteemny | 担保金额 | guaranteemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | gecurrtypeid | 担保币种 | gecurrtypeid | varchar(20) |  | 币种 (currtype) |
| 5 | guaratype | 担保方式 | guaratype | varchar(50) |  | 担保方式 (GuaranteeTypeEnum) |  | CREDIT=信用; |