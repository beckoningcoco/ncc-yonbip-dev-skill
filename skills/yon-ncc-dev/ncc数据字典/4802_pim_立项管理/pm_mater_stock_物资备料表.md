# |<<

**物资备料表 (pm_mater_stock / nc.vo.pbm.materialstock.MaterialStockVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4477.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mater_stock | 项目物资备料表主键 | pk_mater_stock | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 4 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | pk_material_v | 物料多版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pk_stockorg | 需求库存组织 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | pray_apply | 请购/申请 | pray_apply | int |  | 请购/申请选择 (prayparam) |  | 0=请购; |