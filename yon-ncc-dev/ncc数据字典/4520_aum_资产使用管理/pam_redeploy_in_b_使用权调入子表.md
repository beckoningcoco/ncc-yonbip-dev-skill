# |<<

**使用权调入子表 (pam_redeploy_in_b / nc.vo.aum.deploy.usedin.DeployUsedInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4300.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_redeploy_in_b | 使用权调出子表主键 | pk_redeploy_in_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 3 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 4 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 5 | pk_addreducestyle | 调拨方式 | pk_addreducestyle | varchar(20) |  | 增减方式 (AddreduceStyleVO) |
| 6 | pk_reason | 调拨原因 | pk_reason | varchar(20) |  | 原因 (reason) |
| 7 | bill_code_src | 源单据号 | bill_code_src | varchar(40) |  | 字符串 (String) |
| 8 | bill_type_src | 源单据类型 | bill_type_src | varchar(20) |  | 字符串 (String) |
| 9 | pk_bill_src | 源单据主表主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 10 | pk_bill_b_src | 来源单据表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 11 | transi_type_src | 源交易类型 | transi_type_src | varchar(20) |  | 字符串 (String) |
| 12 | pk_usedunit_out | 调出使用权最新版本 | pk_usedunit_out | varchar(20) |  | 组织 (org) |
| 13 | pk_usedunit_in | 调入使用权最新版本 | pk_usedunit_in | varchar(20) |  | 组织 (org) |
| 14 | pk_usedept_before | 调拨前使用部门最新版本 | pk_usedept_before | varchar(20) |  | 组织_部门 (dept) |
| 15 | pk_usedept_after | 调入使用部门最新版本 | pk_usedept_after | varchar(20) |  | 组织_部门 (dept) |
| 16 | pk_user_before | 调出责任人 | pk_user_before | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | pk_user_after | 调入责任人 | pk_user_after | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | accu_dep_before | 调拨前累计折旧 | accu_dep_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | accu_dep | 累计折旧 | accu_dep | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | dep_amount_before | 调拨前月折旧额 | dep_amount_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | dep_amount | 月折旧额 | dep_amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | net_money_before | 调拨前净额 | net_money_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | net_money | 净额 | net_money | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | new_value_before | 调拨前净值 | new_value_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | new_value | 净值 | new_value | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | origin_value_before | 调拨前原值 | origin_value_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | origin_value | 原值 | origin_value | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 29 | pk_location_before | 调拨前位置 | pk_location_before | varchar(20) |  | 位置 (location) |
| 30 | pk_location_after | 调入位置 | pk_location_after | varchar(20) |  | 位置 (location) |
| 31 | pk_warehouse_in | 调入仓库 | pk_warehouse_in | varchar(20) |  | 仓库 (stordoc) |
| 32 | pk_warehouse_out | 调出仓库 | pk_warehouse_out | varchar(20) |  | 仓库 (stordoc) |
| 33 | pre_devaluate | 减值准备 | pre_devaluate | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | pre_devaluate_before | 调拨前减值准备 | pre_devaluate_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | salvage_before | 调拨前净残值 | salvage_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | salvage | 净残值 | salvage | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | begin_date_before | 调拨前开始使用日期 | begin_date_before | char(19) |  | 日期 (UFDate) |
| 38 | begin_date | 开始使用日期 | begin_date | char(19) |  | 日期 (UFDate) |
| 39 | salvage_rate | 净残值率% | salvage_rate | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | salvage_rate_before | 调拨前净残值率% | salvage_rate_before | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | service_month | 使用月限 | service_month | int |  | 整数 (Integer) |
| 42 | service_month_before | 调拨前使用月限 | service_month_before | int |  | 整数 (Integer) |
| 43 | used_month | 已计提期数 | used_month | int |  | 整数 (Integer) |
| 44 | used_month_before | 调拨前已计提期数 | used_month_before | int |  | 整数 (Integer) |
| 45 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 46 | pk_icorg_in | 调入库存组织最新版本 | pk_icorg_in | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 47 | pk_icorg_out | 调出库存组织最新版本 | pk_icorg_out | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 48 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 49 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 50 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 51 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 52 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 53 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 54 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 55 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 56 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 57 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 58 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 59 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 60 | pk_usedunit_out_v | 调出使用权 | pk_usedunit_out_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 61 | pk_usedunit_in_v | 调入使用权 | pk_usedunit_in_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 62 | pk_icorg_out_v | 调出库存组织 | pk_icorg_out_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 63 | pk_icorg_in_v | 调入库存组织 | pk_icorg_in_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 64 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 65 | pk_usedept_before_v | 调拨前使用部门 | pk_usedept_before_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 66 | pk_usedept_after_v | 调入使用部门 | pk_usedept_after_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 67 | pk_profitcenter_in_v | 调入利润中心 | pk_profitcenter_in_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 68 | pk_profitcenter_out_v | 调出利润中心 | pk_profitcenter_out_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 69 | pk_profitcenter_in | 调入利润中心最新版本 | pk_profitcenter_in | varchar(20) |  | 利润中心 (profitcenter) |
| 70 | pk_profitcenter_out | 调出利润中心最新版本 | pk_profitcenter_out | varchar(20) |  | 利润中心 (profitcenter) |
| 71 | pk_costcenter_in_v | 调入成本中心 | pk_costcenter_in_v | varchar(20) |  | 成本中心版本化 (resacostcenterv) |
| 72 | pk_costcenter_out_v | 调出成本中心 | pk_costcenter_out_v | varchar(20) |  | 成本中心版本化 (resacostcenterv) |
| 73 | pk_costcenter_in | 调入成本中心最新版本 | pk_costcenter_in | varchar(20) |  | 成本中心 (resacostcenter) |
| 74 | pk_costcenter_out | 调出成本中心最新版本 | pk_costcenter_out | varchar(20) |  | 成本中心 (resacostcenter) |
| 75 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 76 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 77 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 78 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 79 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 80 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 81 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 82 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 83 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 84 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 85 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 86 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 87 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 88 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 89 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 90 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 91 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 92 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 93 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 94 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |