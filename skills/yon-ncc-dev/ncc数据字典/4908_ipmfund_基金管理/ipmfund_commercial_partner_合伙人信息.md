# |<<

**合伙人信息 (ipmfund_commercial_partner / nc.vo.ipmfund.commercialregister.CommercialPartnerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3290.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_partner | 合伙人主键 | pk_partner | char(20) | √ | 主键 (UFID) |
| 2 | pk_enterprise_person | 名称 | pk_enterprise_person | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 3 | vpartnertype | 合伙人性质 | vpartnertype | varchar(50) |  | 出资人性质 (FundPartnerType) |  | 1=普通合伙人; |