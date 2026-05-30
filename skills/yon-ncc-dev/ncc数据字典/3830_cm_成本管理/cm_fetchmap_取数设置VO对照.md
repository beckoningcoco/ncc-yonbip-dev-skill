# |<<

**取数设置VO对照 (cm_fetchmap / nc.vo.cm.bd.bd0112.FetchsetExchangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1474.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | fetchmap | 对照主键 | fetchmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂（多版本） | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ifetchmaptype | 对照类型 | ifetchmaptype | int |  | 对照类型 (exchangeTypeEnum) |  | 1=材料出库单; |