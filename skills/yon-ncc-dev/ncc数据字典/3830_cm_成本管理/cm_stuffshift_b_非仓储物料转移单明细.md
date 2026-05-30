# |<<

**非仓储物料转移单明细 (cm_stuffshift_b / nc.vo.cm.stuffshift.entity.StuffShiftItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1513.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstuffshift_bid | 非仓储物料转移单明细 | cstuffshift_bid | char(20) | √ | 主键 (UFID) |
| 2 | cstuffshiftid | 非仓储物料转移单 | cstuffshiftid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | pk_factory | 转入工厂最新版本 | pk_factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 7 | pk_factory_v | 转入工厂 | pk_factory_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 8 | cdeptid | 转入部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | ccostcenterid | 转入成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | ccostobjectid | 转入成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 11 | nnum | 数量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | cdifffactoryid | 差异负担工厂最新版本 | cdifffactoryid | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 13 | cdifffactoryid_v | 差异负担工厂 | cdifffactoryid_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 14 | cdiffdeptid | 差异负担部门 | cdiffdeptid | varchar(20) |  | 组织_部门 (dept) |
| 15 | cdiffcenterid | 差异负担成本中心 | cdiffcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 16 | isfzfw | 辅助服务 | isfzfw | char(1) |  | 布尔类型 (UFBoolean) | N |
| 17 | csourcebill_bid | 来源单据明细 | csourcebill_bid | char(20) |  | 主键 (UFID) |
| 18 | csourcebillid | 来源单据 | csourcebillid | char(20) |  | 主键 (UFID) |
| 19 | istatus | 状态 | istatus | int |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |