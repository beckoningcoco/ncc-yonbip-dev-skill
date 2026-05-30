# |<<

**标准作业成本明细 (sca_stdactcost_b / nc.vo.sca.stdcostcalc.StdActCostItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5065.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstdactcost_bid | 标准作业成本表明细 | cstdactcost_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 6 | cstdactcostid | 标准作业成本表 | cstdactcostid | char(20) |  | 主键 (UFID) |
| 7 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | nnumber | 数量 | nnumber | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | nprice | 单价 | nprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | ncost | 成本 | ncost | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | ichildtype | 子项类型 | ichildtype | int |  | 标准产品成本子项类型 (StdProdChildTypeEnum) |  | 1=材料; |