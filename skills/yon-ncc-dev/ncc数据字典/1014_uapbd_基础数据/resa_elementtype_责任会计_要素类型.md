# |<<

**责任会计_要素类型 (resa_elementtype / nc.vo.resa.elementsystem.ElementTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4899.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_elementtype | 要素类型主键 | pk_elementtype | char(20) | √ | 主键 (UFID) |
| 2 | eletypecode | 序号 | eletypecode | int |  | 整数 (Integer) |
| 3 | eletypename | 要素类型名称 | eletypename | varchar(20) |  | 多语文本 (MultiLangText) |
| 4 | balanorient | 余额方向 | balanorient | int |  | 余额方向 (enum) | 0 | 0=借; |