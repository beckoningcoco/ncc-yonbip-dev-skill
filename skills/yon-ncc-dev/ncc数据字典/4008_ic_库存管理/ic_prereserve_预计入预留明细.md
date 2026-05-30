# |<<

**预计入预留明细 (ic_prereserve / nc.vo.ic.reserve.entity.PreReserveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2956.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prereserve | 预计入预留明细 | pk_prereserve | char(20) | √ | 主键 (UFID) |
| 2 | dreqdate | 需求日期 | dreqdate | varchar(19) |  | 日期 (UFDate) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 7 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 8 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | csupplyhid | 供给单据头 | csupplyhid | varchar(20) |  | 主键 (UFID) |
| 11 | csupplybid | 供给单据体 | csupplybid | varchar(20) |  | 主键 (UFID) |
| 12 | csupplytype | 供给单据类型 | csupplytype | varchar(50) |  | 供给单据类型 (SupplyType) |  | 55A2=流程生产订单; |