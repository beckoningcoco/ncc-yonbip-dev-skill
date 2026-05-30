# |<<

**要素关联信息历史 (resa_facasoahistory / nc.vo.resa.factor.history.FactorAsoaHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4901.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_facasoahistory | 标识 | pk_facasoahistory | char(40) | √ | 主键 (UFID) |
| 2 | pk_factorasoa | 要素关联信息标识 | pk_factorasoa | char(20) |  | 主键 (UFID) |
| 3 | pk_factorchart | 要素表 | pk_factorchart | char(20) |  | 主键 (UFID) |
| 4 | pk_factor | 关联核算要素 | pk_factor | char(20) |  | 主键 (UFID) |
| 5 | endflag | 末级标志 | endflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | dispname | 显示名称 | dispname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | allowclose | 提前关账 | allowclose | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |