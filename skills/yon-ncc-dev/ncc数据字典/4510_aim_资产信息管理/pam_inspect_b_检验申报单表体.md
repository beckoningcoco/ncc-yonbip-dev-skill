# |<<

**检验申报单表体 (pam_inspect_b / nc.vo.aim.inspect.InspectBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4262.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inspect_b | 检验申报表体主键 | pk_inspect_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 7 | pre_text1 | 预置字符1 | pre_text1 | varchar(50) |  | 字符串 (String) |
| 8 | pre_text2 | 预置字符2 | pre_text2 | varchar(50) |  | 字符串 (String) |
| 9 | pre_text3 | 预置字符3 | pre_text3 | varchar(50) |  | 字符串 (String) |
| 10 | pre_text4 | 预置字符4 | pre_text4 | varchar(50) |  | 字符串 (String) |
| 11 | pre_text5 | 预置字符5 | pre_text5 | varchar(50) |  | 字符串 (String) |
| 12 | pre_text6 | 预置字符6 | pre_text6 | varchar(50) |  | 字符串 (String) |
| 13 | pre_text7 | 预置字符7 | pre_text7 | varchar(50) |  | 字符串 (String) |
| 14 | pre_text8 | 预置字符8 | pre_text8 | varchar(50) |  | 字符串 (String) |
| 15 | pre_text9 | 预置字符9 | pre_text9 | varchar(50) |  | 字符串 (String) |
| 16 | pre_text10 | 预置字符10 | pre_text10 | varchar(50) |  | 字符串 (String) |
| 17 | pre_inspect_date | 约检日期 | pre_inspect_date | char(19) |  | 日期 (UFDate) |
| 18 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 19 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 20 | close_flag | 关闭 | close_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | check_period | 检验周期（隐藏） | check_period | varchar(500) |  | 字符串 (String) |
| 22 | check_period_name | 检验周期 | check_period_name | varchar(100) |  | 字符串 (String) |
| 23 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |