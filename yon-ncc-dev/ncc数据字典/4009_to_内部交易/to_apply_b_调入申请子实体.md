# |<<

**调入申请子实体 (to_apply_b / nc.vo.to.m5a.entity.TransInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5781.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 调入申请明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 调入库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | cinstordocid | 调入仓库 | cinstordocid | varchar(20) |  | 仓库 (stordoc) |
| 6 | cinpcid | 收货利润中心 | cinpcid | varchar(20) |  | 利润中心 (profitcenter) |
| 7 | cinpcvid | 收货利润中心版本 | cinpcvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 8 | cindeptid | 调入部门 | cindeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cindeptvid | 调入部门版本 | cindeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | cinpsnid | 调入业务员 | cinpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 11 | coutstockorgid | 调出库存组织 | coutstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | coutstockorgvid | 调出库存组织版本 | coutstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 13 | coutstordocid | 调出仓库 | coutstordocid | varchar(20) |  | 仓库 (stordoc) |
| 14 | coutpcvid | 发货利润中心版本 | coutpcvid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 15 | coutpcid | 发货利润中心 | coutpcid | varchar(20) |  | 利润中心 (profitcenter) |
| 16 | coutdeptid | 调出部门 | coutdeptid | varchar(20) |  | 组织_部门 (dept) |
| 17 | coutdeptvid | 调出部门版本 | coutdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 18 | coutpsnid | 调出业务员 | coutpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 20 | cinventoryvid | 物料版本 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 21 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 22 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 23 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 25 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |