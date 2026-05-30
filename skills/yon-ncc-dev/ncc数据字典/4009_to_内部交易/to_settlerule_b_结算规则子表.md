# |<<

**结算规则子表 (to_settlerule_b / nc.vo.to.settlerule.entity.SettleRuleBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5818.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csettlerule_bid | 子表主键 | csettlerule_bid | char(20) | √ | 主键 (UFID) |
| 2 | cinvbasclass | 调拨物料分类 | cinvbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 3 | cinventoryid | 调拨物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | vpricerule | 价格规则 | vpricerule | varchar(151) |  | 字符串 (String) |
| 5 | vestimatepricerule | 暂估取价规则 | vestimatepricerule | varchar(151) |  | 字符串 (String) |
| 6 | naddpricerate | 加价率(%) | naddpricerate | decimal(20, 2) |  | 数值 (UFDouble) |
| 7 | bmodifyprice | 询价后价格是否可改 | bmodifyprice | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | boutautopushia | 出库签字是否自动传存货 | boutautopushia | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | boutautosendout | 出库签字是否自动作发出商品 | boutautosendout | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | fouttoarrule | 出库传应收规则 | fouttoarrule | int |  | 出库传应收规则 (OutToARRule) |  | 0=不传应收; |