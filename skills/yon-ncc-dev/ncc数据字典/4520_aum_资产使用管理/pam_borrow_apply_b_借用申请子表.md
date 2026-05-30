# |<<

**借用申请子表 (pam_borrow_apply_b / nc.vo.aum.borrow.apply.BorrowApplyBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4229.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_apply_b | 申请单子表主键 | pk_apply_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_material | 物料编码版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | serial_num | 序列号 | serial_num | varchar(80) |  | 字符串 (String) |
| 9 | pk_warehouse | 仓库 | pk_warehouse | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 10 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 11 | quantity | 数量 | quantity | int |  | 整数 (Integer) |
| 12 | close_flag | 关闭 | close_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | expect_start_date | 要求使用日期 | expect_start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 14 | expect_end_date | 计划归还日期 | expect_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 15 | start_date | 领用日期 | start_date | char(19) |  | 日期 (UFDate) |
| 16 | end_date | 实际归还日期 | end_date | char(19) |  | 日期 (UFDate) |
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
| 27 | memo | 技术要求 | memo | varchar(200) |  | 字符串 (String) |
| 28 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 29 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 30 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 31 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 32 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 33 | bill_type_src | 来源单据类型 | bill_type_src | varchar(4) |  | 字符串 (String) |
| 34 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 35 | borrow_quantity | 已借用数量 | borrow_quantity | int |  | 整数 (Integer) |
| 36 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |