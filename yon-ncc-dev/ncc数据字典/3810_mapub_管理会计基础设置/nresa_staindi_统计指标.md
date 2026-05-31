# |<<

**统计指标 (nresa_staindi / nc.vo.mapub.indi.staindi.StaIndiVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3898.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_staindi | 统计指标pk | pk_staindi | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_部门 (dept) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | code | 统计指标编码 | code | varchar(20) |  | 字符串 (String) |
| 5 | name | 统计指标名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_staindigrp | 所属指标组 | pk_staindigrp | varchar(20) |  | 统计指标组 (staindigrp) |
| 7 | indicatorstype | 指标类型 | indicatorstype | varchar(10) |  | 指标类型 (inditypeenum) |  | 1=固定值; |