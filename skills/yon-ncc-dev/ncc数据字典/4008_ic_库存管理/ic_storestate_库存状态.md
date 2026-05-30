# |<<

**库存状态 (ic_storestate / nc.vo.ic.storestate.StoreStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2981.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_storestate | 库存状态主键 | pk_storestate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | vcode | 库存状态编码 | vcode | varchar(20) |  | 字符串 (String) |
| 4 | vname | 库存状态名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | iusability | 可用性 | iusability | int | √ | 可用性 (EInvUsability) |  | 1=可用; |