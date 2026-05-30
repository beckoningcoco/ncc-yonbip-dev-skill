# |<<

**保险单子表 (pam_insurance_b / nc.vo.aum.insur.insurance.InsuranceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4266.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_insurance_b | 保险单子表主键 | pk_insurance_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) | √ | 设备卡片 (EquipHeadVO) |
| 7 | money_insurance_org | 保险金额 | money_insurance_org | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 8 | money_insurance_global | 保险金额(全局) | money_insurance_global | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 9 | money_insurance_group | 保险金额(集团) | money_insurance_group | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 10 | begin_date | 保险开始日期 | begin_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 11 | end_date | 保险结束日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 12 | status_date_before | 变动前状态日期 | status_date_before | char(19) |  | 日期 (UFDate) |
| 13 | status_date_after | 变动后状态日期 | status_date_after | char(19) |  | 日期 (UFDate) |
| 14 | pk_status_before | 变动前设备状态 | pk_status_before | varchar(20) |  | 设备状态 (StatusVO) |
| 15 | pk_status_after | 变动后设备状态 | pk_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 16 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 17 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 18 | close_flag | 关闭 | close_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | payable_flag | 供应商应付 | payable_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | pre_text1 | 预置字符1 | pre_text1 | varchar(128) |  | 字符串 (String) |
| 21 | pre_text2 | 预置字符2 | pre_text2 | varchar(128) |  | 字符串 (String) |
| 22 | pre_text3 | 预置字符3 | pre_text3 | varchar(128) |  | 字符串 (String) |
| 23 | pre_text4 | 预置字符4 | pre_text4 | varchar(128) |  | 字符串 (String) |
| 24 | pre_text5 | 预置字符5 | pre_text5 | varchar(128) |  | 字符串 (String) |
| 25 | pre_text6 | 预置字符6 | pre_text6 | varchar(128) |  | 字符串 (String) |
| 26 | pre_text7 | 预置字符7 | pre_text7 | varchar(128) |  | 字符串 (String) |
| 27 | pre_text8 | 预置字符8 | pre_text8 | varchar(128) |  | 字符串 (String) |
| 28 | pre_text9 | 预置字符9 | pre_text9 | varchar(128) |  | 字符串 (String) |
| 29 | pre_text10 | 预置字符10 | pre_text10 | varchar(128) |  | 字符串 (String) |
| 30 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |