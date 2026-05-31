# |<<

**服务价格 (bd_uh_item_price / com.yonyou.nhis.bd.pub2.item.vo.ItemPriceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1053.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itemprice | 服务价格主键 | pk_itemprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_item | 服务项目 | pk_item | char(20) |  | 主键 (UFID) |
| 5 | eu_pricetype | 价格类型 | eu_pricetype | int |  | 整数 (Integer) |
| 6 | price | 价格 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | date_begin | 开始日期时间 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 8 | date_end | 结束日期时间 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 9 | flag_stop | 停用标志 | flag_stop | char(1) |  | 布尔类型 (UFBoolean) |