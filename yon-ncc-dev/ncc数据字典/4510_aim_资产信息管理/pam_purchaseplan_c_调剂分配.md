# |<<

**调剂分配 (pam_purchaseplan_c / nc.vo.aim.purchaseplan.PurchaseReliefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4294.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_purchaseplan_c | 调剂分配主键 | pk_purchaseplan_c | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 5 | euip_name | 设备名称 | euip_name | varchar(50) |  | 字符串 (String) |
| 6 | spec | 规格 | spec | varchar(50) |  | 字符串 (String) |
| 7 | model | 型号 | model | varchar(50) |  | 字符串 (String) |
| 8 | pk_material | 物料编码版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | pk_applyorg | 申请组织最新版本 | pk_applyorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 11 | pk_applyorg_v | 申请组织 | pk_applyorg_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 12 | pk_applydept | 申请部门最新版本 | pk_applydept | varchar(20) |  | 组织_部门 (dept) |
| 13 | pk_applydept_v | 申请部门 | pk_applydept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 14 | pk_applier | 申请人 | pk_applier | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | need_amount | 需调剂数量 | need_amount | int |  | 整数 (Integer) |
| 16 | pk_relieforg | 调剂组织最新版本 | pk_relieforg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 17 | pk_relieforg_v | 调剂组织 | pk_relieforg_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 18 | relief_amount | 调剂数量 | relief_amount | int |  | 整数 (Integer) |
| 19 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 20 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 21 | showflag | 显示标志 | showflag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | use_date | 预计使用日期 | use_date | char(19) |  | 日期 (UFDate) |
| 23 | techrequire | 技术要求 | techrequire | varchar(200) |  | 字符串 (String) |
| 24 | apply_amount | 申请数量 | apply_amount | int |  | 整数 (Integer) |
| 25 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |