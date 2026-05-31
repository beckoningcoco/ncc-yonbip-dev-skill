# |<<

**统计指标组 (nresa_staindigrp / nc.vo.mapub.indi.staindigrp.StaIndiGrpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3899.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_staindigrp | 统计指标组PK | pk_staindigrp | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_部门 (dept) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 统计指标组编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 统计指标组名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | nodetype | 节点类型 | nodetype | varchar(50) |  | 节点类型 (nodetypeenum) |  | 1=公共; |