# |<<

**现存量预留明细 (ic_handreserve / nc.vo.ic.reserve.entity.OnhandReserveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2914.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_handreserve | 现存量预留明细 | pk_handreserve | char(20) | √ | 主键 (UFID) |
| 2 | dreqdate | 需求日期 | dreqdate | varchar(19) |  | 日期 (UFDate) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 7 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_onhanddim | 现存量维度 | pk_onhanddim | varchar(20) |  | 现存量维度 (OnhandDimVO) |
| 10 | creqbilltype | 需求单据类型 | creqbilltype | varchar(50) |  | 需求类型 (RequireType) |  | 30=销售订单; |