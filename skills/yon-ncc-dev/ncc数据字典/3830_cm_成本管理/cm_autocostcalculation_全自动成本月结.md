# |<<

**全自动成本月结 (cm_autocostcalculation / nc.vo.cm.autocostcalculation.entity.AutoCostCalculationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1450.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cautocostcalculationid | 全自动成本月结 | cautocostcalculationid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | ctaskitem | 月结任务 | ctaskitem | int |  | 月结任务枚举 (TaskItemEnum) |  | 2=外系统取数; |