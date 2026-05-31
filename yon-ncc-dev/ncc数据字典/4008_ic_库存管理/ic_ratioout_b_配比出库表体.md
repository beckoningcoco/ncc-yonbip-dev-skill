# |<<

**配比出库表体 (ic_ratioout_b / nc.vo.ic.m4d.entity.RatioOutBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2961.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cratiobid | 配比出库表体主键 | cratiobid | varchar(50) | √ | 字符串 (String) |
| 2 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 5 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 6 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 7 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | npickmnum | BOM分解主数量 | npickmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | npickastnum | BOM分解数量 | npickastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ndefinenum | 定额主数量 | ndefinenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | ndefineastnum | 定额数量 | ndefineastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nshouldoutnum | 发料主数量 | nshouldoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nshouldoutastnum | 发料数量 | nshouldoutastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 15 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | vproductbill | 生产订单 | vproductbill | varchar(50) |  | 字符串 (String) |
| 18 | cprocedure | 组装工序 | cprocedure | varchar(50) |  | 字符串 (String) |
| 19 | fissubstitute | 是否有替换件 | fissubstitute | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | fischoiceset | 是否可选件 | fischoiceset | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 22 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) |  | 人员基本信息 (psndoc) |