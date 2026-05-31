# |<<

**结算规则主表 (to_settlerule / nc.vo.to.settlerule.entity.SettleRuleHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5817.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csettleruleid | 主表主键 | csettleruleid | char(20) | √ | 主键 (UFID) |
| 2 | coutfinanceorgid | 调出财务组织 | coutfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | cinfinanceorgid | 调入财务组织 | cinfinanceorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | coutstockorgid | 调出库存组织 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | cinstockorgid | 调入库存组织 | cinstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | coutcostregionid | 调出成本域 | coutcostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | cincostregionid | 调入成本域 | cincostregionid | varchar(20) |  | 组织_成本域 (costregion) |
| 8 | csettlecurrtype | 结算币种 | csettlecurrtype | varchar(20) |  | 币种 (currtype) |
| 9 | ctranstype | 交易类型编码 | ctranstype | varchar(20) |  | 字符串 (String) |
| 10 | fsettletype | 内部结算类型 | fsettletype | int | √ | 内部结算场景 (SettleSceneType) | 1 | 1=库存调拨; |