# |<<

**知识关联关系 (ssckm_relation / nc.vo.ssckm.kmrelation.KmRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5562.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | 主键 | pk_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_knowledge | 知识主键 | pk_knowledge | varchar(20) |  | 字符串 (String) |
| 3 | appcode | 小应用编码 | appcode | varchar(50) |  | 字符串 (String) |
| 4 | appid | 小应用主键 | appid | varchar(20) |  | 字符串 (String) |
| 5 | knowledgeurl | 知识URL | knowledgeurl | varchar(300) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |