# |<<

**外部系统信息 (xx_exsystem / nc.vo.pfxx.exsystem.ExsystemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6386.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exsystem | 外部系统信息主键 | pk_exsystem | char(20) | √ | 主键 (UFID) |
| 2 | exsystemcode | 外部系统编码 | exsystemcode | varchar(40) | √ | 字符串 (String) |
| 3 | exsystemname | 外部系统名称 | exsystemname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | deftranslator | 默认匹配规则 | deftranslator | decimal(1, 0) | √ | 匹配规则 (enum) |  | 0=仅按对照表; |