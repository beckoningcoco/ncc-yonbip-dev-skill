# |<<

**定价条件 (prm_pricecondition / nc.vo.price.pricecondition.entity.PriceConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricecondition | 定价条件主键 | pk_pricecondition | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | vcode | 定价条件编号 | vcode | varchar(30) |  | 字符串 (String) |
| 5 | vname | 定价条件名称 | vname | varchar(30) |  | 多语文本 (MultiLangText) |
| 6 | pk_conditionsource | 条件来源 | pk_conditionsource | varchar(20) |  | 条件来源 (PriceCondSource) |
| 7 | forigattributeflag | 条件来源属性 | forigattributeflag | int |  | 条件来源类型 (ConditionSourceType) |  | 0=参照选择; |