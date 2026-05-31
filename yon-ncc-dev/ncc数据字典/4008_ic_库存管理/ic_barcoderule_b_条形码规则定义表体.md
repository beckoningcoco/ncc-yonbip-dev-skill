# |<<

**条形码规则定义表体 (ic_barcoderule_b / nc.vo.ic.barcoderule.BarCodeRuleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2885.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbarcoderulbid | 条形码规则表体主键 | cbarcoderulbid | varchar(50) | √ | 字符串 (String) |
| 2 | iinceptlocation | 起始位置 | iinceptlocation | int |  | 整数 (Integer) |
| 3 | ilength | 长度 | ilength | int |  | 整数 (Integer) |
| 4 | iattritbute | 对象属性 | iattritbute | varchar(50) | √ | 对象属性 (BarCodeRuleObjectTypeEnum) |  | 1=档案类; |