# |<<

**侧边栏页签 (pub_besidepage / nc.vo.pub.beside.BesidePageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4713.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_besidepage | 侧边栏页签主键 | pk_besidepage | char(20) | √ | 主键 (UFID) |
| 2 | mdid | 元数据 | mdid | varchar(200) |  | 字符串 (String) |
| 3 | funcode | 功能节点 | funcode | varchar(50) | √ | 字符串 (String) |
| 4 | pagename | 页签名称 | pagename | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | pagecode | 页签编码 | pagecode | varchar(40) | √ | 字符串 (String) |
| 6 | extendtype | 扩展类型 | extendtype | int |  | 扩展类型 (pageextendtype) |  | 1=前; |