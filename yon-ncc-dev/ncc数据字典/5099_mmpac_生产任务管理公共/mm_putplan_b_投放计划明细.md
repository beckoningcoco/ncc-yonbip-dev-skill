# |<<

**投放计划明细 (mm_putplan_b / nc.vo.mmpac.putplan.entity.PutPlanPickmVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3756.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_putplan_pickm | 投放计划明细 | pk_putplan_pickm | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | cpickmid | 备料计划 | cpickmid | varchar(20) |  | 字符串 (String) |
| 6 | cpickmbid | 备料计划明细 | cpickmbid | varchar(20) |  | 备料计划明细 (mm_pickm_b) |
| 7 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 8 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | nplanoutastnum | 计划出库数量 | nplanoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nplanoutnum | 计划出库主数量 | nplanoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | drequiredate | 需用日期 | drequiredate | char(19) |  | 日期(结束) (UFDateEnd) |
| 13 | nshouldastnum | 累计待发数量 | nshouldastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nshouldnum | 累计待发主数量 | nshouldnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | naccoutastnum | 累计出库数量 | naccoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | naccoutnum | 累计出库主数量 | naccoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | vbrowno | 行号 | vbrowno | varchar(20) |  | 字符串 (String) |
| 18 | nunituseastnum | 单位用量 | nunituseastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | nunitusenum | 单位主用量 | nunitusenum | decimal(28, 8) |  | 数值 (UFDouble) |