# |<<

**网银信息模板字段 (bd_templetitem / nc.vo.bd.netbanktemplate.TempletitemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_templetitem | 网银信息模板字段主键 | pk_templetitem | char(20) | √ | 主键 (UFID) |
| 2 | templetitemname | 字段名 | templetitemname | varchar(50) |  | 字符串 (String) |
| 3 | isvisible | 是否显示 | isvisible | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | isempty | 是否必输 | isempty | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | displayname | 显示名 | displayname | varchar(50) |  | 字符串 (String) |
| 6 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |