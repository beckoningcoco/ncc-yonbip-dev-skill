# |<<

**价格组成主实体 (prm_priceform / nc.vo.price.pub.entity.PriceFormHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4661.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceform | 价格组成主实体 | pk_priceform | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_bill | 单据 | pk_bill | varchar(20) |  | 字符串 (String) |
| 4 | pk_pricepolicy | 定价策略 | pk_pricepolicy | varchar(20) |  | 定价策略 (PricePolicy) |
| 5 | pk_pricepolicyorg | 定价策略销售组织 | pk_pricepolicyorg | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 6 | pk_tariffdef | 价目表 | pk_tariffdef | varchar(20) |  | 价目表定义 (TariffDefHVO) |
| 7 | pk_tariffdeforg | 价目表销售组织 | pk_tariffdeforg | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 8 | pk_discountsaleorg | 基准折扣表销售组织 | pk_discountsaleorg | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 9 | nprice | 价格 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ndiscount | 折扣 | ndiscount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nnetprice | 净价 | nnetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nqueryprice | 询到的价格 | nqueryprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nquerydiscount | 询到的折扣 | nquerydiscount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nquerynetprice | 询到的净价 | nquerynetprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | priceformstr | 价格组成字符串 | priceformstr | varchar(2000) |  | 字符串 (String) |