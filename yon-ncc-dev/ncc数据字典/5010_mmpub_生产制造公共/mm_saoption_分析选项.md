# |<<

**分析选项 (mm_saoption / nc.vo.mmpub.setanalysis.entity.SaOptionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3774.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_option | 分析选项主键 | pk_option | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | singleset | 单层齐套 | singleset | varchar(1) |  | 布尔类型 (UFBoolean) |
| 6 | multiset | 多层齐套 | multiset | varchar(1) |  | 布尔类型 (UFBoolean) |
| 7 | stock | 存量 | stock | varchar(1) |  | 布尔类型 (UFBoolean) |
| 8 | po | 计划订单 | po | varchar(1) |  | 布尔类型 (UFBoolean) |
| 9 | mps | 主生产计划 | mps | varchar(1) |  | 布尔类型 (UFBoolean) |
| 10 | scmpray | 请购单 | scmpray | varchar(1) |  | 布尔类型 (UFBoolean) |
| 11 | scmpo | 采购订单 | scmpo | varchar(1) |  | 布尔类型 (UFBoolean) |
| 12 | wwbill | 委外订单 | wwbill | varchar(1) |  | 布尔类型 (UFBoolean) |
| 13 | transp | 调入申请 | transp | varchar(1) |  | 布尔类型 (UFBoolean) |
| 14 | transa | 调拨订单 | transa | varchar(1) |  | 布尔类型 (UFBoolean) |
| 15 | fdemandtype | 需求类型 | fdemandtype | int |  | 需求单据类型 (SaDemandType) |  | 1=备料计划; |