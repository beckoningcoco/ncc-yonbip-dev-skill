# |<<

**巡检规则 (emm_route / nc.vo.emm.route.RouteHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_route | 巡检规则主表pk | pk_route | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | bill_code | 编码 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | route_name | 名称 | route_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 7 | bill_type | 单据类型 | bill_type | varchar(4) |  | 字符串 (String) |
| 8 | route_cycle | 周期 | route_cycle | int |  | 整数 (Integer) |
| 9 | cycle_unit | 周期单位 | cycle_unit | int |  | 周期单位 (Cycleunit) |  | 1=小时; |