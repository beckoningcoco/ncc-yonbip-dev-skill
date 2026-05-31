# |<<

**结转层次计算 (cm_tranlevelcal / nc.vo.cm.tranlevel.TranLevelCalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1517.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tlcid | 结转层次计算 | pk_tlcid | char(20) | √ | 主键 (UFID) |
| 2 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 3 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 4 | finishednum | 合格品量 | finishednum | decimal(28, 2) |  | 数值 (UFDouble) |
| 5 | onproducenum | 在产量 | onproducenum | decimal(28, 2) |  | 数值 (UFDouble) |
| 6 | wastenum | 废品量 | wastenum | decimal(28, 2) |  | 数值 (UFDouble) |
| 7 | notrancost | 待结转成本 | notrancost | decimal(28, 2) |  | 数值 (UFDouble) |
| 8 | begincost | 期初在产 | begincost | decimal(28, 2) |  | 数值 (UFDouble) |
| 9 | currentperiodcost | 本期投入 | currentperiodcost | decimal(28, 2) |  | 数值 (UFDouble) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 12 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 13 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 14 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | finishedcost | 完工成本 | finishedcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | wastecost | 废品成本 | wastecost | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | tranoutcost | 转出成本 | tranoutcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | onproducecost | 在产成本 | onproducecost | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 20 | saga_btxid | 子事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 21 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 22 | saga_status | Saga事务状态 | saga_status | int |  | 整数 (Integer) |