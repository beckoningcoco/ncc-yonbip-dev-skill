# |<<

**预订单交易类型 (so_m38trantype / nc.vo.so.m38trantype.entity.M38TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5419.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 预订单交易类型主键 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | bmorerows | 同一货物可否列多行 | bmorerows | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | faskqtrule | 询价规则 | faskqtrule | int | √ | 询价规则 (AskqtRule) | 1 | 1=不询价; |