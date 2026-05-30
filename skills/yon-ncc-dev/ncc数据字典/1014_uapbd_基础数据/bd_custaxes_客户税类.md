# |<<

**客户税类 (bd_custaxes / nc.vo.bd.cust.custaxes.CusTaxesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custaxes | 客户税类主键 | pk_custaxes | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | custtaxescode | 税类编码 | custtaxescode | varchar(40) |  | 字符串 (String) |
| 5 | custtaxesname | 税类名称 | custtaxesname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | remarks | 备注 | remarks | varchar(1024) |  | 字符串 (String) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |