# |<<

**成本对象 (cm_costobject / nc.vo.cm.costobject.entity.CostObjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1455.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccostobjectid | 成本对象表 | ccostobjectid | char(20) | √ | 主键 (UFID) |
| 2 | vcostobjcode | 成本对象编码 | vcostobjcode | varchar(200) | √ | 字符串 (String) |
| 3 | vcostobjname | 成本对象名称 | vcostobjname | varchar(700) | √ | 多语文本 (MultiLangText) |
| 4 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 工厂最新版本 | pk_org | char(20) | √ | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂 | pk_org_v | char(20) | √ | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | vmocode | 订单号 | vmocode | varchar(40) |  | 字符串 (String) |
| 8 | vmobatchcode | 生产批次号 | vmobatchcode | varchar(30) |  | 字符串 (String) |
| 9 | itype | 属性 | itype | int | √ | 成本对象属性 (CostObjectTypeEnum) |  | 0=归集; |