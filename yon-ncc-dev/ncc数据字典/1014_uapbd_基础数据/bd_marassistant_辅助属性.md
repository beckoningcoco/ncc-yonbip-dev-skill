# |<<

**辅助属性 (bd_marassistant / nc.vo.bd.material.marassistant.MarAssistantVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/876.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marassistant | 辅助属性主键 | pk_marassistant | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_集团 (group) |
| 4 | pk_marasstframe | 所属辅助属性结构 | pk_marasstframe | char(20) | √ | 辅助属性结构 (marasstframe) |
| 5 | pk_userdefitem | 用户定义属性主键 | pk_userdefitem | char(20) | √ | 用户定义属性 (userdefitem) |
| 6 | code | 辅助属性编码 | code | varchar(40) | √ | 字符串 (String) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |