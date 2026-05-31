# |<<

**物料清单明细快照 (mm_calcbomitem / nc.vo.mmpps.bomsnap.entity.BomItemSnapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3637.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsbomitemid | 物料清单明细快照 | cppsbomitemid | char(36) | √ | 主键 (UFID) |
| 2 | cppsmaterialid | 物料范围主键 | cppsmaterialid | char(36) |  | 字符串 (String) |
| 3 | computecode | 运算号 | computecode | varchar(40) |  | 字符串 (String) |
| 4 | schemeid | 计划方案 | schemeid | varchar(20) |  | 计划方案 (mm_ps) |
| 5 | cbom_bid | 物料清单明细 | cbom_bid | varchar(20) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | vrowno | 行号 | vrowno | varchar(50) |  | 字符串 (String) |
| 10 | cmaterialid | 子项物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | cmaterialvid | 子项物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 15 | vitemversion | 生产BOM版本 | vitemversion | varchar(20) |  | 物料清单 (bd_bom) |
| 16 | vpackversion | 包装BOM版本 | vpackversion | varchar(20) |  | 物料清单 (bd_bom) |
| 17 | nitemnum | 子项主数量 | nitemnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nassitemnum | 子项数量 | nassitemnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ndissipationum | 损耗系数 | ndissipationum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | ileadtimenum | 提前期偏置 | ileadtimenum | int |  | 整数 (Integer) |
| 21 | bcanreplace | 可替代 | bcanreplace | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | cbeginperiod | 生效日期 | cbeginperiod | char(19) |  | 日期(开始) (UFDateBegin) |
| 23 | cendperiod | 失效日期 | cendperiod | char(19) |  | 日期(结束) (UFDateEnd) |
| 24 | bdefault | 默认 | bdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 26 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 27 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 28 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 29 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 30 | bcustommaterial | 客户专用料 | bcustommaterial | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | bprojectmaterial | 项目专用料 | bprojectmaterial | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | ibasenum | 底数 | ibasenum | int |  | 整数 (Integer) |
| 33 | bupint | 向上取整 | bupint | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | freplacetype | 替代类型 | freplacetype | int |  | 替代类型 (replacetype) |  | 1=全部替代; |