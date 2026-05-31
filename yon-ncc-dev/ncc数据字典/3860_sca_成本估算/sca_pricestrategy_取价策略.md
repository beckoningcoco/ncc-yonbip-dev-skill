# |<<

**取价策略 (sca_pricestrategy / nc.vo.sca.costbom.entity.PriceStrategyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5062.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricestrategy | 取价策略 | pk_pricestrategy | char(20) | √ | 主键 (UFID) |
| 2 | crefstart | 存货加权平均价开始期间 | crefstart | varchar(20) |  | 会计月份 (accperiodmonth) |
| 3 | crefend | 存货加权平均价结束期间 | crefend | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | crefperiod | 存货最新结存价取价期间 | crefperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 5 | cpricebaseid | 价格库 | cpricebaseid | varchar(50) |  | 字符串 (String) |
| 6 | boverwrite | 覆盖生成 | boverwrite | char(1) |  | 布尔类型 (UFBoolean) | N |
| 7 | nopricestrategy | 无价策略 | nopricestrategy | int |  | 无价策略 (NoPriceStrategyEnum) | 0 | 0=不处理; |