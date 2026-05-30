# |<<

**生产计划体系 (org_productionplan / nc.vo.org.productionplan.ProductionPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_productionplan | 生产计划体系主键 | pk_productionplan | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |