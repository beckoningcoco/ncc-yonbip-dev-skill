# |<<

**捐赠单明细 (pam_reduce_b / nc.vo.aum.donate.DonateBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4313.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reduce_b | 捐赠单明细ID | pk_reduce_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 7 | pk_addreducestyle | 捐赠方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 8 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 10 | status_date_before | 变动前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 11 | status_date_after | 变动后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 12 | pk_status_before | 变动前设备状态 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 13 | pk_status_after | 变动后设备状态 | pk_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 14 | pk_warehouse_out | 出库仓库 | pk_warehouse_out | varchar(20) |  | 仓库 (stordoc) |
| 15 | stock_out_flag | 出库标记 | stock_out_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | stock_in_flag | 入库标记 | stock_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 18 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 19 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 20 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 21 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 22 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 23 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 24 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 25 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 26 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 27 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 28 | pk_bill_b_src | 来源单据表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 29 | transi_type_src | 来源交易类型 | transi_type_src | varchar(20) |  | 字符串 (String) |
| 30 | pk_transitype_src | 来源交易类型主键 | pk_transitype_src | varchar(20) |  | 字符串 (String) |
| 31 | bill_type_src | 来源单据类型 | bill_type_src | varchar(4) |  | 字符串 (String) |
| 32 | bill_code_src | 来源单据号 | bill_code_src | varchar(20) |  | 字符串 (String) |
| 33 | pk_location_before | 捐赠前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 34 | pk_location_after | 捐赠后位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 35 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |