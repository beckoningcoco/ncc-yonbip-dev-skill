# |<<

**全体投资人信息 (ipmfund_investagree_sponsor / nc.vo.ipmfund.investagreement.InvestAgreementSponsorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3320.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sponsor | 全体出资人主键 | pk_sponsor | varchar(50) | √ | 字符串 (String) |
| 2 | pk_enterprise_person | 投资人名称 | pk_enterprise_person | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 3 | bisepicycle | 是否本轮投资人 | bisepicycle | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | norigsponsormny | 出资金额 | norigsponsormny | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nbasesponsormny | 出资金额组织本币 | nbasesponsormny | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | ngpsponsormny | 出资金额集团本币 | ngpsponsormny | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nallsponsormny | 出资金额全局本币 | nallsponsormny | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ratio | 出资比例(%) | ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | vbinvestway | 出资方式 | vbinvestway | varchar(50) |  | 出资方式 (WaysOfInvestment) |  | 1=货币; |