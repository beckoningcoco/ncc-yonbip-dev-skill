# |<<

**巡检标准表体 (emm_routeinspectstd_b / nc.vo.emm.inspectstd.RouteInspStdBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_routeinspstd_b | 巡检标准表体主键 | pk_routeinspstd_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | rowno | 序号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | position | 部位 | position | varchar(50) |  | 字符串 (String) |
| 7 | item | 项目 | item | varchar(50) |  | 字符串 (String) |
| 8 | require | 标准要求 | require | varchar(50) |  | 字符串 (String) |
| 9 | property | 性质 | property | int |  | 性质 (propertyenum) |  | 1=定性; |