# |<<

**调拨订单修订子实体 (to_billhistory_b / nc.vo.to.m5x.entity.BillHistoryItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5785.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 调拨订单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 调出库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | cinstordocid | 调入仓库 | cinstordocid | varchar(20) |  | 仓库 (stordoc) |
| 6 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 7 | ctoutstordocid | 出货仓库 | ctoutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 8 | cinspaceid | 调入货位 | cinspaceid | varchar(20) |  | 货位 (rack) |
| 9 | coutspaceid | 调出货位 | coutspaceid | varchar(20) |  | 货位 (rack) |
| 10 | ctoutspaceid | 出货货位 | ctoutspaceid | varchar(20) |  | 货位 (rack) |
| 11 | cindeptid | 调入部门最新版本 | cindeptid | varchar(20) |  | 组织_部门 (dept) |
| 12 | cindeptvid | 调入部门 | cindeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | cinpsnid | 调入业务员 | cinpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 15 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 16 | pk_batchcode | 批次档案 | pk_batchcode | varchar(20) |  | 字符串 (String) |
| 17 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 18 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 19 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 20 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 21 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 22 | nweight | 物料重量 | nweight | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nvolume | 物料体积 | nvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | npiece | 件数 | npiece | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 26 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 27 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 28 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |