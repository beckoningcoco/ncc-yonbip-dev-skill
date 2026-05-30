# |<<

**辅助维 (tb_assdim / nc.vo.tb.dimdocpub.MdAssDimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_parent | 上级成员 | pk_parent | varchar(20) |  | 辅助维 (tb_assdim) |
| 5 | issystem | 是否预置 | issystem | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用停用 (enableState) | 2 | 2=已启用; |