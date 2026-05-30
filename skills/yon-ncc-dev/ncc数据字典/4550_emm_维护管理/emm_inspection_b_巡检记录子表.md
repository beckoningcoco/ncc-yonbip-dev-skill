# |<<

**巡检记录子表 (emm_inspection_b / nc.vo.emm.inspectrecord.InspectionBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inspection_b | 巡检记录子表pk | pk_inspection_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | route_seqnum | 路线序号 | route_seqnum | int |  | 整数 (Integer) |
| 6 | pk_equip | 设备编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 7 | pk_location | 位置编码 | pk_location | varchar(20) |  | 位置 (location) |
| 8 | pk_inspectstd | 巡检标准 | pk_inspectstd | varchar(20) |  | 巡检标准 (routeinspectstd) |
| 9 | pk_inspectstd_b | 巡检标准子表 | pk_inspectstd_b | varchar(20) |  | 巡检标准表体 (routeinspectstd_b) |
| 10 | std_rowno | 标准作业序号 | std_rowno | int |  | 整数 (Integer) |
| 11 | position | 部位 | position | varchar(50) |  | 字符串 (String) |
| 12 | item | 项目 | item | varchar(50) |  | 字符串 (String) |
| 13 | require | 标准要求 | require | varchar(50) |  | 字符串 (String) |
| 14 | property | 性质 | property | int |  | 性质 (propertyenum) |  | 1=定性; |