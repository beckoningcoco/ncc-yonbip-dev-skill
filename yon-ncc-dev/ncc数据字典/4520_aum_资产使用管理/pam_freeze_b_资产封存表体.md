# |<<

**资产封存表体 (pam_freeze_b / nc.vo.aum.freeze.FreezeBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4260.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freeze_b | 子表主键 | pk_freeze_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_icorg | 库存组织最新版本 | pk_icorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_icorg_v | 库存组织 | pk_icorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 8 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 9 | pk_status_before | 变动前状态 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 10 | pk_status_after | 变动后状态 | pk_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 11 | status_date_before | 变动前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 12 | status_date_after | 变动后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 13 | ft_date | 预计启封日期 | ft_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 14 | pk_warehouse_in | 封存后入库 | pk_warehouse_in | varchar(20) |  | 仓库 (stordoc) |
| 15 | ft_reason | 封存原因 | ft_reason | varchar(20) |  | 原因 (reason) |
| 16 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 17 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 18 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 19 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 20 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 21 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 22 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 23 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 24 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 25 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 26 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 27 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 28 | pre_text11 | 预置字符11 | pre_text11 | varchar(128) |  | 字符串 (String) |
| 29 | pre_text12 | 预置字符12 | pre_text12 | varchar(128) |  | 字符串 (String) |
| 30 | pre_text13 | 预置字符13 | pre_text13 | varchar(128) |  | 字符串 (String) |
| 31 | pre_text14 | 预置字符14 | pre_text14 | varchar(128) |  | 字符串 (String) |
| 32 | pre_text15 | 预置字符15 | pre_text15 | varchar(128) |  | 字符串 (String) |
| 33 | pre_text16 | 预置字符16 | pre_text16 | varchar(128) |  | 字符串 (String) |
| 34 | pre_text17 | 预置字符17 | pre_text17 | varchar(128) |  | 字符串 (String) |
| 35 | pre_text18 | 预置字符18 | pre_text18 | varchar(128) |  | 字符串 (String) |
| 36 | pre_text19 | 预置字符19 | pre_text19 | varchar(128) |  | 字符串 (String) |
| 37 | pre_text20 | 预置字符20 | pre_text20 | varchar(128) |  | 字符串 (String) |
| 38 | stock_in_flag | 入库标记 | stock_in_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | thaw_flag | 启封标记 | thaw_flag | char(1) |  | 布尔类型 (UFBoolean) |
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