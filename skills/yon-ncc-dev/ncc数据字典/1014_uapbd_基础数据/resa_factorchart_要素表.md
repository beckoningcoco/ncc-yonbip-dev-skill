# |<<

**要素表 (resa_factorchart / nc.vo.resa.factor.FactorChartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4907.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factorchart | 标识 | pk_factorchart | char(20) | √ | 主键 (UFID) |
| 2 | factorchartcode | 要素表编码 | factorchartcode | varchar(50) |  | 字符串 (String) |
| 3 | factorchartname | 要素表名称 | factorchartname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_factorsystem | 要素体系 | pk_factorsystem | varchar(20) |  | 责任会计_要素体系 (elementsystem) |
| 6 | controllevel | 控制级次 | controllevel | int |  | 科目控制级次 (accctrllevel) |  | -1=控制到末级; |