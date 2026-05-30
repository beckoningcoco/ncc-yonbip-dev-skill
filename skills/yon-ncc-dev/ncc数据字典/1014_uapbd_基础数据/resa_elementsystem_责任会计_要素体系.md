# |<<

**责任会计_要素体系 (resa_elementsystem / nc.vo.resa.elementsystem.ElementSystemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4898.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_elementsystem | 要素体系主键 | pk_elementsystem | char(20) | √ | 主键 (UFID) |
| 2 | elesyscode | 编码 | elesyscode | varchar(10) |  | 字符串 (String) |
| 3 | elesysname | 名称 | elesysname | varchar(20) |  | 多语文本 (MultiLangText) |
| 4 | encoderule | 要素编码规则 | encoderule | varchar(100) |  | 字符串 (String) |
| 5 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |