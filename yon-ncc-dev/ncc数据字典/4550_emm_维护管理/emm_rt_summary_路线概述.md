# |<<

**路线概述 (emm_rt_summary / nc.vo.emm.route.RouteSummaryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1832.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route_summary | 路线概述主键 | pk_route_summary | char(20) | √ | 主键 (UFID) |
| 2 | sequence_num | 序号 | sequence_num | int |  | 整数 (Integer) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 5 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 6 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 8 | pk_standard | 巡检标准 | pk_standard | varchar(20) |  | 巡检标准 (routeinspectstd) |
| 9 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 10 | src_bill_type | 来源单据类型 | src_bill_type | varchar(4) |  | 字符串 (String) |
| 11 | src_transitype | 来源交易类型 | src_transitype | varchar(30) |  | 字符串 (String) |
| 12 | src_pk_transitype | 来源交易类型主键 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 13 | src_pk_bill | 来源单据表头主键 | src_pk_bill | varchar(20) |  | 字符串 (String) |
| 14 | src_pk_bill_b | 来源单据表体主键 | src_pk_bill_b | varchar(20) |  | 字符串 (String) |
| 15 | coordinate | 坐标点 | coordinate | varchar(100) |  | 字符串 (String) |
| 16 | coordinate_desc | 坐标说明 | coordinate_desc | varchar(200) |  | 字符串 (String) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |