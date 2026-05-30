# |<<

**临时租入单子表 (ali_temporary_b / nc.vo.ali.leasein.TempLeaseInBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/72.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leasein_b | 临时租入单子表主键 | pk_leasein_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | pk_freecustom | 散户 | pk_freecustom | varchar(20) |  | 散户 (freecustom) |
| 7 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 8 | equip_name | 设备名称 | equip_name | varchar(400) |  | 字符串 (String) |
| 9 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 10 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 11 | amount | 数量 | amount | int |  | 整数 (Integer) |
| 12 | curr_origin_price | 原币单价 | curr_origin_price | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 13 | curr_origin_money | 原币金额 | curr_origin_money | decimal(28, 8) |  | 金额 (UFMoney) |  | [0 , ] |
| 14 | lease_sta_date | 租赁开始日期 | lease_sta_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 15 | lease_end_date | 租赁结束日期 | lease_end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 16 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 17 | pk_proj_task | 项目任务 | pk_proj_task | varchar(20) |  | 项目任务 (WBS) |
| 18 | settle_flag | 已结算 | settle_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |