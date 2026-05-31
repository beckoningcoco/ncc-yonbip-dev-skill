# |<<

**产出物交付单 (pm_protranfacard / nc.vo.ppm.producttranfacard.ProTranFaHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4517.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_protranfacard | 产出物交付单主键 | pk_protranfacard | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | bill_code | 单据号 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 产出物交付单状态 (producttranfastatus) |  | -1=自由态; |