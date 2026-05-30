# |<<

**扩展点 (pub_bsexpoint / nc.impl.pubapp.plugin.ExtendPointVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4720.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bsexpoint | 扩展点主键 | pk_bsexpoint | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | itfname | 扩展接口名 | itfname | varchar(50) | √ | 字符串 (String) |
| 5 | pk_bscomponent | 所属组件 | pk_bscomponent | char(20) |  | 主键 (UFID) |
| 6 | replacable | 是否可替换 | replacable | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | sync | 同步属性 | sync | varchar(50) |  | 同步/异步 (sync) |  | SYNC=仅支持同步; |