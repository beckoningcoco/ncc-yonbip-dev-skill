# |<<

**上期在产成本调整单 (cm_lastadjust / nc.vo.cm.lastadjust.entity.LastadjustHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1486.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | clastadjustid | 上期在产成本调整单 | clastadjustid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 7 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | cauditorid | 审核人 | cauditorid | varchar(20) |  | 用户 (user) |
| 9 | taudittime | 审核日期 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 11 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 12 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 13 | nnum | 在产量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |