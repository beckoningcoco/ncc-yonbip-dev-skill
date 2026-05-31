# |<<

**银团贷款 (cdmc_repprcpl_bank / nc.vo.cdmc.cdm.repayprcpl.RepayPrcplBankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1400.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repprcpl_bank | 主键 | pk_repprcpl_bank | char(20) | √ | 主键 (UFID) |
| 2 | pk_repayprcpl | 还本主表主键 | pk_repayprcpl | char(20) |  | 主键 (UFID) |
| 3 | pk_bankdoc | 参与银行 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 4 | actratio | 实际比例% | actratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | actrepaymny | 实还本金 | actrepaymny | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | actrepayolcmny | 实还本金组织本币 | actrepayolcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | actrepayglcmny | 实还本金集团本币 | actrepayglcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | actrepaygllcmny | 实还本金全局本币 | actrepaygllcmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | banktype | 银行类别 | banktype | varchar(50) |  | 银团银行类别 (BankTypeEnum) |  | AGENT=代理行; |