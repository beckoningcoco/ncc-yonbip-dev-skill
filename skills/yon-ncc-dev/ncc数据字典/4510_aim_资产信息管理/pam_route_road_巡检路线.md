# |<<

**巡检路线 (pam_route_road / nc.vo.aim.routeroad.RouteRoadHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4319.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route_road | 巡检路线主键 | pk_route_road | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |