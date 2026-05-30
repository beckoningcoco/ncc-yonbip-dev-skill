# |<<

**增减方式 (pam_addreducestyle / nc.vo.am.addreducestyle.AddreduceStyleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4213.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_addreducestyle | 增减方式标识 | pk_addreducestyle | char(20) | √ | 主键 (UFID) |
| 2 | style_code | 增减方式编码 | style_code | varchar(40) |  | 字符串 (String) |
| 3 | style_name | 增减方式名称 | style_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | pre_flag | 是否预置 | pre_flag | varchar(50) |  | 是否预置 (enum) |  | 1=是; |