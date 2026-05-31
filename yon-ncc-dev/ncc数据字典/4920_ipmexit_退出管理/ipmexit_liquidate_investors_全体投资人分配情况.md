# |<<

**全体投资人分配情况 (ipmexit_liquidate_investors / nc.vo.ipmexit.exitliquidate.ExitLiquidateInvestorsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3275.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_investors | 全体投资人主键 | pk_investors | varchar(50) | √ | 字符串 (String) |
| 2 | pk_enterprise_person | 投资人名称 | pk_enterprise_person | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 3 | vpartnertype | 投资人性质 | vpartnertype | varchar(50) |  | 出资人性质 (FundPartnerType) |  | 1=普通合伙人; |