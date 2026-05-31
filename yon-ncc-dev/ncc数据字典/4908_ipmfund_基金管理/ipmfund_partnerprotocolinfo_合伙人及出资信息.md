# |<<

**合伙人及出资信息 (ipmfund_partnerprotocolinfo / nc.vo.ipmfund.partnerprotocol.PartnerInvestInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3335.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_partnerinfo | 合伙人及出资信息主键 | pk_partnerinfo | varchar(50) | √ | 字符串 (String) |
| 2 | partnername | 合伙人名称 | partnername | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 3 | vpartnernature | 合伙人性质 | vpartnernature | varchar(50) |  | 出资人性质 (FundPartnerType) |  | 1=普通合伙人; |