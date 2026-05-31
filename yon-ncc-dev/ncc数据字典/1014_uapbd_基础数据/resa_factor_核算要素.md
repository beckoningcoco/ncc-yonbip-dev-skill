# |<<

**核算要素 (resa_factor / nc.vo.resa.factor.FactorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factor | 标识 | pk_factor | char(20) | √ | 主键 (UFID) |
| 2 | pk_factorchart | 创建要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 3 | factorcode | 要素编码 | factorcode | varchar(50) | √ | 字符串 (String) |
| 4 | factorname | 要素名称 | factorname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | pk_originalfactor | 原始要素标识 | pk_originalfactor | varchar(20) |  | 字符串 (String) |
| 6 | pk_factortype | 要素类型 | pk_factortype | varchar(20) |  | 责任会计_要素类型 (elementtype) |
| 7 | balanorient | 要素方向 | balanorient | varchar(1) | √ | 借贷方向 (direction) |  | D=借; |