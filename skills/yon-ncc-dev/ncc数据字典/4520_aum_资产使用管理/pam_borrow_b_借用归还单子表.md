# |<<

**借用归还单子表 (pam_borrow_b / nc.vo.aum.borrow.restore.ReturnBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4230.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_borrow_b | 子表主键 | pk_borrow_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 7 | pk_unit_used_before | 变动前使用权 | pk_unit_used_before | varchar(20) |  | 组织 (org) |
| 8 | pk_unit_used_before_v | 变动前使用权组织版本 | pk_unit_used_before_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | pk_unit_used_after | 变动后使用权组织版本 | pk_unit_used_after | varchar(20) |  | 组织 (org) |
| 10 | pk_unit_used_after_v | 使用权 | pk_unit_used_after_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 11 | pk_usedept_before | 归还前使用部门 | pk_usedept_before | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_usedept_before_v | 归还前使用部门版本 | pk_usedept_before_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | pk_usedept_after | 使用部门版本 | pk_usedept_after | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_usedept_after_v | 使用部门 | pk_usedept_after_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | pk_user_before | 归还前使用人 | pk_user_before | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | pk_user_after | 使用人 | pk_user_after | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | return_date | 归还日期 | return_date | char(19) |  | 日期 (UFDate) |
| 18 | pk_location_before | 归还前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 19 | pk_location_after | 归还位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 20 | pk_icorg_before | 变动前库存组织 | pk_icorg_before | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 21 | pk_icorg_before_v | 变动前库存组织版本信息 | pk_icorg_before_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 22 | pk_icorg_after | 变动后库存组织 | pk_icorg_after | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 23 | pk_icorg_after_v | 库存组织 | pk_icorg_after_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 24 | pk_warehouse_in | 归还仓库 | pk_warehouse_in | varchar(20) |  | 仓库 (stordoc) |
| 25 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 26 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 27 | pk_status_before | 归还前设备状态 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 28 | pk_status_after | 归还后设备状态 | pk_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 29 | status_date_before | 借用前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 30 | status_date_after | 借用后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 31 | stock_in_flag | 出库标志 | stock_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | bill_type_src | 来源单据类型 | bill_type_src | varchar(20) |  | 字符串 (String) |
| 33 | transi_type_src | 来源交易类型 | transi_type_src | varchar(20) |  | 字符串 (String) |
| 34 | pk_transitype_src | 来源交易类型主键 | pk_transitype_src | varchar(50) |  | 字符串 (String) |
| 35 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 36 | bill_code_src | 借用单号 | bill_code_src | varchar(40) |  | 字符串 (String) |
| 37 | pk_bill_b_src | 来源单据表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 38 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 39 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 40 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 41 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 42 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 43 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 44 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 45 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 46 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 47 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
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