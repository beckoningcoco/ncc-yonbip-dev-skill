# |<<

**社保信息 (hi_psndoc_bminfo / nc.vo.hi.psndoc.BminfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2556.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | bmclass | 险种 | bmclass | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_org | 社保组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | bmaccount | 社保账号 | bmaccount | varchar(50) |  | 字符串 (String) |
| 5 | paylocation | 缴交地 | paylocation | varchar(20) |  | 行政区划 (region) |
| 6 | accountdate | 开户日期 | accountdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | accountstate | 账户状态 | accountstate | int |  | 社保状态 (bmstate) |  | 0=正常; |