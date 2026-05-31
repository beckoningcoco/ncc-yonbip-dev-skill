# |<<

**消息模板 (pub_msgtemp / nc.message.templet.vo.MsgtempletVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4745.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_templet | 主键 | pk_templet | char(20) | √ | 主键 (UFID) |
| 2 | tempcode | 模板编码 | tempcode | varchar(50) |  | 字符串 (String) |
| 3 | langcode | 模板语种 | langcode | varchar(20) |  | 字符串 (String) |
| 4 | tempname | 模板名称 | tempname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | tempdscrpt | 模板描述 | tempdscrpt | varchar(50) |  | 字符串 (String) |
| 6 | messagetitle | 消息表体 | messagetitle | varchar(200) |  | 字符串 (String) |
| 7 | textcontent | 文本内容 | textcontent | varchar(1000) |  | 字符串 (String) |
| 8 | pk_outtemplet | 输出模板主键 | pk_outtemplet | char(20) |  | 主键 (UFID) |
| 9 | typecode | 类型编码 | typecode | varchar(50) |  | 字符串 (String) |
| 10 | attachtype | 附件类型 | attachtype | int |  | 整数 (Integer) |
| 11 | attachdoctype | 文件文档类型 | attachdoctype | int |  | 整数 (Integer) |
| 12 | attdeftype | 消息附件定义方式 | attdeftype | varchar(20) |  | 字符串 (String) |
| 13 | pk_temptype | 模板类型 | pk_temptype | varchar(20) | √ | 消息模板分类 (msgtmptype) |