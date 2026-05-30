# |<<

**成本结转层次 (cm_tranlevel / nc.vo.cm.tranlevel.TranLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1516.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctranlevelid | 计算结转层次 | ctranlevelid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(50) |  | 字符串 (String) |
| 6 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | nlevel | 层次 | nlevel | int |  | 整数 (Integer) |
| 8 | itranstatus | 结转状态 | itranstatus | int |  | 结转状态 (coststatusenum) |  | 1=未结转; |