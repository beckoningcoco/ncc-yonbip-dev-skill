# |<<

**运费取数函数 (dm_formular / nc.vo.dm.formula.entity.FormularVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1731.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_formular | 运费取数函数实体 | pk_formular | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vcode | 编码 | vcode | varchar(40) |  | 字符串 (String) |
| 4 | vname | 名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | fpositionflag | 位置 | fpositionflag | int |  | 公式字段位置 (position) |  | 1=表头; |