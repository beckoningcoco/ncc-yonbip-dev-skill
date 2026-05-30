# |<<

**路线明细 (emm_rt_detail / nc.vo.emm.route.RouteDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1831.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route_detail | 路线明细主键 | pk_route_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_standard | 巡检标准 | pk_standard | varchar(20) |  | 巡检标准 (routeinspectstd) |
| 6 | pk_measpoint_b | 测量点 | pk_measpoint_b | varchar(20) |  | 测量点明细 (measpointBodyVO) |
| 7 | pk_measpoint | 测量点表头 | pk_measpoint | varchar(20) |  | 测量点 (measpointHeadVO) |
| 8 | pk_route_summary | 路线概述主键 | pk_route_summary | varchar(20) |  | 路线概述 (RouteSummaryVO) |
| 9 | pk_standard_b | 巡检标准子表 | pk_standard_b | varchar(20) |  | 巡检标准表体 (routeinspectstd_b) |
| 10 | pk_equip | 设备编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 11 | pk_location | 位置编码 | pk_location | varchar(20) |  | 位置 (location) |
| 12 | coordinate | 坐标点 | coordinate | varchar(100) |  | 字符串 (String) |
| 13 | coordinate_desc | 坐标说明 | coordinate_desc | varchar(200) |  | 字符串 (String) |