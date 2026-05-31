# |<<

**合同价格信息子表 (ct_price_b / nc.vo.ct.price.entity.CtPriceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1662.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_price_b | 合同价格子表主键 | pk_ct_price_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 5 | pk_puorg | 适用采购组织 | pk_puorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 6 | npriceitem1 | 价格项1 | npriceitem1 | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | npriceitem2 | 价格项2 | npriceitem2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | npriceitem3 | 价格项3 | npriceitem3 | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | npriceitem4 | 价格项4 | npriceitem4 | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | npriceitem5 | 价格项5 | npriceitem5 | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | npriceitem6 | 价格项6 | npriceitem6 | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | npriceitem7 | 价格项7 | npriceitem7 | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | npriceitem8 | 价格项8 | npriceitem8 | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | npriceitem9 | 价格项9 | npriceitem9 | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | npriceitem10 | 价格项10 | npriceitem10 | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | npriceitem11 | 价格项11 | npriceitem11 | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | npriceitem12 | 价格项12 | npriceitem12 | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | npriceitem13 | 价格项13 | npriceitem13 | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | npriceitem14 | 价格项14 | npriceitem14 | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | npriceitem15 | 价格项15 | npriceitem15 | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | npriceitem16 | 价格项16 | npriceitem16 | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | npriceitem17 | 价格项17 | npriceitem17 | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | npriceitem18 | 价格项18 | npriceitem18 | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | npriceitem19 | 价格项19 | npriceitem19 | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | npriceitem20 | 价格项20 | npriceitem20 | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | npriceitem21 | 价格项21 | npriceitem21 | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | npriceitem22 | 价格项22 | npriceitem22 | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | npriceitem23 | 价格项23 | npriceitem23 | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | npriceitem24 | 价格项24 | npriceitem24 | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | npriceitem25 | 价格项25 | npriceitem25 | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | npriceitem26 | 价格项26 | npriceitem26 | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | npriceitem27 | 价格项27 | npriceitem27 | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | npriceitem28 | 价格项28 | npriceitem28 | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | npriceitem29 | 价格项29 | npriceitem29 | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | npriceitem30 | 价格项30 | npriceitem30 | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | baseprice | 基价 | baseprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | totalprice | 总价 | totalprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | dvaldate | 生效日期 | dvaldate | char(19) |  | 日期(开始) (UFDateBegin) |
| 39 | dinvallidate | 失效日期 | dinvallidate | char(19) |  | 日期(结束) (UFDateEnd) |
| 40 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 41 | orgregion | 适用区域 | orgregion | varchar(50) |  | 字符串 (String) |