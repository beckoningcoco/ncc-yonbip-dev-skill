# |<<

**交易类型对照 (nresa_billtypecomparison / nccloud.vo.nresa.upgrade.BilltypeComparisonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtypecomparison | 主键 | pk_billtypecomparison | char(20) | √ | 主键 (UFID) |
| 2 | module_old | 原产品 | module_old | varchar(20) |  | 模块信息 (module) |
| 3 | billtype_old | 原单据类型 | billtype_old | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | transtype_old | 原交易类型 | transtype_old | varchar(20) |  | 交易类型 (transtype) |
| 5 | module_new | 新产品 | module_new | varchar(20) |  | 模块信息 (module) |
| 6 | billtype_new | 新单据类型 | billtype_new | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | transtype_new | 新交易类型 | transtype_new | varchar(20) |  | 交易类型 (transtype) |
| 8 | check_status | 检查结果 | check_status | int | √ | 检查结果 (CheckEnum) | 1 | 1=未检查; |