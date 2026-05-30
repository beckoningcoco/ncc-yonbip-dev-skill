# |<<

**约当产量表 (cm_appronum / nc.vo.cm.costdataclose.entity.AppronumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1449.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cequivoutputid | 约当产量表 | cequivoutputid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂（多版本） | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 8 | cmaincostobjid | 联副产品主成本对象 | cmaincostobjid | varchar(20) |  | 成本对象 (cm_costobject) |
| 9 | iequivtype | 约当类型 | iequivtype | int |  | 约当类型 (equivrateEnum) |  | 1=在产; |