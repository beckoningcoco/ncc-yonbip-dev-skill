# |<<

**计划物料 (emm_repair_plan_inv / nc.vo.emm.repairplan.RepairPlanInvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1823.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_inv | 计划物料标识 | pk_repair_plan_inv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | sequence_num | 作业序号 | sequence_num | int |  | 整数 (Integer) |
| 7 | pk_material | 物料 | pk_material | varchar(20) |  | 字符串 (String) |
| 8 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | pk_measdoc | 主单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 13 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 14 | required_date | 需求日期 | required_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | outer_flag | 外部 | outer_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_stockorg | 库存组织 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 17 | pk_stockorg_v | 库存组织版本 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 18 | pk_stordoc | 仓库 | pk_stordoc | varchar(20) |  | 仓库 (stordoc) |
| 19 | price_org | 主参考单价 | price_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | money_org | 参考成本 | money_org | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 22 | buynum | 已请购主数量 | buynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | applynum | 已申请主数量 | applynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |