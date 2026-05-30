# |<<

**设计须知 (hrpub_rptdef_pre / nccloud.vo.hrpub.rptdef.RptDefPreVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2757.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | url | 环境地址 | url | varchar(50) |  | 字符串 (String) |
| 3 | userid | 用户 | userid | varchar(50) |  | 字符串 (String) |
| 4 | readstatus | 已读 | readstatus | varchar(50) |  | 字符串 (String) |
| 5 | deploystatus | 已配置 | deploystatus | varchar(50) |  | 字符串 (String) |
| 6 | appcode | 功能节点 | appcode | varchar(50) |  | 字符串 (String) |