# |<<

**资产闲置表体 (pam_reduce_b / nc.vo.aum.unused.UnusedBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4312.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reduce_b | 单据表体ID | pk_reduce_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 7 | pk_location_before | 闲置前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 8 | pk_location_after | 闲置后位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 9 | pk_currency_fi | 财务币种 | pk_currency_fi | varchar(20) |  | 币种 (currtype) |
| 10 | origin_value | 原值 | origin_value | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | accu_dep | 累计折旧 | accu_dep | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | new_value | 净值 | new_value | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pre_devaluate | 减值准备 | pre_devaluate | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | net_money | 净额 | net_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | salvage_rate | 净残值率% | salvage_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | salvage | 净残值 | salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | begin_date | 开始使用日期 | begin_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 18 | service_month | 使用月限 | service_month | int |  | 整数 (Integer) |
| 19 | used_month | 已计提期数 | used_month | int |  | 整数 (Integer) |
| 20 | unused_reason | 闲置原因 | unused_reason | varchar(200) |  | 字符串 (String) |
| 21 | confirm_flag | 确认标记 | confirm_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | pk_confirmer | 确认人 | pk_confirmer | varchar(20) |  | 用户 (user) |
| 23 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 24 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 25 | close_flag | 关闭 | close_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | pk_status_before | 变动前设备状态 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 27 | pk_status_after | 变动后设备状态 | pk_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 28 | status_date_before | 变动前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 29 | status_date_after | 变动后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 30 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 31 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 32 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 33 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 34 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 35 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 36 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 37 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 38 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 39 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 40 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |