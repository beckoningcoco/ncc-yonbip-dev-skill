# |<<

**处置单表体 (pam_reduce_b / nc.vo.aum.sale.SaleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4310.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reduce_b | 单据表体ID | pk_reduce_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 7 | pk_currency_fi | 财务币种 | pk_currency_fi | varchar(20) |  | 币种 (currtype) |
| 8 | origin_value | 原值 | origin_value | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | accu_dep | 累计折旧 | accu_dep | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | new_value | 净值 | new_value | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | salvage_rate | 净残值率% | salvage_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | net_money | 净额 | net_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pre_devaluate | 减值准备 | pre_devaluate | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | salvage | 净残值 | salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | begin_date | 开始使用日期 | begin_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 16 | used_month | 已计提期数 | used_month | int |  | 整数 (Integer) |
| 17 | service_month | 使用月限 | service_month | int |  | 整数 (Integer) |
| 18 | pk_addreducestyle | 处置方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 19 | pk_reason | 处置原因 | pk_reason | varchar(20) |  | 原因 (reason) |
| 20 | purgerevenue | 处置收入 | purgerevenue | decimal(28, 4) |  | 金额 (UFMoney) |
| 21 | purgerevenue_group | 集团本位币处置收入 | purgerevenue_group | decimal(28, 4) |  | 金额 (UFMoney) |
| 22 | purgerevenue_global | 全局本位币处置收入 | purgerevenue_global | decimal(28, 4) |  | 金额 (UFMoney) |
| 23 | purgefee | 处置支出 | purgefee | decimal(28, 4) |  | 金额 (UFMoney) |
| 24 | purgefee_group | 集团本位币处置支出 | purgefee_group | decimal(28, 4) |  | 金额 (UFMoney) |
| 25 | purgefee_global | 全局本位币处置支出 | purgefee_global | decimal(28, 4) |  | 金额 (UFMoney) |
| 26 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 27 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 28 | pk_status_before | 变动前状态 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 29 | pk_status_after | 变动后状态 | pk_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 30 | status_date_before | 变化前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 31 | status_date_after | 变化后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 32 | pk_warehouse_out | 出库仓库 | pk_warehouse_out | varchar(20) |  | 仓库 (stordoc) |
| 33 | stock_out_flag | 出库标记 | stock_out_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 34 | stock_in_flag | 入库标记 | stock_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | receivable_flag | 应收标记 | receivable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 36 | payable_flag | 应付标记 | payable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 38 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 39 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 40 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 41 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 42 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 43 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 44 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 45 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 46 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 47 | bill_type_src | 来源单据类型 | bill_type_src | varchar(4) |  | 字符串 (String) |
| 48 | transi_type_src | 来源交易类型 | transi_type_src | varchar(20) |  | 字符串 (String) |
| 49 | pk_transitype_src | 来源交易类型主键 | pk_transitype_src | varchar(20) |  | 字符串 (String) |
| 50 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 51 | pk_bill_b_src | 来源单据表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 52 | bill_code_src | 来源单据号 | bill_code_src | varchar(20) |  | 字符串 (String) |
| 53 | pk_location_before | 处置前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 54 | pk_location_after | 处置后位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 55 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |