# |<<

**标准成本子表材料级 (sca_matprice_item / nc.vo.sca.matprice.entity.MatpriceItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5059.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matprice_item | 标准成本子表材料级主键 | pk_matprice_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_matprice | 标准成本主键 | pk_matprice | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | pk_costtype | 成本类型 | pk_costtype | varchar(20) |  | 成本类型 (mapub_costtype) |
| 7 | cmaterialid | 材料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 材料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 11 | nnumber | 数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nprice | 单价 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | bsubtype | 是否下阶 | bsubtype | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 16 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 17 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 18 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 20 | thiscost | 本层成本 | thiscost | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | upcost | 上层成本 | upcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | materialhashkey | 物料哈希值 | materialhashkey | int |  | 整数 (Integer) |
| 23 | materialinfo | 物料信息 | materialinfo | varchar(1450) |  | 字符串 (String) |
| 24 | pricesource | 取价来源 | pricesource | int |  | 价格来源 (StdProdPriceSourceEnum) |  | 1=上层卷积; |