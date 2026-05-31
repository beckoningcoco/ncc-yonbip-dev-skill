# |<<

**定价过程子实体 (prm_priceprocess_b / nc.vo.price.priceprocess.entity.PriceProcessBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4667.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceprocess_b | 定价过程子实体 | pk_priceprocess_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) | √ | 主键 (UFID) |
| 3 | ialculateorder | 计算顺序 | ialculateorder | int |  | 整数 (Integer) |
| 4 | pk_pricecondition | 定价条件编码 | pk_pricecondition | varchar(20) |  | 定价条件 (PriceCondition) |