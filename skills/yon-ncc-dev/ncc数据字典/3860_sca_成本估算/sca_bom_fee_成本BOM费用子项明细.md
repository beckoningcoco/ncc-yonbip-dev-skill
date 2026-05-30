# |<<

**成本BOM费用子项明细 (sca_bom_fee / nc.vo.sca.costbom.entity.CostBomFeeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbomfeeid | 成本BOM费用子项明细 | cbomfeeid | char(20) | √ | 主键 (UFID) |
| 2 | ccmbomid | 成本BOM | ccmbomid | char(20) |  | 主键 (UFID) |
| 3 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 4 | nfeerate | 费率 | nfeerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | ipriceresource | 价格来源 | ipriceresource | int | √ | 价格来源 (priceSourceEnun) | 1 | 1=手工录入; |