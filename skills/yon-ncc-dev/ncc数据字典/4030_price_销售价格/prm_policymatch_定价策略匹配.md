# |<<

**定价策略匹配 (prm_policymatch / nc.vo.price.pricepolicymatch.entity.PricePolicyMatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4658.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_policymatch | 定价策略匹配 | pk_policymatch | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 5 | pk_marsaleclass | 物料销售分类 | pk_marsaleclass | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 6 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | pk_custclass | 客户分类 | pk_custclass | varchar(20) |  | 客户基本分类 (custclass) |
| 8 | pk_custsaleclass | 客户销售分类 | pk_custsaleclass | varchar(20) |  | 客户销售分类 (custsaleclass) |
| 9 | pk_pricepolicy | 定价策略 | pk_pricepolicy | varchar(20) | √ | 定价策略 (PricePolicy) |
| 10 | cbelongsaleorgid | 定价策略所属销售组织 | cbelongsaleorgid | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 11 | caskunicode | 询价优先码 | caskunicode | char(27) |  | 字符串 (String) |
| 12 | materialinnercode | 物料分类内部码 | materialinnercode | varchar(230) |  | 字符串 (String) |
| 13 | customerinnercode | 客户分类内部码 | customerinnercode | varchar(230) |  | 字符串 (String) |
| 14 | saleorginnercode | 销售组织内部码 | saleorginnercode | varchar(230) |  | 字符串 (String) |
| 15 | bpcorgtoaskflag | 是否利润中心内部交易询价 | bpcorgtoaskflag | char(1) |  | 布尔类型 (UFBoolean) |