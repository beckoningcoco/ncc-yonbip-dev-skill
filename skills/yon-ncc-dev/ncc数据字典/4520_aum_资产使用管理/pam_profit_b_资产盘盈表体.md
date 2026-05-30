# |<<

**资产盘盈表体 (pam_profit_b / nc.vo.aum.profit.ProfitBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4291.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_profit_b | 盘盈单子表主键 | pk_profit_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | pk_equip | 设备编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 4 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 5 | bar_code | 条型码 | bar_code | varchar(40) |  | 字符串 (String) |
| 6 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 7 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 8 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 9 | pk_mandept | 管理部门 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_mandept_v | 管理部门版本信息 | pk_mandept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | pk_org_use | 使用权最新版本 | pk_org_use | varchar(20) |  | 组织 (org) |
| 12 | pk_org_use_v | 使用权 | pk_org_use_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 13 | pk_usedept | 使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 14 | pk_usedept_v | 使用部门版本信息 | pk_usedept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | pk_user | 责任人 | pk_user | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | pk_equip_status | 设备状态 | pk_equip_status | varchar(20) |  | 设备状态 (StatusVO) |
| 17 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 18 | dealresult | 处理结果 | dealresult | varchar(200) |  | 字符串 (String) |
| 19 | pk_checker | 盘点人 | pk_checker | varchar(50) |  | 字符串 (String) |
| 20 | inventory_date | 盘点日期 | inventory_date | char(19) |  | 日期 (UFDate) |
| 21 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 22 | pre_text1 | 预置字符1 | pre_text1 | varchar(100) |  | 字符串 (String) |
| 23 | pre_text2 | 预置字符2 | pre_text2 | varchar(100) |  | 字符串 (String) |
| 24 | pre_text3 | 预置字符3 | pre_text3 | varchar(100) |  | 字符串 (String) |
| 25 | pre_text4 | 预置字符4 | pre_text4 | varchar(100) |  | 字符串 (String) |
| 26 | pre_text5 | 预置字符5 | pre_text5 | varchar(100) |  | 字符串 (String) |
| 27 | pre_text6 | 预置字符6 | pre_text6 | varchar(100) |  | 字符串 (String) |
| 28 | pre_text7 | 预置字符7 | pre_text7 | varchar(100) |  | 字符串 (String) |
| 29 | pre_text8 | 预置字符8 | pre_text8 | varchar(100) |  | 字符串 (String) |
| 30 | pre_text9 | 预置字符9 | pre_text9 | varchar(100) |  | 字符串 (String) |
| 31 | pre_text10 | 预置字符10 | pre_text10 | varchar(100) |  | 字符串 (String) |
| 32 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 33 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 34 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
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