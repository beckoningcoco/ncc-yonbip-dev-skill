# |<<

**担保信息 (bond_repayguarantee / nc.vo.bond.bondmanage.repayprinciple.BondRepayGuaranteeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_guarantee | 主键 | pk_guarantee | char(20) | √ | 主键 (UFID) |
| 2 | grtcontract | 担保合约 | grtcontract | varchar(20) |  | 担保合同 (GuaContractVO) |
| 3 | grtstyle | 担保方式 | grtstyle | int |  | 担保方式 (DebttypeEnum) |  | 1=保证; |