# |<<

**物料税类 (bd_mattaxes / nc.vo.bd.material.mattaxes.MatTaxesVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/911.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mattaxes | 物料税类主键 | pk_mattaxes | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | mattaxescode | 税类编码 | mattaxescode | varchar(40) |  | 字符串 (String) |
| 5 | mattaxesname | 税类名称 | mattaxesname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | remarks | 备注 | remarks | varchar(200) |  | 备注 (Memo) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |