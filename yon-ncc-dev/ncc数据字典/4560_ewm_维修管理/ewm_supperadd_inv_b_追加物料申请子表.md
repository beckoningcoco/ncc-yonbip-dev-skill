# |<<

**追加物料申请子表 (ewm_supperadd_inv_b / nc.vo.ewm.supperaddinv.SupperaddInvBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1952.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supperadd_inv_b | 追加物料申请子表主键 | pk_supperadd_inv_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_wo | 工单 | pk_wo | varchar(20) |  | 工单 (WorkOrder) |
| 4 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pk_measdoc | 主单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 8 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 11 | require_date | 需求日期 | require_date | char(19) |  | 日期 (UFDate) |
| 12 | pk_stororg | 库存组织最新版本 | pk_stororg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 13 | pk_stororg_v | 库存组织 | pk_stororg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 14 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 15 | price_org | 主参考单价 | price_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | money_org | 参考成本 | money_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 18 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 19 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 20 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 21 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |