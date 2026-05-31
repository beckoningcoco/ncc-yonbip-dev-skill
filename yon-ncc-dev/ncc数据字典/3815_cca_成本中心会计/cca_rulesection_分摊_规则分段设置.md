# |<<

**分摊_规则分段设置 (cca_rulesection / nc.vo.cca.rulescheme.allocruleset.RuleSectionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1304.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rulesection | 主键 | pk_rulesection | char(20) | √ | 主键 (UFID) |
| 2 | pk_allocruleset | 分摊规则设置主键 | pk_allocruleset | varchar(20) |  | 分摊_分摊规则设置 (allocruleset) |
| 3 | code | 分段编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 分段名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_sendorg | 发送方组织 | pk_sendorg | varchar(20) |  | 组织 (org) |
| 8 | pk_acceptaccasoa | 接收科目 | pk_acceptaccasoa | varchar(20) |  | 会计科目 (accasoa) |
| 9 | pk_accasoagrp | 科目组 | pk_accasoagrp | varchar(50) |  | 字符串 (String) |
| 10 | cfactoridgrp | 要素组 | cfactoridgrp | varchar(20) |  | 核算要素组 (factorgroup) |
| 11 | sendrule | 发送规则 | sendrule | int |  | 发送规则 (sendruleenum) |  | 0=账面数; |