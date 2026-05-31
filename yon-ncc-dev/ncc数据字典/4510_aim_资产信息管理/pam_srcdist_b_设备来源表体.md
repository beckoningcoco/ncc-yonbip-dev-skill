# |<<

**设备来源表体 (pam_srcdist_b / nc.vo.aim.srcdist.SrcDistBodyVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4327.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srcdist_b | 来源去向ID | pk_srcdist_b | char(20) | √ | 主键 (UFID) |
| 2 | bill_code_src | 设备来源号 | bill_code_src | varchar(40) |  | 字符串 (String) |
| 3 | pk_org_dist | 目的组织 | pk_org_dist | varchar(20) |  | 组织 (org) |
| 4 | pk_org_src | 来源组织 | pk_org_src | varchar(20) |  | 组织 (org) |
| 5 | pk_group_src | 来源集团 | pk_group_src | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_group_dist | 目的集团 | pk_group_dist | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 8 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 9 | pk_ownerorg | 货主管理组织最新版本 | pk_ownerorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 10 | pk_ownerorg_v | 货主管理组织 | pk_ownerorg_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 11 | pk_usedorg | 使用管理组织最新版本 | pk_usedorg | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 12 | pk_usedorg_v | 使用管理组织 | pk_usedorg_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 13 | pk_ownerunit | 货主最新版本 | pk_ownerunit | varchar(20) |  | 组织 (org) |
| 14 | pk_ownerunit_v | 货主 | pk_ownerunit_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 15 | pk_usedunit | 使用权最新版本 | pk_usedunit | varchar(20) |  | 组织 (org) |
| 16 | pk_usedunit_v | 使用权 | pk_usedunit_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 17 | pk_mngdept | 管理部门最新版本 | pk_mngdept | varchar(20) |  | 组织_部门 (dept) |
| 18 | pk_mngdept_v | 管理部门 | pk_mngdept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 19 | pk_manager | 管理人 | pk_manager | varchar(20) |  | 人员基本信息 (psndoc) |
| 20 | pk_usedept | 使用部门最新版本 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 21 | pk_usedept_v | 使用部门 | pk_usedept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 22 | pk_user | 使用人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 23 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 24 | pk_equip | 设备ID | pk_equip | varchar(20) |  | 字符串 (String) |
| 25 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 26 | equip_name | 设备名称 | equip_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 27 | spec | 规格 | spec | varchar(80) |  | 字符串 (String) |
| 28 | model | 型号 | model | varchar(80) |  | 字符串 (String) |
| 29 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 30 | pk_used_status | 设备状态 | pk_used_status | varchar(20) |  | 设备状态 (StatusVO) |
| 31 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 32 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 33 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 34 | pk_purorg | 采购组织最新版本 | pk_purorg | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 35 | pk_purorg_v | 采购组织 | pk_purorg_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 36 | pk_icorg | 库存组织最新版本 | pk_icorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 37 | pk_icorg_v | 库存组织 | pk_icorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 38 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 39 | pk_material | 物料基本档案最新版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 40 | pk_material_v | 物料基本档案 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 41 | serial_num | 序列号 | serial_num | varchar(80) |  | 字符串 (String) |
| 42 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 43 | pk_consignee_depot | 收货仓库 | pk_consignee_depot | varchar(20) |  | 仓库 (stordoc) |
| 44 | stock_in_date | 入库日期 | stock_in_date | char(19) |  | 日期 (UFDate) |
| 45 | purc_price_tax | 含税价格 | purc_price_tax | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | purc_price | 无税价格 | purc_price | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | tax | 税金 | tax | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | pk_currency_inst | 安装调试币种 | pk_currency_inst | varchar(20) |  | 币种 (currtype) |
| 49 | install_fee | 安装调试费用 | install_fee | decimal(28, 8) |  | 金额 (UFMoney) |
| 50 | purc_price_tax_group | 集团本位币含税价格 | purc_price_tax_group | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | purc_price_group | 集团本位币无税价格 | purc_price_group | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | tax_group | 集团本位币税金 | tax_group | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | purc_price_tax_global | 全局本位币含税价格 | purc_price_tax_global | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | purc_price_global | 全局本位币无税价格 | purc_price_global | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | tax_global | 全局本位币税金 | tax_global | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | pk_currency_purc | 采购币种 | pk_currency_purc | varchar(20) |  | 币种 (currtype) |
| 57 | revalued_amount | 评估值 | revalued_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | quantity | 数量 | quantity | int |  | 整数 (Integer) |
| 59 | bar_code | 条形码 | bar_code | varchar(80) |  | 字符串 (String) |
| 60 | pk_bill_b_src | 来源单据表体ID | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 61 | sourceid | 来源标识 | sourceid | varchar(20) |  | 字符串 (String) |
| 62 | pk_usedept_src | 来源部门最新版本 | pk_usedept_src | varchar(20) |  | 组织_部门 (dept) |
| 63 | pk_usedept_src_v | 来源使用部门 | pk_usedept_src_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 64 | pk_currenty_src | 来源币种ID | pk_currenty_src | varchar(20) |  | 币种 (currtype) |
| 65 | pk_bill_b_dist | 去向单据表体ID | pk_bill_b_dist | varchar(20) |  | 字符串 (String) |
| 66 | pk_usedept_dist | 去向部门最新版本 | pk_usedept_dist | varchar(20) |  | 组织_部门 (dept) |
| 67 | pk_usedept_dist_v | 去向使用部门 | pk_usedept_dist_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 68 | pk_currenty_dist | 去向币种 | pk_currenty_dist | varchar(20) |  | 币种 (currtype) |
| 69 | pk_priority | 关键程度 | pk_priority | varchar(20) |  | 设备关键程度 (PriorityVO) |
| 70 | pk_capital_source | 资金来源 | pk_capital_source | varchar(20) |  | 资金来源 (CapitalSourceVO) |
| 71 | start_used_date | 投用日期 | start_used_date | char(19) |  | 日期 (UFDate) |
| 72 | facturer_name | 制造商 | facturer_name | varchar(80) |  | 字符串 (String) |
| 73 | precoding | 出厂编码 | precoding | varchar(80) |  | 字符串 (String) |
| 74 | pk_currency_tfr | 项目币种 | pk_currency_tfr | varchar(20) |  | 币种 (currtype) |
| 75 | transfer_price | 入账价值 | transfer_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 76 | fa_flag | 固定资产核算 | fa_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 77 | acceptflag | 验收标志 | acceptflag | char(1) |  | 布尔类型 (UFBoolean) |
| 78 | pk_project_src | 来源项目 | pk_project_src | varchar(20) |  | 项目 (project) |
| 79 | product_code | 项目产出物编码 | product_code | varchar(50) |  | 字符串 (String) |
| 80 | equip_flag | 已生成卡片 | equip_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 81 | pk_currency_tax | 税金币种 | pk_currency_tax | varchar(20) |  | 币种 (currtype) |
| 82 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 83 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 84 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 85 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 86 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 87 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 88 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 89 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 90 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 91 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 92 | pk_serialno | 序列号主键 | pk_serialno | varchar(20) |  | 字符串 (String) |
| 93 | pk_message | 业务消息主键 | pk_message | varchar(20) |  | 字符串 (String) |
| 94 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 95 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 96 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 97 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 98 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 99 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 100 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 101 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 102 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 103 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 104 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 105 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 106 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 107 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 108 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 109 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 110 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 111 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 112 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 113 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 114 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 115 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 116 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 117 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 118 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 119 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 120 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 121 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 122 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 123 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 124 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 125 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 126 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 127 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 128 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 129 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 130 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 131 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 132 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 133 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 134 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 135 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 136 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 137 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 138 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 139 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 140 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 141 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 142 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 143 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |