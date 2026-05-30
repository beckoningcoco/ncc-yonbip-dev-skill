# |<<

**物资及服务需求追加单/调价单 (pm_mateplanadd / nc.vo.pbm.materialplanadd.MaterialPlanAddHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4473.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matplanadd | 物资服务及需求追加单主键 | pk_matplanadd | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | bill_code | 追加单号 | bill_code | varchar(40) |  | 字符串 (String) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billStatus) |  | -1=自由态; |