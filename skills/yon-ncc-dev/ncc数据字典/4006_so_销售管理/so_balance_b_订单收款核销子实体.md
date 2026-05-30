# |<<

**订单收款核销子实体 (so_balance_b / nc.vo.so.m30.sobalance.entity.SoBalanceBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5389.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csobalancebid | 订单收款核销子实体 | csobalancebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 销售组织 | pk_org | varchar(20) |  | 主键 (UFID) |
| 3 | fibaltype | 核销类型 | fibaltype | int |  | 核销类型 (SoBalanceType) | 0 | 0=订单收款核销; |