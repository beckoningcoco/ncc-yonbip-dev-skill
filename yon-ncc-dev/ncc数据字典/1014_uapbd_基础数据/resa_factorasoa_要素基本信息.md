# |<<

**要素基本信息 (resa_factorasoa / nc.vo.resa.factor.FactorAsoaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4905.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_factorasoa | 标识 | pk_factorasoa | char(20) | √ | 主键 (UFID) |
| 2 | pk_factorchart | 要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 3 | pk_factor | 关联核算要素 | pk_factor | varchar(20) |  | 核算要素 (Factor) |
| 4 | endflag | 末级标志 | endflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | dispname | 显示名称 | dispname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | allowclose | 提前关账 | allowclose | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |