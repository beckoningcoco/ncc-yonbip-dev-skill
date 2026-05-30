# |<<

**成本BOM材料子项明细 (sca_bom_stuff / nc.vo.sca.costbom.entity.CostBomStuffItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbomstuffid | 成本BOM材料子项明细 | cbomstuffid | char(20) | √ | 主键 (UFID) |
| 2 | ccmbomid | 成本BOM | ccmbomid | char(20) |  | 主键 (UFID) |
| 3 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 4 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | citemversion | 子项版本号 | citemversion | char(20) |  | 主键 (UFID) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 13 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 14 | istufftype | 材料类型 | istufftype | int |  | 材料类型 (stuffTypeEnum) | 1 | 2=联产品; |