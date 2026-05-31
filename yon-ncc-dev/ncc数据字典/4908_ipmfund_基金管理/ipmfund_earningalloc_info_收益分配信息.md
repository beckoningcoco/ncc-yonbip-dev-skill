# |<<

**收益分配信息 (ipmfund_earningalloc_info / nc.vo.ipmfund.earningalloc.EarningAllocInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3298.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_earningalloc_info | 收益分配信息主键 | pk_earningalloc_info | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | vmemo | 备注 | vmemo | varchar(200) |  | 备注 (Memo) |
| 4 | partnername | 出资人名称 | partnername | varchar(20) |  | 企业&自然人 (EnterprisePersonVO) |
| 5 | vpartnernature | 出资人性质 | vpartnernature | varchar(50) |  | 出资人性质 (FundPartnerType) |  | 1=普通合伙人; |