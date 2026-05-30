# |<<

**租入归还单表体 (ali_restore_b / nc.vo.ali.lease.restore.LeaseInRestoreBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/66.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leasein_restore_b | 主键 | pk_leasein_restore_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | start_date | 租入日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | return_date | 归还日期 | return_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | end_date | 止租日期 | end_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 9 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 10 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 11 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 12 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 13 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 14 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 15 | pk_material | 物料编码最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 16 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 17 | pk_usedunit_before | 归还前使用权最新版本 | pk_usedunit_before | varchar(20) |  | 组织 (org) |
| 18 | pk_usedunit_before_v | 归还前使用权 | pk_usedunit_before_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 19 | pk_usedunit_after | 使用权最新版本 | pk_usedunit_after | varchar(20) |  | 组织 (org) |
| 20 | pk_usedunit_after_v | 使用权 | pk_usedunit_after_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 21 | pk_usedept_before | 归还前使用部门最新版本 | pk_usedept_before | varchar(20) |  | 组织_部门 (dept) |
| 22 | pk_usedept_before_v | 归还前使用部门 | pk_usedept_before_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 23 | pk_usedept_after | 使用部门最新版本 | pk_usedept_after | varchar(20) |  | 组织_部门 (dept) |
| 24 | pk_usedept_after_v | 使用部门 | pk_usedept_after_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 25 | pk_user_before | 归还前使用人 | pk_user_before | varchar(20) |  | 人员基本信息 (psndoc) |
| 26 | pk_user_after | 使用人 | pk_user_after | varchar(20) |  | 人员基本信息 (psndoc) |
| 27 | pk_location_before | 归还前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 28 | pk_location_after | 位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 29 | pk_used_status_before | 归还前状态 | pk_used_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 30 | pk_used_status_after | 归还后状态 | pk_used_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 31 | status_date_before | 归还前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 32 | status_date_after | 归还后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 33 | pk_jobmngfil_before | 归还前项目 | pk_jobmngfil_before | varchar(20) |  | 项目 (project) |
| 34 | pk_icorg_out | 归还出库组织最新版本 | pk_icorg_out | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 35 | pk_icorg_out_v | 归还出库组织 | pk_icorg_out_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 36 | pk_warehouse_out | 出库仓库 | pk_warehouse_out | varchar(20) |  | 仓库 (stordoc) |
| 37 | stock_out_flag | 出库标识 | stock_out_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 39 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 40 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 41 | src_bill_type | 来源单据类型 | src_bill_type | varchar(20) |  | 字符串 (String) |
| 42 | src_bill_code | 来源单据单据号 | src_bill_code | varchar(40) |  | 字符串 (String) |
| 43 | src_transi_type | 来源交易类型 | src_transi_type | varchar(30) |  | 字符串 (String) |
| 44 | coop_pk_bill_b | 协同来源单据子表主键 | coop_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 45 | coop_bill_type | 协同来源单据类型 | coop_bill_type | varchar(20) |  | 字符串 (String) |
| 46 | coop_transi_type | 协同来源交易类型 | coop_transi_type | varchar(30) |  | 字符串 (String) |
| 47 | coop_bill_code | 协同来源单据单据号 | coop_bill_code | varchar(40) |  | 字符串 (String) |
| 48 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |