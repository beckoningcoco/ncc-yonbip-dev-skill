# |<<

**客商档案 (tb_supplier / nc.vo.tb.dimdocpub.MdSupplierVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5741.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 5 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_parent | 上级成员 | pk_parent | varchar(20) |  | 客商档案 (tb_supplier) |
| 7 | supply | 供应商 | supply | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | cust | 客户 | cust | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | insidesupplier | 内部客商 | insidesupplier | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_insideunit | 对应内部单位 | pk_insideunit | varchar(20) |  | 组织 (org) |
| 11 | relationcompany | 关联公司类型 | relationcompany | int |  | 关联公司类型 (relationcompany) |  | 1=合营; |