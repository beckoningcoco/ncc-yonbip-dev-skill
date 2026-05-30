# |<<

**条件来源 (prm_conditionsrc / nc.vo.price.pricecondition.entity.PriceCondSourceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_conditionsource | 价格条件源表主键 | pk_conditionsource | char(20) | √ | 主键 (UFID) |
| 2 | vcode | 价格条件来源编码 | vcode | varchar(30) |  | 字符串 (String) |
| 3 | vname | 价格条件来源名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | fconditiontypeflag | 条件取值类型 | fconditiontypeflag | int | √ | 条件取值类型 (ConditionValueType) |  | 0=直接折扣; |