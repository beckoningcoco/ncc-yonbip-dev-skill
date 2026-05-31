# |<<

**流程生产订单明细 (mm_mo / nc.vo.mmpac.pmo.pac0002.entity.PMOItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmoid | 流程生产订单明细 | cmoid | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | fitemstatus | 行状态 | fitemstatus | int |  | 流程生产订单行状态 (PMOFItemStatusEnum) | 0 | 0=自由; |