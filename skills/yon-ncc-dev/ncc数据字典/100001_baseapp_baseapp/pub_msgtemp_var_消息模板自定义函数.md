# |<<

**消息模板自定义函数 (pub_msgtemp_var / nc.message.templet.vo.MsgtempvarVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4747.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tmpvar | 主键 | pk_tmpvar | char(20) | √ | 主键 (UFID) |
| 2 | pk_temptype | 消息模板类别主键 | pk_temptype | char(20) | √ | 消息模板分类 (msgtmptype) |
| 3 | varcode | 变量编码 | varcode | varchar(50) | √ | 字符串 (String) |
| 4 | name | 变量名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | resid | 多语资源 | resid | varchar(50) |  | 字符串 (String) |