# |<<

**作业成本表主表 (cm_actcost / nc.vo.cm.allocate.entity.activitycost.ActivityCostHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1432.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactcostid | 作业成本表 | cactcostid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 6 | nnum | 产量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 8 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | ioriginalsourcetype | 原始来源类型 | ioriginalsourcetype | int |  | 来源类型(成本) (CMSourceTypeEnum) |  | 1=自制; |