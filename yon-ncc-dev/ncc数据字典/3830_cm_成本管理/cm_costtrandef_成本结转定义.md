# |<<

**成本结转定义 (cm_costtrandef / nc.vo.cm.costtrandef.entity.CostTranDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1457.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccosttrandefid | 成本结转定义表 | ccosttrandefid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | iscraptype | 结转废品成本 | iscraptype | int |  | 结转废品成本枚举 (TranWasteTypeEnum) | 1 | 1=不计算; |