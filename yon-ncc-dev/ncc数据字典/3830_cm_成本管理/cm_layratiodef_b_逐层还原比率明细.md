# |<<

**逐层还原比率明细 (cm_layratiodef_b / nc.vo.cm.layratiodef.entity.LayRatioDefItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1489.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | clayratiodefid_bid | 逐层还原比率明细 | clayratiodefid_bid | char(20) | √ | 主键 (UFID) |
| 2 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 3 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 6 | nunitconsume | 单耗 | nunitconsume | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nunitcost | 单位成本 | nunitcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | clayratiodefid | 逐层还原比率 | clayratiodefid | char(20) |  | 主键 (UFID) |
| 9 | iacquireprice | 取价参数 | iacquireprice | int |  | 取价参数 (ACQuirePriceEnum) |  | 1=上月结存价; |