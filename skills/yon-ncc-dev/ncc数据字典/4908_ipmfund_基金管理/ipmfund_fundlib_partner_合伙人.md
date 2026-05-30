# |<<

**合伙人 (ipmfund_fundlib_partner / nc.vo.ipmfund.ipmfundlib.IPMFundLibPartnerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3309.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_partner | 合伙人主键 | pk_partner | char(20) | √ | 主键 (UFID) |
| 2 | pk_enterprise_person | 名称 | pk_enterprise_person | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 3 | vpartnertype | 合伙人类型 | vpartnertype | varchar(50) |  | 出资人性质 (FundPartnerType) |  | 1=普通合伙人; |