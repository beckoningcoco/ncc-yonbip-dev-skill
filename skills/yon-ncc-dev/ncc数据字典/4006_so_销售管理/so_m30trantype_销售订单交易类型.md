# |<<

**销售订单交易类型 (so_m30trantype / nc.vo.so.m30trantype.entity.M30TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 交易类型扩展表主键 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 交易类型主键 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | fdirecttype | 直运类型标记 | fdirecttype | int | √ | 直运类型标记 (DirectType) | 1 | 1=非直运; |