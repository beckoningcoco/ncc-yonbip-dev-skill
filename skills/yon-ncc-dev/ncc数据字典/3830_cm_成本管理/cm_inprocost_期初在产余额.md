# |<<

**期初在产余额 (cm_inprocost / nc.vo.cm.inprocost.entity.InproCostHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1482.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cinprocostid | 期初在产余额 | cinprocostid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 7 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 8 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 10 | nnum | 在产量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 12 | cdeptid | 转入部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 13 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | flag | 业务标识 | flag | int |  | 业务标识 (enum) |  | 0=在产成本; |