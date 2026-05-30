# |<<

**工序计划 (mm_procon_procedure / nc.vo.mmpac.proconsole.entity.ProConProcedureVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3750.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | 工序计划 | cid | char(20) | √ | 主键 (UFID) |
| 2 | coperheadid | 表头 | coperheadid | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | vprocedureno | 工序号 | vprocedureno | varchar(50) |  | 字符串 (String) |
| 7 | vprocedurenote | 工序说明 | vprocedurenote | varchar(50) |  | 字符串 (String) |
| 8 | bmain | 主序 | bmain | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | vproceduretype | 工序类型 | vproceduretype | varchar(20) |  | 标准工序 (pd_rc) |
| 10 | brework | 返工工序 | brework | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 12 | nbplanastnum | 计划生产数量 | nbplanastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nbplannum | 计划生产主数量 | nbplannum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | ndispatchastnum | 累计派工数量 | ndispatchastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | ndispatchnum | 累计派工主数量 | ndispatchnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ninastnum | 累计合格数量 | ninastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ninnum | 累计合格主数量 | ninnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ntransastnum | 累计转移数量 | ntransastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ntransnum | 累计转移主数量 | ntransnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | foverlaptype | 重叠类型 | foverlaptype | varchar(50) |  | 字符串 (String) |
| 21 | nfixtime | 固定时间 | nfixtime | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nmindeliverastnum | 最小转移数量 | nmindeliverastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nmindelivernum | 最小转移主数量 | nmindelivernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | cnumunitid | 数量单位 | cnumunitid | varchar(50) |  | 字符串 (String) |
| 25 | bcheckpoint | 检验点 | bcheckpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | breportpoint | 完工报告点 | breportpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | ftransmode | 工序转移方式 | ftransmode | int |  | 工序转移方式 (ProcessMoveTypeEnum) | 2 | 1=不转移; |