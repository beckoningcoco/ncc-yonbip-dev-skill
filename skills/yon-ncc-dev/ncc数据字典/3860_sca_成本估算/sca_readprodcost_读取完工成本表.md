# |<<

**读取完工成本表 (sca_readprodcost / nc.vo.sca.costbom.entity.ReadProdCostVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5063.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | creadprodcostid | 读取完工成本表 | creadprodcostid | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialid | 产品 | cmaterialid | varchar(0) |  | 物料基本信息 (material_v) |
| 3 | cmaterialclassfy | 产品基本分类 | cmaterialclassfy | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | ccostclassfy | 产品成本分类 | ccostclassfy | varchar(20) |  | 物料成本分类 (marcostclass) |
| 5 | becostcenter | 按成本中心编织标准成本 | becostcenter | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | befinstoragetype | 按入库类型编制标准成本 | befinstoragetype | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | cmaterassinfo | 标准成本产品辅助属性 | cmaterassinfo | varchar(50) |  | 标准成本产品辅助属性 (cmaterassinfo) |  | 1=产品; |