# |<<

**物料消耗单 (cm_stuff / nc.vo.cm.stuff.entity.StuffHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1510.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstuffid | 物料消耗单 | cstuffid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 7 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 10 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 11 | isourcetype | 来源类型 | isourcetype | int |  | 来源类型(成本) (CMSourceTypeEnum) | 1 | 1=自制; |