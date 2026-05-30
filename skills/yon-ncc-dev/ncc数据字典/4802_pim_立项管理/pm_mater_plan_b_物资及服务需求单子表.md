# |<<

**物资及服务需求单子表 (pm_mater_plan_b / nc.vo.pbm.materialplan.MaterialPlanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4476.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mater_plan_b | 子表主键 | pk_mater_plan_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_material | 物资编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 8 | pk_cbs_node | CBS | pk_cbs_node | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 9 | pk_stockorg | 库存组织 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 10 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pray_param | 请购/申请 | pray_param | int |  | 请购/申请选择 (prayparam) |  | 0=请购; |