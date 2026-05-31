# |<<

**暂存数据 (scm_tempsave / nc.vo.scmpub.tempsave.TempSaveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ctempsaveid | 暂存id | ctempsaveid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | funcode | 功能节点 | funcode | varchar(50) |  | 字符串 (String) |
| 4 | data | 暂存数据 | data | image |  | BLOB (BLOB) |
| 5 | creator | 暂存人 | creator | varchar(20) |  | 用户 (user) |
| 6 | creationtime | 暂存时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |