# |<<

**期初暂估单明细 (po_initialest_b / nc.vo.pu.m4t.entity.InitialEstItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initialest_b | 期初暂估单明细 | pk_initialest_b | varchar(20) | √ | 字符串 (String) |
| 2 | pk_org | 财务组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_apfinanceorg | 应付组织最新版本 | pk_apfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_apfinanceorg_v | 应付组织 | pk_apfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 8 | pk_material | 物料版本 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 15 | ftaxtypeflag | 扣税类别 | ftaxtypeflag | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |