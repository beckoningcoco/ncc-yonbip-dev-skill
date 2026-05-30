# |<<

**辅助属性结构 (bd_marasstframe / nc.vo.bd.material.marasstframe.MarAsstFrameVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/877.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marasstframe | 辅助属性结构主键 | pk_marasstframe | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织_集团 (group) |
| 4 | code | 辅助属性结构编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 辅助属性结构名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | vnote | 备注 | vnote | varchar(400) |  | 备注 (Memo) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |