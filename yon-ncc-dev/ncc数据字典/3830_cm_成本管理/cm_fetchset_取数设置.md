# |<<

**取数设置 (cm_fetchset / nc.vo.cm.fetchset.entity.FetchSetHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1475.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfetchsetid | 取数设置 | cfetchsetid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ifetchtype | 取数类型 | ifetchtype | int |  | 取数类型 (fetchTypeEnum) |  | 1=材料出库; |