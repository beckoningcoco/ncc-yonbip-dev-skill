# |<<

**银行授信类别列表 (batm_bankprotocolcctype / nc.vo.batm.ccvo.BankprotocolCctypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/209.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cctype | 授信类别主键 | pk_cctype | char(20) | √ | 主键 (UFID) |
| 2 | cctypename | 授信类别名称 | cctypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | cctypevalue | 授信类别数值 | cctypevalue | varchar(50) |  | 字符串 (String) |
| 4 | pk_bankprotocol | 银行授信主键 | pk_bankprotocol | varchar(50) |  | 字符串 (String) |