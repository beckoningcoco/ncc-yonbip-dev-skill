# |<<

**业务对象特性属性 (lcdp_busiattr / nc.vo.lcdp.pub.feature.BusiAttrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3542.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiattr | pk_busiattr | pk_busiattr | char(20) | √ | 主键 (UFID) |
| 2 | code | 字段编码 | code | varchar(20) |  | 字符串 (String) |
| 3 | name | 字段显示名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | type_style | 字段样式 | type_style | varchar(50) |  | 字段样式 (lcdp_type_style) |  | 300=SINGLE; |