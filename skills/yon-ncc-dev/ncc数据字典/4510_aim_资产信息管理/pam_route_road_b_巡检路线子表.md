# |<<

**巡检路线子表 (pam_route_road_b / nc.vo.aim.routeroad.RouteRoadBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4320.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route_road_b | 巡检路线表体主键 | pk_route_road_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | sequence_num | 序号 | sequence_num | int |  | 整数 (Integer) |
| 7 | pk_equip | 资产编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 8 | pk_location | 位置编码 | pk_location | varchar(20) |  | 位置 (location) |
| 9 | pk_standard | 巡检标准 | pk_standard | varchar(20) |  | 巡检标准 (routeinspectstd) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |