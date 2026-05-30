# |<<

**销售运营计划明细 (mm_sop_b / nc.vo.mmsop.sop.entity.SOPDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3785.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sop_b | SOP计划明细ID | pk_sop_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 6 | cmanuplantid | 生产工厂最新版本 | cmanuplantid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 7 | cmanuplantvid | 生产工厂版本 | cmanuplantvid | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 8 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 13 | nperiodcode | 时段编号 | nperiodcode | int |  | 整数 (Integer) |
| 14 | nperiodyear | 时段所处年份 | nperiodyear | int |  | 整数 (Integer) |
| 15 | vperiodbegindate | 时段开始日期 | vperiodbegindate | char(19) |  | 日期 (UFDate) |
| 16 | vperiodenddate | 时段结束日期 | vperiodenddate | char(19) |  | 日期 (UFDate) |
| 17 | nbegininvnum | 期初库存主数量 | nbegininvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nbegininvastnum | 期初库存数量 | nbegininvastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nsaleplannum | 销售计划主数量 | nsaleplannum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nsaleplanastnum | 销售计划数量 | nsaleplanastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | npdplannum | 生产计划主数量 | npdplannum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | npdplanastnum | 生产计划数量 | npdplanastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ntgtinvlvnum | 目标库存水平主数量 | ntgtinvlvnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | ntgtinvlvastnum | 目标库存水平数量 | ntgtinvlvastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | itgtsupdays | 目标供应天数 | itgtsupdays | int |  | 整数 (Integer) |