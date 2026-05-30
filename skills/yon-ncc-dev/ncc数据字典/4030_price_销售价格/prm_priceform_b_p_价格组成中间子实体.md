# |<<

**价格组成中间子实体 (prm_priceform_b_p / nc.vo.price.pub.entity.PriceFormTempBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceform_b | 价格组成子实体 | pk_priceform_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_formindex | 价格组成项索引 | pk_formindex | varchar(20) |  | 字符串 (String) |
| 3 | fformtypeflag | 价格组成项类型 | fformtypeflag | int |  | 价格组成项类型2 (PriceFormTempTypeEnum) |  | 1=价目表; |