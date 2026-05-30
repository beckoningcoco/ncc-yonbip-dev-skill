# |<<

**配比出库表头 (ic_ratio_h / nc.vo.ic.m4d.entity.RatioOutHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2960.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cratiohid | 配比出库主属性 | cratiohid | char(20) | √ | 字符串 (String) |
| 2 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 5 | cmaterialoid | BOM最新版本 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 产成品 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | version | BOM版本 | version | varchar(20) |  | 物料清单 (bd_bom) |
| 8 | vtrantypecode | 出入库类型 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 9 | nmanunum | 生产数量 | nmanunum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 11 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 12 | vproductbill | 生产订单 | vproductbill | varchar(50) |  | 字符串 (String) |
| 13 | fisoutflag | 是否生成实收发单据 | fisoutflag | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | ctrantypeid | 出入库类型主键 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |