# |<<

**物资及服务需求追加单子表 (pm_mateplanadd_b / nc.vo.pbm.materialplanadd.MaterialPlanAddBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4474.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matplanadd_b | 物资服务及需求追加单子表主键 | pk_matplanadd_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_mater_plan_b | 需求单行号 | pk_mater_plan_b | varchar(20) |  | 物资及服务需求单子表 (MaterialPlanBodyVO) |
| 7 | pk_cbs_node | CBS | pk_cbs_node | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 8 | pk_material | 物资编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | nowadd_num | 本次追加量 | nowadd_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | require_date | 需求日期 | require_date | char(19) |  | 日期 (UFDate) |
| 12 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 13 | pk_stockorg | 库存组织 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 14 | pray_param | 请购/申请 | pray_param | int |  | 请购/申请选择 (prayparam) |  | 0=请购; |