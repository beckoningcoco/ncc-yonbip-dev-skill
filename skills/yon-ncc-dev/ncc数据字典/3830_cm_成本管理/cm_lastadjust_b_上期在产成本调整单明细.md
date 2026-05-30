# |<<

**上期在产成本调整单明细 (cm_lastadjust_b / nc.vo.cm.lastadjust.entity.LastadjustItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1487.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | clastadjust_bid | 上期在产成本调整单明细 | clastadjust_bid | char(20) | √ | 主键 (UFID) |
| 2 | clastadjustid | 上期在产成本调整单 | clastadjustid | char(20) | √ | 主键 (UFID) |
| 3 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 4 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nprice | 实际单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nmoney | 实际金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ccostcenterid | 转入成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 10 | ccostobjectid | 转入成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 11 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 13 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 14 | vnote | 备注 | vnote | char(20) |  | 主键 (UFID) |
| 15 | cdeptid | 转入部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | istatus | 状态 | istatus | int |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |