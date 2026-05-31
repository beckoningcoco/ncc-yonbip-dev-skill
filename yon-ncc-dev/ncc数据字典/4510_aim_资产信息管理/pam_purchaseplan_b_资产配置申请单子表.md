# |<<

**资产配置申请单子表 (pam_purchaseplan_b / nc.vo.aim.purchaseplan.PurchaseplanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4293.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_purchaseplan_b | 资产配置申请单子表主键 | pk_purchaseplan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 7 | assetname | 设备名称 | assetname | varchar(50) |  | 字符串 (String) |
| 8 | spec | 规格 | spec | varchar(50) |  | 字符串 (String) |
| 9 | model | 型号 | model | varchar(50) |  | 字符串 (String) |
| 10 | apply_amount | 申请数量 | apply_amount | int |  | 整数 (Integer) |  | [0 , ] |
| 11 | relieve_amount | 调剂数量 | relieve_amount | int |  | 整数 (Integer) |  | [0 , ] |
| 12 | purchase_amount | 购置数量 | purchase_amount | int |  | 整数 (Integer) |  | [0 , ] |
| 13 | get_amount | 领用数量 | get_amount | int |  | 整数 (Integer) |  | [0 , ] |
| 14 | couldget_amount | 自有数量 | couldget_amount | int |  | 整数 (Integer) |  | [0 , ] |
| 15 | catrelieve_amount | 类别剩余数量 | catrelieve_amount | int |  | 整数 (Integer) |  | [0 , ] |
| 16 | catetotal_amount | 可调剂数量 | catetotal_amount | int |  | 整数 (Integer) |  | [0 , ] |
| 17 | pk_applyorg | 申请组织最新版本 | pk_applyorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 18 | pk_applyorg_v | 申请组织 | pk_applyorg_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 19 | pk_applydept | 申请部门最新版本 | pk_applydept | varchar(20) |  | 组织_部门 (dept) |
| 20 | pk_applydept_v | 申请部门 | pk_applydept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 21 | pk_applier | 申请人 | pk_applier | varchar(20) |  | 人员基本信息 (psndoc) |
| 22 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 23 | pk_material | 物料编码版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 24 | pk_icorg_v | 库存组织 | pk_icorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 25 | pk_icorg | 库存组织最新版本 | pk_icorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 26 | techrequire | 技术要求 | techrequire | varchar(200) |  | 字符串 (String) |
| 27 | use_date | 预计使用日期 | use_date | char(19) |  | 日期 (UFDate) |
| 28 | praybillflag | 推请购单标志 | praybillflag | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 30 | unitid | 单位 | unitid | varchar(20) |  | 计量单位 (measdoc) |
| 31 | pk_supplier | 建议供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 32 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |