# |<<

**领用表体 (pam_assign_b / nc.vo.aum.assign.used.AssignBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assign_b | 子表主键 | pk_assign_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 使用管理组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 3 | pk_org | 使用管理组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 8 | alter_reason | 变动原因 | alter_reason | varchar(80) |  | 字符串 (String) |
| 9 | alter_flag | 变动标志 | alter_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_unit_used_before | 变动前使用权组织版本 | pk_unit_used_before | varchar(20) |  | 组织 (org) |
| 11 | pk_unit_used_before_v | 变动前使用权 | pk_unit_used_before_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 12 | pk_unit_used_after | 变动后使用权组织版本 | pk_unit_used_after | varchar(20) |  | 组织 (org) |
| 13 | pk_unit_used_after_v | 使用权 | pk_unit_used_after_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 14 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 15 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 16 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 17 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 18 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 19 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 20 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 21 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 22 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 23 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 24 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 25 | alter_status_date | 变动前状态日期 | alter_status_date | char(19) |  | 日期 (UFDate) |
| 26 | pk_warehouse_out | 仓库主键 | pk_warehouse_out | varchar(20) |  | 仓库 (stordoc) |
| 27 | pk_user_after | 使用人 | pk_user_after | varchar(20) |  | 人员基本信息 (psndoc) |
| 28 | pk_user_before | 变动前使用人 | pk_user_before | varchar(20) |  | 人员基本信息 (psndoc) |
| 29 | pk_usedept_after | 使用部门组织版本 | pk_usedept_after | varchar(20) |  | 组织_部门 (dept) |
| 30 | pk_usedept_after_v | 使用部门 | pk_usedept_after_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 31 | pk_usedept_before | 变动前使用部门 | pk_usedept_before | varchar(20) |  | 组织_部门 (dept) |
| 32 | pk_usedept_before_v | 变动前使用部门组织多版本 | pk_usedept_before_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 33 | bill_type_src | 来源单据类型 | bill_type_src | varchar(20) |  | 字符串 (String) |
| 34 | transi_type_src | 来源交易类型 | transi_type_src | varchar(20) |  | 字符串 (String) |
| 35 | pk_transitype_src | 来源交易类型主键 | pk_transitype_src | varchar(20) |  | 字符串 (String) |
| 36 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 37 | bill_code_src | 申请单号 | bill_code_src | varchar(40) |  | 字符串 (String) |
| 38 | pk_bill_b_src | 来源单据表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 39 | stock_out_flag | 出库标志 | stock_out_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | expect_end_date | 计划归还日期 | expect_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 41 | stock_in_flag | 入库标记 | stock_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | pk_location_before | 变动前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 43 | pk_location_after | 使用位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 44 | pk_status_before | 变动前设备状态 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 45 | pk_status_after | 变动后设备状态 | pk_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 46 | return_flag | 归还标记 | return_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 47 | return_date | 实际归还日期 | return_date | char(19) |  | 日期 (UFDate) |
| 48 | status_date_before | 变化前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 49 | status_date_after | 变化后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 50 | return_bill_code | 归还单号 | return_bill_code | varchar(50) |  | 字符串 (String) |
| 51 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 52 | pk_material | 物料编码版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 53 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 54 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 55 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 56 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 57 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 76 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |