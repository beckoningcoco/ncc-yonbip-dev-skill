# |<<

**价格项 (prm_pricetype / nc.vo.price.pricetype.entity.PriceTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4668.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricetype | 价格项ID | pk_pricetype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | vpricetypecode | 价格项编码 | vpricetypecode | varchar(30) | √ | 字符串 (String) |
| 4 | vpricetypename | 价格项名称 | vpricetypename | varchar(76) | √ | 多语文本 (MultiLangText) |