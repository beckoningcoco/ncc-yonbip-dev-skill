# |<<

**其他出入库消耗单明细 (cm_iastuff_b / nc.vo.cm.iastuff.entity.IastuffItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1479.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ciastuff_bid | 其他出入库消耗单明细 | ciastuff_bid | char(20) | √ | 主键 (UFID) |
| 2 | ciastuffid | 其他出入库消耗单 | ciastuffid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | cperiod | 会计期间 | cperiod | varchar(20) |  | 字符串 (String) |
| 7 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cmeasdocid | 计量单位 | cmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 11 | nnum | 数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | csourcebillid | 来源单据 | csourcebillid | char(20) |  | 主键 (UFID) |
| 15 | vsourcecode | 来源单据号 | vsourcecode | varchar(40) |  | 字符串 (String) |
| 16 | bcounted | 已计算 | bcounted | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 18 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 19 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 20 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | imodifytype | 子项修改类型 | imodifytype | int |  | 子项修改类型 (ItemModifyTypeEnum) |  | 1=循环互耗驱动; |