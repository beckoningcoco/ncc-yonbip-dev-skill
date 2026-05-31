# |<<

**定价过程主实体 (prm_priceprocess / nc.vo.price.priceprocess.entity.PriceProcessHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_priceprocess | 定价过程主实体 | pk_priceprocess | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | vcode | 定价过程编码 | vcode | varchar(30) |  | 字符串 (String) |
| 5 | vname | 定价过程名称 | vname | varchar(30) |  | 多语文本 (MultiLangText) |
| 6 | csrcpriceprocessid | 来源定价过程主键 | csrcpriceprocessid | varchar(20) |  | 主键 (UFID) |
| 7 | csrcsaleorgid | 来源销售组织主键 | csrcsaleorgid | varchar(20) |  | 主键 (UFID) |